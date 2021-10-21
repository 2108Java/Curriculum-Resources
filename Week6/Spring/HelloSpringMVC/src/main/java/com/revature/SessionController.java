package com.revature;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("SessionController")
@RequestMapping("/security")
public class SessionController {
	
	/*
	 * Request 
	 * 		URI/URL 
	 * 		Method/Verb 
	 * 		Header - provide cookies if available to the server
	 * 		Body 
	 * 
	 * Response
	 * 		Status Code 
	 * 		Header - server can either create or check an existing sesssion. 
	 * 		Body 
	 * 		 
	 * 		
	 */
	
	@PostMapping(value = "/login", params = {"username"})
	public @ResponseBody String getSession(HttpServletRequest request, String username) { //automatically inject the request object into this method!
		
		/*
		 * What did I need to setup a session?
		 * 
		 * 		Context: 
		 * 			Session attributes. 
		 * 			Request and Response 
		 * 
		 * 		What do I need from my request?
		 * 			check if a session already exists! 
		 * 
		 */
		
		String response = "";
		HttpSession session = request.getSession(false); //check if session exitsts!
		
		if(session == null) {
			//no session exists at the moment!
			//create a session 
			session = request.getSession(true); //creating a session because one doesn't exist!
			session.setAttribute("access", true);
			session.setAttribute("user", username);
			response = "Welcome we created a new session for you : " + username;
		}else {
			
			if(session.getAttribute("access") == null || session.getAttribute("user") == null ) {
				session.setAttribute("access", true);
				session.setAttribute("user", username);
				response = "session exists but you got the wrong kind!";
				
			}
			
		}
		
		
		
		return response;
	}
	
	@GetMapping(value = "/checkSession")
	public @ResponseBody String checkSession(HttpSession session) {
		
		String response = "";
		
		if(session != null) {//check if the session is null, this never happens because Spring creates one always!
			
			response = "No session exists!";
			
			if(session.getAttribute("access") == null || session.getAttribute("user") == null ) {
				response = "This is an invalid session";
				
			}else { //if the sessino is not null and has a valid user attribute 
				
				String name = (String) session.getAttribute("user");
				response = name;
			}
		}
		return "true";
	}
	
	public String endSession() {
		return "";
	}

}

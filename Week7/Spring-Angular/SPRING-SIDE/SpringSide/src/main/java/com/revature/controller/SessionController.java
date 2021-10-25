package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Message;
import com.revature.model.User;

@RestController("Session Controller")
@CrossOrigin(origins = {"http://localhost:4200"}, allowCredentials = "true") //before, Spring would not send the session cookie back! 
public class SessionController {
	
	@GetMapping(value = "/hello")
	public Message hello() {
		return new Message("Hello");
	}
	
	@GetMapping(value = "/login")
	public Message createSession(HttpSession session) {
		
		User u = new User("McBob", true);
		
		session.setAttribute("user", u);
		
		return new Message("You've logged in!");
	}
	
	@PostMapping(value = "/login")
	public Message createSessionWithPost(HttpSession session) {
		
		User u = new User("McBob", true);
		
		session.setAttribute("user", u);
		
		return new Message("You've logged in!");
	}
	
	@GetMapping(value = "/logout")
	public Message invalidateSession(HttpSession session) {
		
		session.invalidate(); //this will remove all the attributes from the session!
		
		return new Message("You've logged out!");
	}
	

	@GetMapping(value = "/checkSession")
	public User validateSession(HttpSession session) {
		
		User u = null;
		
		if(session.getAttribute("user") == null) {
			//login method was not reached first or they've logged out already!
			u = new User("Fakey fake", false);
		}else {
			u = (User) session.getAttribute("user");
		}
		
		return u; //either fakey fake or an actual user!
	}

}

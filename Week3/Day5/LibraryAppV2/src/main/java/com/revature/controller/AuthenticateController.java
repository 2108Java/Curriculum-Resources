package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import com.revature.models.User;
import com.revature.service.AuthenticateService;
import com.revature.service.UserService;

import io.javalin.http.Context;

public class AuthenticateController {
	
	//My Controller is going to need the context
	//The context stores the http request and response information. 
	
	//use our service layer to verify the user and set up a session!
	
	
	private AuthenticateService authService;
	private UserService userService;


	
	
	public AuthenticateController(AuthenticateService authService, UserService userService) {
		super();
		this.authService = authService;
		this.userService = userService;
	}




	public void authenticateUser(Context ctx) throws ServletException, IOException {
		
		
//		String username = ctx.pathParam(null);
//		String username = ctx.queryParam(null);
		String username = ctx.formParam("username");
		String password = ctx.formParam("password");
		
		//username and password
		boolean authenticated = authService.authenticate(username, password);
		
		if(authenticated) {
			
			//send them to the home page. 
			//give them credentials: using sessions. 
			
			
//			ctx.res.red
			
			User u = userService.getUserByUsername(username);
			
			ctx.sessionAttribute("user", u);
			ctx.sessionAttribute("access","customer");
			
			
			//When you want to turn back into a GET request
			//Ask the client to send another request, 
			//The client will send the request through the search bar
			//The search bar is by definition a GET request. 
//			ctx.res.sendRedirect("http://localhost:8000/home");
			ctx.res.sendRedirect("http://localhost:8000/home");
			
		}else {
			
			ctx.res.setStatus(401);
		}
		
		
	}

}

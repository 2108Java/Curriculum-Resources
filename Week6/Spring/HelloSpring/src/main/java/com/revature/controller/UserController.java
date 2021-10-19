package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.service.UserService;

//I don't have  a spring Web module
//I'm creating a basic bean rather than "@Controller"

@Component("MyController")
public class UserController {
	
	
	
	@Autowired
	private UserService userService;
	
	public void prinoutService() {
		if(userService != null) {
			System.out.println("Dependency injected!");
		}
	}

}

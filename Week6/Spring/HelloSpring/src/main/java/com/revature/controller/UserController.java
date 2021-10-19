package com.revature.controller;

import com.revature.service.UserService;

public class UserController {
	
	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private UserService userService;

}

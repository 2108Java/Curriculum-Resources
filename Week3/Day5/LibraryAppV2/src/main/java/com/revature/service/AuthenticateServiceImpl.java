package com.revature.service;

import com.revature.models.User;
import com.revature.repo.UserDao;

public class AuthenticateServiceImpl implements AuthenticateService {
	
	//My authentication service does not care about the books, so we don't need other dependencies!
	private UserDao uDao;
	
	public AuthenticateServiceImpl(UserDao uDao) {
		this.uDao = uDao;
	}

	@Override //verify if the user exists
	public boolean verify(String username) {
		
		User u = uDao.selectUserByUsername(username);
		boolean userExists = false;
		
		if(u != null) {
			userExists = true;
		}
		
		return userExists;
	}

	@Override //also authenticate the user
	public boolean authenticate(String username, String password) {

		boolean userExists = this.verify(username); //check if the user exists first
		boolean authenticated = false;
		if(userExists) {
			User u = uDao.selectUserByUsername(username);
			
			if(u.getUsername().equals(username)) {
				
				authenticated = true;
				
			}
		}
		
		return authenticated;
	}

}

package com.revature.service;

public interface AuthenticationService {
	
	public boolean validate(String username); //check if user exists
	
	public boolean authenticate(String username, String password); //verify that they are the user

}

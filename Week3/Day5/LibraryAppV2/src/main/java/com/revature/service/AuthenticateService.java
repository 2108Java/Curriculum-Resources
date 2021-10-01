package com.revature.service;

public interface AuthenticateService {

	
	public boolean verify(String username);
	
	
	public boolean authenticate(String username, String password);
	
	
}

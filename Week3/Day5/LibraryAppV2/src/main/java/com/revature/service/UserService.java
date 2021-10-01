package com.revature.service;

import com.revature.models.User;

public interface UserService {
	
	
	public User getUserByUsername(String username);
	
	public boolean checkoutBook(User u, String bookTitle);
	
	public boolean returnBook(User u, String bookTitle);

}

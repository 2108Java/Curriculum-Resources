package com.revature.controllers;

import java.util.List;

import com.revature.models.Book;

import io.javalin.http.Context;

public interface UserController {
	
	//This is where I'm going to expose my data over HTTP
	// (Hyper Text Transfer protocol)
	
	//The plan is for the data to be represented to the user by 
	// my JavaScript, HTML and CSS.
	
	
	public boolean authenticate(String username, String password);
	
	public List<Book> viewUserBooks(Context ctx);
	
	public List<Book> viewAvailableBooks(Context ctx);
	
	public void withdrawBook(Context ctx);
	
	public void depositBook(Context ctx);
	
	public void viewFees(Context ctx);
	
	public void payFees(Context ctx);
	
	

}

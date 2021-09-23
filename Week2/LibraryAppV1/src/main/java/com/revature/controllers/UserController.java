package com.revature.controllers;

import io.javalin.http.Context;

public interface UserController {
	
	//This is where I'm going to expose my data over HTTP
	// (Hyper Text Transfer protocol)
	
	//The plan is for the data to be represented to the user by 
	// my JavaScript, HTML and CSS.
	
	
	public void authenticate(Context ctx);
	
	public void viewUserBooks(Context ctx);
	
	public void viewAvailableBooks(Context ctx);
	
	public void withdrawBook(Context ctx);
	
	public void depositBook(Context ctx);
	
	public void viewFees(Context ctx);
	
	public void payFees(Context ctx);
	
	

}

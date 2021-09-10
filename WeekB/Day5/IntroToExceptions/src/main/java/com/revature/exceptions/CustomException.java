package com.revature.exceptions;

public class CustomException extends Exception{
	
	public CustomException(String message) {
		super(message); //I invoke my parents one-arg constructor!
	}
	

	public void printStackTrace() {
		super.printStackTrace(); //we get our parents code 
		System.out.println("Inside stack trace!"); //get to add our own code as well!
	}
}

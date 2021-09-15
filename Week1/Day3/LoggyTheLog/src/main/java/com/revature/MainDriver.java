package com.revature;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.revature.view.View;

public class MainDriver {
	
	/*
	 * What is logging?
	 * 		Record keeping. 
	 * 
	 * 		When we finally complete our project in our IDE. 
	 * 		We'd like to compile it into a distributable format. 
	 * 
	 * 		Recording events while it occurs while the application is executing. 
	 * 		An users use our program on the client or server side, we can log the 
	 * 		entries and behaviors to our support team.
	 * 
	 * 
	 * 		This allows developers to access info about the app without being there or 
	 * 		getting "indirect" info from the user. 
	 */

	public final static Logger loggy = Logger.getLogger(MainDriver.class);
	
	public static void main(String[] args) {
		
		loggy.setLevel(Level.WARN);
		
		loggy.info("Starting the application");
		
		//DEBUG < INFO < WARN < ERROR < FATAL

		View v = new View();
		v.display();

	}

}

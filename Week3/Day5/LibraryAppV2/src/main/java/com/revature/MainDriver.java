package com.revature;

import com.revature.controller.RequestMappings;
import com.revature.repo.BookDao;
import com.revature.repo.BookDaoImpl;
import com.revature.repo.BookLoanDao;
import com.revature.repo.BookLoanDaoImpl;
import com.revature.repo.UserDao;
import com.revature.repo.UserDaoImpl;
import com.revature.service.AuthenticateService;
import com.revature.service.AuthenticateServiceImpl;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;
import com.revature.util.PropertiesParser;

import io.javalin.Javalin;



public class MainDriver {
	
	public static void main(String[] args) {
		
		

	   
	   PropertiesParser.getProperties(); 
	   
	   
	   Javalin app = Javalin.create(config -> config.addStaticFiles(
				staticFiles ->
				{
					staticFiles.directory = "/public";
				}
				)).start(8000);
	   
	   //We've got connection to our html files 
	   //We need to connect our Java functionality 
	   
	   
	   //Servlets are what handle Http REquests and Responses directly. 
	   //Javalin abstracts away the process of creating and connecting our servlets. 
	   //Setting up a connection endpoints 
	   
	   RequestMappings.setupEndPoints(app);
	   
	   
	   
		
	}

}

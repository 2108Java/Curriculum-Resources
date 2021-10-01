package com.revature.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import io.javalin.Javalin;
import io.javalin.http.Context;

public class RequestMappings {
	
	//This class is going to connect everything to everything else! 
	
	
	//I don't want direct access to my html files! 
	//Instead I want to set up endpoints that forward the user to the files 
	
	
	public static boolean checkSession(Context ctx) {
		if(ctx.sessionAttribute("user") != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void setupEndPoints(Javalin app) {
		UserDao uDao = new UserDaoImpl();
		BookDao bDao = new BookDaoImpl();
		BookLoanDao loanDao = new BookLoanDaoImpl();
		   
		UserService userService = new UserServiceImpl(uDao, bDao, loanDao);
		AuthenticateService authService = new AuthenticateServiceImpl(uDao);
		
		AuthenticateController ac = new AuthenticateController(authService, userService);
		
		//Start setting up my view logic!
		
		//The first thing the user is going to see is the login page!
		app.get("/", ctx -> {
			HttpServletRequest request = ctx.req;
			HttpServletResponse response = ctx.res;
			
			//This creates an internal endpoint we want to forward to. 
//			RequestDispatcher reqDispatcher = ctx.req.getRequestDispatcher("Login.html");
			RequestDispatcher reqDispatcher = ctx.req.getRequestDispatcher("/loginPage");
			
			//Also forward them the resust and response objects!
			reqDispatcher.forward(request, response);
		}
			);
		
		
		app.get("/loginPage", 
				ctx -> 
		ctx.req.getRequestDispatcher("Login.html").forward(ctx.req, ctx.res)
				);
		
		//LandingPage 
		app.get("/home", ctx -> 
		{
			if(checkSession(ctx)) {
				ctx.req.getRequestDispatcher("LandingLibrary.html").forward(ctx.req, ctx.res);
			}else {
				ctx.res.sendRedirect("http://localhost:8000/");
			}
		
		
		});
	
		
		//UserSettings 
		app.get("/settings", ctx -> 
		ctx.req.getRequestDispatcher("UserSettings.html").forward(ctx.req, ctx.res));
		
		
		//Authentication Controller!
		//This is going to be my endpoints for authenticating a user! 
		app.post("/authenticate", ctx -> {
			
			ac.authenticateUser(ctx);
			
		});
		
		app.post("/invalidateSession", ctx -> {
			
		ctx.consumeSessionAttribute("user");
		
		ctx.redirect("http://localhost:8000/");
		});
		
		
		
		//User Controller
		//That returns all the user details! 
		
		//We will be using AJAX to communicate to this end point 
		//Where we get the user object 
		//We render the user's information to us, e.g. their books!
		app.get("/user", ctx -> {
			
			if(checkSession(ctx)){
				ctx.json(ctx.sessionAttribute("user"));
			}else {
				ctx.status(400);
			}
			
		});
		
		app.get("/allAvailableBooks", null);
		
		
		app.put("/updateUsersBook", null); //checkout and return books
		
		
		
	}

}

package com.revature.controller;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class RequestHandler {
	
	//This is going to be used to map our endpoints to our controllers
	
	public static boolean checkAccess(Context ctx) {
		if(ctx.sessionAttribute("access") != null //checking if session exists
				&& (Boolean) ctx.sessionAttribute("access") == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void setUpEndpoints(Javalin app) {
		
		PlanetController planetController = new PlanetController();
		AuthenticateController authenticateController = new AuthenticateController();
		
		
		final String PLANET_JSON = "/planet/{id}";
		final String PLANET_PAGE = "/PlanetPage";
		
		planetController.initalizeList(); //
		
		//restricted
		app.get(PLANET_JSON, ctx -> 
		{
//			System.out.println((Boolean) ctx.sessionAttribute("access"));
			 //checking if they have privelleges!
			if(checkAccess(ctx)) {
				ctx.json(planetController.getPlanet(ctx));
			}
				
			
		
		
		}
		
				
				); //localhost:8000/planet is going to return a single planet
		
		//restricted
		app.get("/planets", ctx -> 
		
		{
			if(checkAccess(ctx)) {
				ctx.json(planetController.getAllPlanets(ctx));
			}
		}
		); //localhost:8000/planets is going to return planets 	
		
		//not restricted, it should be accessible 
		app.post("/login", 
				ctx -> ctx.redirect(authenticateController.authenticate(ctx)));
		
		
		//not restricted
		app.get("/", 
				
		ctx -> ctx.req.getRequestDispatcher("/Login.html").forward(ctx.req, ctx.res));
		
		//restricted 
		app.get(PLANET_PAGE, 
				ctx -> 
		
		{
			
			if(checkAccess(ctx)) {
		ctx.req.getRequestDispatcher("/PlanetsLandingPage.html").forward(ctx.req, ctx.res);
			}
		}
		
				
				);
		
		//not restricted 
		app.get("/failedLogin", 
				ctx -> ctx.req.getRequestDispatcher("/failedLogin.html").forward(ctx.req, ctx.res));
		
		
		//Create a logut endpoint
		//Create a button in the html 
		//connect that button to the Java
		//invalidate the session 
		
		app.get("/logout", ctx -> {});
	
//		app.get("/js", ctx -> ctx.req.getRequestDispatcher("/PlanetDemo.js").forward(ctx.req, ctx.res));
	}

}

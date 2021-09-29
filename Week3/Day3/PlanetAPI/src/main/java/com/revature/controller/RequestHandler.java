package com.revature.controller;

import io.javalin.Javalin;

public class RequestHandler {
	
	//This is going to be used to map our endpoints to our controllers
	
	public static void setUpEndpoints(Javalin app) {
		
		PlanetController planetController = new PlanetController();
		
		planetController.initalizeList(); //
		
		app.get("/planet", ctx -> ctx.json(planetController.getPlanet(ctx))); //localhost:8000/planet is going to return a single planet
		
		app.get("/planets", ctx -> ctx.json(planetController.getAllPlanets(ctx))); //localhost:8000/planets is going to return planets 
		
		app.get("/login", ctx -> ctx.redirect(null));
	
	}

}

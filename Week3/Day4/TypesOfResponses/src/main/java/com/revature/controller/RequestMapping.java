package com.revature.controller;

import io.javalin.Javalin;

public class RequestMapping {
	
	public static void settingUpEndpoints(Javalin app) {

		FruitController fc = new FruitController();
		//We set up our endpoints by specifiying our request handlers
		
		//A GET request to a fruit endpoint
		
		app.get("/api/fruit/{position}", ctx -> ctx.json(fc.seeFruit(ctx)) );
		
		app.get("/api/fruit", ctx -> ctx.json(fc.seeAllFruit()));
		
		
		//INDIRECT RESPONSES 
		
		//REDIRECTING
		app.get("/fake", ctx -> ctx.redirect("/api/fruit"));	
		app.get("/fake2", ctx -> ctx.redirect("/api/fruit/0"));
		app.get("/fake3", ctx -> ctx.redirect("/fake2"));
		app.get("/fake4", ctx -> ctx.redirect("/fake3"));
		app.get("/fake5", ctx -> ctx.redirect("/fake4"));
//		app.post("/fake6", ctx -> ctx.redirect("/fake5")); 
		//when we redirect, we ask the client machine to send another (identical) request to a different endpoint
																	
		//Redirecting also works with external resources. 
		app.get("/google", ctx -> ctx.redirect("https://www.google.com/"));
		app.get("/planet", ctx -> ctx.redirect("http://localhost:8000/planets"));
		
		
		//FORWARDING
		//We are going to need a RequestDispatcher. 
		//A request dispatcher wraps our resource to be accessible via forwarding. 
		
		app.get("/forward", ctx -> 
			ctx.req.getRequestDispatcher("/api/fruit").forward(ctx.req, ctx.res));
		
		//We cannot forward to external resources 
		app.get("/forward2", ctx -> 
		ctx.req.getRequestDispatcher("https://www.google.com/").forward(ctx.req, ctx.res));
		
		app.get("/forward3", ctx -> 
		ctx.req.getRequestDispatcher("http://localhost:8000/planets").forward(ctx.req, ctx.res));
		
		app.get("/forward4", ctx -> 
		ctx.req.getRequestDispatcher("http://localhost:7000/api/fruit").forward(ctx.req, ctx.res));
	
		
		//Per endpoint you can only do a single thing!
		// Forward a request
		// Redirect a request 
		// REspond directly with a request.
	}

}

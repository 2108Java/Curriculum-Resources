package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Planet;
import com.revature.service.PlanetService;

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
		
		PlanetController pc = new PlanetController();
		AuthenticateController ac = new AuthenticateController();
		
		final String PLANET = "api/planet";
		final String PLANET_ID = "/planet/{id}";
		final String AUTHENTICATE = "/authenticate";
		final String LOGOUT = "/logout";
		final String ROOT_URL = "http://localhost:8000/login";
		
		//REST operations API
		//RESTful API is a program designed for another program
		//An API exposes functionality via endpoints, we don't prepare views here. 
		
		//Create
		//should be limited to authorized users
		app.post(PLANET, ctx -> {
			
			if(checkAccess(ctx)) {
				pc.postPlanet(ctx);
			}else {
				ctx.res.setStatus(401);
			}
			
			
		});
		
		//Get 
		app.get(PLANET_ID, ctx -> {
			pc.getPlanet(ctx);
		});
		
		app.get(PLANET, ctx -> {
			pc.getAllPlanets(ctx);
		});
		
		
		//Update
		//should be limited to authorized users
		app.put(PLANET, ctx -> {
			
			
			if(checkAccess(ctx)) {
				pc.putPlanet(ctx);	
			}else {
				ctx.res.setStatus(401);
			}
		});
		
		//Delete 
		//should be limited to authorized users 
		app.delete(PLANET_ID, ctx -> {
			
			
			if(checkAccess(ctx)) {
				pc.deletePlanet(ctx);	
				}else {
					ctx.res.setStatus(401);
				}
			
		});
		
		
		//AUTHORIZE 
		app.post(AUTHENTICATE, ctx -> {
			ac.authenticate(ctx);
		});
		
		app.get(LOGOUT, ctx ->  {ac.logout(ctx);});
		
		
	}

}

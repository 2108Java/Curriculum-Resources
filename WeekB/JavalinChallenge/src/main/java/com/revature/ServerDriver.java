package com.revature;

import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class ServerDriver {
	
	private static List<Planet> planetList = new ArrayList<>();
	
	public static String createPlanet(Context ctx) {
		System.out.println(ctx.queryParam("name"));
		System.out.println(ctx.queryParam("mass"));
		System.out.println(ctx.queryParam("rings"));
		
		Planet planet;
		if(ctx.queryParam("rings") == null) {
			planet = new Planet(ctx.queryParam("name"), 
					Double.parseDouble(ctx.queryParam("mass")), 
					false);
		}else {
			planet = new Planet(ctx.queryParam("name"), 
					Double.parseDouble(ctx.queryParam("mass")), 
					true);
		}
		
		planetList.add(planet);
		return "create";
	}
	
	public static String deletePlanet(Context ctx) {
		return "delete";
		}
		
	public static List<Planet> seeAllPlanets(Context ctx) {
		
		
		return planetList;
	}
	
	public static String updatePlanetsMass(Context ctx) {
		return "update planets mass";
	}

	public static void main(String[] args) {


		Javalin app = Javalin.create(
				config -> 
				{
					config.addStaticFiles("/");
				}
				).start(9000);
		
		planetList.add(new Planet("Mercury", 0.2, false));
		planetList.add(new Planet("Venus", 0.8, false));
		planetList.add(new Planet("Earth", 1, false));
		
		
		//Setting up endpoints
		app.get("/create", ctx -> ctx.html(createPlanet(ctx)));
		app.get("/delete", ctx -> ctx.html(deletePlanet(ctx)));
		//JSON = Javascript Object Notation
		app.get("/view-all", ctx -> ctx.json(seeAllPlanets(ctx)));
		app.get("/update", ctx -> ctx.html(updatePlanetsMass(ctx)));

	}

}

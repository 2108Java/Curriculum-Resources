package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class ServerDriver {
	
	List<Planet> planetList = new ArrayList<>();
	
	public static String createPlanet(Context ctx) {
		return "create";
	}
	
	public static String deletePlanet(Context ctx) {
		return "delete";
		}
		
	public static String seeAllPlanets(Context ctx) {
		return "see all planets";
	}
	
	public static String updatePlanetsMass(Context ctx) {
		return "update planets mass";
	}

	public static void main(String[] args) {


		Javalin app = Javalin.create().start(9000);
		
		
		//Setting up endpoints
		app.get("/create", ctx -> ctx.html(createPlanet(ctx)));
		app.get("/delete", ctx -> ctx.html(deletePlanet(ctx)));
		app.get("/view-all", ctx -> ctx.html(seeAllPlanets(ctx)));
		app.get("/update", ctx -> ctx.html(updatePlanetsMass(ctx)));

	}

}

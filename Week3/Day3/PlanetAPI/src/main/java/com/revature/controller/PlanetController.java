package com.revature.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.revature.models.Planet;

import io.javalin.http.Context;

public class PlanetController {
	
	private List<Planet> planetList = new ArrayList<>();
	
	public void initalizeList() {
		planetList.add(new Planet(1,"Mercury","small",false));
		planetList.add(new Planet(2,"Venus","hot",false));
		planetList.add(new Planet(3,"Earth","blue",false));
		planetList.add(new Planet(4,"Mars","red",false));
		planetList.add(new Planet(5,"Jupiter","BIG",true));
	}

	public Planet getPlanet(Context ctx) {
		
		//I want to return the planet that the user wants!
		
		String stringId = ctx.pathParam("id");
		
		int id = Integer.parseInt(stringId);
		
		ctx.res.setStatus(418);
		
		return this.planetList.get(id);
	}

	public List<Planet> getAllPlanets(Context ctx) {
		// TODO Auto-generated method stub
		
		ctx.res.setStatus(200);
		return this.planetList;
	}

	public void deletePlanet(Context ctx) {
		
	}
	
}

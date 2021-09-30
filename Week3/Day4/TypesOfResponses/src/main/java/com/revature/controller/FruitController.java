package com.revature.controller;

import java.util.List;

import com.revature.models.Fruit;
import com.revature.service.FruitService;

import io.javalin.http.Context;

public class FruitController {
	
	private static FruitService fs = new FruitService();
	
	
	// "api/fruit/{position} --> returning Fruit json"
	public Object seeFruit(Context ctx) {
		//It needs the context object 
		//because the context object contains the HTTP request information. 
		//My controller does the hard job of grabbing information from the 
		//context object! 
		
		String positionString = ctx.pathParam("position");
		
		int position = Integer.parseInt(positionString);
		
		Fruit f = null; 
				
		try {
			f = fs.getFruitById(position);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e); // We shoould be using log4j
		}
				
		
		if(f != null) {
			ctx.res.setStatus(200);
			return f;
		}else {
			ctx.res.setStatus(404); //resource not found!
			
			return new Message("Fruit object with position: " + position + " does not exist");
//			return new Fruit("does not exist");
//			return null; //we don't want to break our server!
		}
	}
	
	// "/api/fruit --> List<Fruit>
	public List<Fruit> seeAllFruit(){

		List<Fruit> allFruits = fs.getAllFruits();
		
		return allFruits;
	}

}

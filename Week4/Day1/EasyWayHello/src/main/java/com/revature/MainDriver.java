package com.revature;

import com.revature.design.patterns.Car;
import com.revature.design.patterns.FactoryDesignClass;

import io.javalin.Javalin;

public class MainDriver {
	
	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7000);
		
		//we set up handlers for our different endpoints!
		
		app.get("/greetings", ctx -> {
			
			ctx.html("hello"); //sending back hello message !
			
		});
		
//		app.post("/*", ctx -> {
//			
//			ctx.html("hello");
//		});
		
		app.get("/car/{color}", ctx -> {
			
			Car c = FactoryDesignClass.getCar(ctx.pathParam("color"));
			
			System.out.println(c);
			
			
			//JACKSON
			//Jackson is a marshalling tool that converts our Java objects into JSON 
			//Converts our JSON into Java objects. 
			
			//Jackson is a library that utilises our code to provide functionality. 
			// It expects pojos with getters and setters 
			// We get back JSON entities and the ability to convert JSON into Java objects. 
			
//			ctx.html(c.toString());
			ctx.json(c);
			
		});
		
	}

}

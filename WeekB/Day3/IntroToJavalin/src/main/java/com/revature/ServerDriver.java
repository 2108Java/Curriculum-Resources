package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Fruit;

import io.javalin.Javalin;

public class ServerDriver {
	
	public static String helloMessage() {
		return "Hello, welcome to my web application";
	}
	
	public static String printingToTheConsole() {
		System.out.println("I've been invoked!");
		return "I've been invoked!";
	}
	
	public static void main(String[] args) {
		
		Fruit f = new Fruit("Kiwi");
		
		System.out.println(f);
		System.out.println(f.toString());
		
		List<Fruit> fruitList = new ArrayList<>();
		
		fruitList.add(new Fruit("Apple"));
		fruitList.add(new Fruit("Banana"));
		fruitList.add(new Fruit("Watermelon"));
		fruitList.add(f);
		
		System.out.println(fruitList);
		
		/*
		 * Javalin: 
		 * 	
		 * 		Lightweight framework that abstracts away using servlets. 
		 * 		i.e. we can quickly set up web projects. 
		 * 
		 * 		Javalin uses an embedded Jetty server to run our application. 
		 * 
		 */
		
		// url: <domain>:<port>
		Javalin app = Javalin.create().start(9000);
		
		
		String fruit = "Apple";
		
		// <domain>:<port>/endpoint
		// localhost:9000/fruit
		app.get("/fruit", ctx -> ctx.html(fruitList.toString()));
		
		app.get("/hello", ctx -> ctx.html("Hello!"));
		
		app.get("/welcome", ctx -> ctx.html("Method has been moved"));
		
		
		app.get("/method", ctx -> ctx.html(printingToTheConsole()));
	}

}

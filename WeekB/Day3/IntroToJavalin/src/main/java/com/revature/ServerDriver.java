package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Fruit;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class ServerDriver {
	
	private static List<String> names = new ArrayList<>();
	
	private static List<Fruit> fruitList = new ArrayList<>();
	
	public static String helloMessage() {
		return "Hello, welcome to my web application";
	}
	
	public static String printingToTheConsole() {
		System.out.println("I've been invoked!");
		return "I've been invoked!";
	}
	
	public static String passingInName(Context ctx) {
		
		String url = ctx.fullUrl();
		String name = ctx.queryParam("name");
		
		names.add(name);
		
		System.out.println(names);
		
		System.out.println(url);
		System.out.println(name);
		
		return "<h6>" + name +  "</h6>";
	}
	
	
	public static String prettyDisplayFruits(List<Fruit> fruits) {
		
		String display = "<ol style='color:red'>";
		
		for(Fruit f: fruits) {
			display += "<li class = " + f.getName() + "> " + f.toString() + "</li>";
		}
		
		display += "</ol>";
		
		return display;
		
	}
	
	public static String addingFruit(Context ctx) {
		
		String name = ctx.queryParam("fruitName");
		
		Fruit f = new Fruit(name);
		
		fruitList.add(f);
		
		
		return prettyDisplayFruits(fruitList);
	}
	
	
	public static String deleteFruit(Context ctx) {
		
		String name = ctx.queryParam("fruit");
		
		if(name == null) {
			ctx.res.setStatus(500);
		}
		
		for(int i = 0; i< fruitList.size(); i++) {
			
			if(fruitList.get(i).getName().equals(name)) { //checking every position to see if it has a matching name
				
//				== vs .equals() by default they do the same thing.
				
//				== checks memory location 
				
//				String object has modified it's equals method to check the value of the string
//				
				
				fruitList.remove(i); //if it does, I'll remove it from the list. 
				break;
			}
			
		}
		
		
//		return prettyDisplayFruits(fruitList);
		return "";
		
	}
	
	public String notStaticMethod() {
		return "";
	}
	
	public static void main(String[] args) {
		
//		Static modifier means that we don't need an object to use it. 
//		ServerDriver sd = new ServerDriver();
//		sd.notStaticMethod();
		
//		passingInName();
//		notStaticMethod();
		
		
		
		
//		Fruit f = new Fruit("Kiwi");
//		
//		System.out.println(f);
//		System.out.println(f.toString());
//		
//		
//		
//		fruitList.add(new Fruit("Apple"));
//		fruitList.add(new Fruit("Banana"));
//		fruitList.add(new Fruit("Watermelon"));
//		fruitList.add(f);
		
//		System.out.println(fruitList);
		
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
		
		app.get("/name", ctx -> ctx.html(passingInName(ctx)));
		
		app.get("/fruits", ctx -> ctx.html(prettyDisplayFruits(fruitList)));
		
		app.get("/addFruit", ctx -> ctx.html(addingFruit(ctx)));
		
		app.get("/deleteFruit", ctx -> ctx.html(deleteFruit(ctx)));
		
		app.get("/hello", ctx -> ctx.html("Hello!"));
		
		app.get("/welcome", ctx -> ctx.html("Method has been moved"));
		
		
		app.get("/method", ctx -> ctx.html(printingToTheConsole()));
	}

}

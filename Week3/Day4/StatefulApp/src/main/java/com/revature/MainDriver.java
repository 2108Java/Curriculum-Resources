package com.revature;

import java.util.Scanner;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class MainDriver {
	
	public static boolean login(Context ctx) {
		//username 
		//password 
		
		//we would be sending information through a form 
		
		String username = ctx.formParam("username");
		String password = ctx.formParam("password");
		
		System.out.println(username);
		System.out.println(password);
		
		if(username.equals("user") && password.equals("pass")) {
			ctx.res.setStatus(204);
			return true;
		}else {
			ctx.res.setStatus(402);
			return false;
		}
		
		
//		ctx.queryParam(password); /authenticate?password=value
//		ctx.pathParam(password); /authenticate/{password}
	}

	public static void main(String[] args) {

		//A stateless server treats every request the same, independent of prior requests.

		Javalin app = Javalin.create(
				config -> config.addStaticFiles(
						staticFiles ->
						{
							staticFiles.directory = "/public/";
						}
				)).start(6000);
		
		
		app.post("/authenticate", ctx -> {login(ctx);} ); //Someone has to ping my authenticate, 
										//before they can access my "/secret"
		
		app.get("/hello", ctx -> ctx.json("Hello"));
		
		app.get("/secret", ctx -> {	}); //That I only want access once they login!
		
		app.get("/secret/2", ctx -> {});
			
		
		app.get("/cookie", ctx -> {
			
			//cookies stored in the client machine! 
			
			ctx.cookie("user", "McBobby");
			ctx.cookie("favoriteColor","Blue");
			ctx.cookie("member","true"); 
			ctx.cookie("access", "true");
		});
		
		app.get("/lookingAtCookie", ctx -> {
			
			System.out.println(ctx.cookieMap());
		});
		
		app.get("/checkCookies", ctx -> {
			
			ctx.res.setStatus(400);
			
			//checking if the cookieMap exists
			if(ctx.cookieMap() != null) {
				if(ctx.cookieMap().get("member")!= null  //checking if the "member" cookie exists
						&& ctx.cookieMap().get("member").equals("true")) { //checkif the member cookie has the right value
					ctx.res.setStatus(200);
				}}
				
				
		});

		app.get("/removeCookies", ctx ->{
			
			ctx.removeCookie("member");
			ctx.cookie("access", "false");
		});
		
	}

}

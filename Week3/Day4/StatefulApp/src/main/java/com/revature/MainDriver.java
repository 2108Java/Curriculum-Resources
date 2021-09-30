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
			ctx.sessionAttribute("user", new User("McBobby",true));
			return true;
		}else {
			
			ctx.res.setStatus(400);
			ctx.sessionAttribute("user", new User("fake",false));
			return false;
		}
		
		
//		ctx.queryParam(password); /authenticate?password=value
//		ctx.pathParam(password); /authenticate/{password}
	}

	public static void main(String[] args) {

		//A stateless server treats every request the same, independent of prior requests.

		Javalin app = Javalin.create(config -> config.addStaticFiles(
				staticFiles ->
				{
					staticFiles.directory = "/public";
				}
				)
				).start(6001);
		
		
		app.get("/", ctx -> ctx.html("hello!"));
		
		app.post("/authenticate", ctx -> {login(ctx);} ); //Someone has to ping my authenticate, 
										//before they can access my "/secret"
		
		app.get("/secret", ctx -> {
			
			User sessionUser = ctx.sessionAttribute("user");
			
			if(sessionUser == null) {
				ctx.res.setStatus(400);
				System.out.println("Login in first!");
			}else if(sessionUser.isAdmin()) {
				ctx.res.setStatus(200); //success!
				ctx.req.getRequestDispatcher("/SuperSecretPage.html").forward(ctx.req, ctx.res);
			}else if(sessionUser.isAdmin() == false) {
				ctx.res.setStatus(401);
				ctx.req.getRequestDispatcher("/failed.html").forward(ctx.req, ctx.res);
			}
		}); //That I only want access once they login!
		
		app.get("logout", ctx -> {
			
			ctx.sessionAttribute("user", new User("fake",false)); //instead of removing altogther!
//			ctx.consumeSessionAttribute("user"); //logout!
			
		});
			
		
		//creating cookies
		app.get("/cookie", ctx -> {
			
			//cookies stored in the client machine! 
			
			ctx.cookie("user", "McBobby");
			ctx.cookie("favoriteColor","Blue");
			ctx.cookie("member","true"); 
			ctx.cookie("admin", "false");
			ctx.cookie("access", "true");
		});
		
		app.get("/checkCookies", ctx -> ctx.html(ctx.cookieMap().toString()));
		//checking if the cookies exist
//		app.get("/checkCookies", ctx -> {
//			
//			ctx.res.setStatus(404);
//			
//			//checking if the cookieMap exists
//			if(ctx.cookieMap() != null) {
//				if(ctx.cookieMap().get("member")!= null  //checking if the "member" cookie exists
//						&& ctx.cookieMap().get("member").equals("true")) { //checkif the member cookie has the right value
//					ctx.res.setStatus(200);
//					
//				}}
//			
//			
//				
//				
//		});

		//removing or overwriting the value of the cookie
		app.get("/removeCookies", ctx ->{
			
			ctx.removeCookie("member");
			ctx.cookie("access", "false");
		});
		
		
		
		app.get("/setSession", ctx -> {
		
			ctx.sessionAttribute("user", new User("Mcbobby",false));
			
		});
		
		app.get("/checkSession", ctx -> {

			User sessionUser = ctx.sessionAttribute("user");
			System.out.println(sessionUser);
		});
		
		app.get("/invalidateSession", ctx -> {
			
			ctx.consumeSessionAttribute("user"); //this invalidates the session!
		});
		
	}

}

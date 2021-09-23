package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Book;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class MainDriver {
	
	static List<Book> dummyList = new ArrayList<>();
	
	public static int addBook(Context ctx) {
		dummyList.add(new Book());
		return 200; // 200 means that it was a success!
	}
	
	//Read
	public static Book getBook(Context ctx) {
		Book b = new Book();
		b.setTitle("This book is from the server");
		return b;
	}
	
	public static List<Book> getAllBooks(Context ctx){
		return dummyList;
	}
	
	public static int deleteBook(Context ctx) {
		if(dummyList.size() < 1) {
			return 401;
		}else {
			dummyList.remove(0);
			return 200;
		}
	}
	
	public static int updateBook(Context ctx) {
		
		dummyList.get(0).setTitle("Updating the first element!");
		
		//selecting the first book, and updating the title!
		return 777;
		
	}
	
	public static void main(String[] args) {
		
		
	        Javalin app = Javalin.create().start(9000);
	        
	        app.get("/book", ctx -> ctx.json(getBook(ctx)));
	        app.get("/books", ctx -> ctx.json(getAllBooks(ctx)));
	        
	        app.put("/book", ctx -> ctx.status(updateBook(ctx)));
	        
	        app.post("/book", ctx -> ctx.status(addBook(ctx)) );
	        
	        app.delete("/book", ctx -> ctx.status(deleteBook(ctx)));
	        
	        
//	        app.get("/", ctx -> ctx.html("<h1>Hello World</h1>"
//	        		+ "GoodBye World"
//	        		+ "<p class = 'generatedByJava'>Hello again</p>"
//	        		+ "<link rel= ''>"));
//	        
//	        app.get("/WholeHTML", ctx -> ctx.html(
//	        			"<html>"
//	        			+ "<head>"
//	        			+ "<title>My Java is creating this page</title>"
//	        			+ ""
//	        			+ "</head>"
//	        			+ "<body>"
//	        			+ ""
//	        			+ "<h1>Hello There!</h1>"
//	        			+ ""
//	        			+ ""
//	        			+ "</body>"
//	        			+ "</html>"
//	        		));
//	        Book b = new Book();
	        
	        //When we send of a HTTP request, we also specify the "verb"
	        //The "verb" is meant to describe what we plant to do with the resource. 
	        //CRUD : Create, Read, Update and Delete 
	        
	        //Read
	        //By default, browsers send of a get request. 
	        // We're trying to "read" a html file. 
//	        app.get("/htmlbook", ctx -> ctx.html(b.toString()));
//	        app.get("/jsonBook", ctx -> ctx.json(b));
	        
	        //Create
//	        app.post("/book", ctx -> ctx.html("I'm posting a book"));
	        
	        //Update
//	        app.put("/book", ctx -> ctx.html("I'm putting a book"));
	        
	        //Delete 
//	        app.delete("/book", ctx -> ctx.html("I'm deleting a book"));
	        
	        //We send data using JSON - Javascript Object Notation. 
	        // Javascript is going to intepret JSON and render it for us later. 
	    
		
	}

}

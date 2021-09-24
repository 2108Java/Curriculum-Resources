package com.revature.controllers;

import java.util.List;

import com.revature.models.Book;
import com.revature.models.User;
import com.revature.service.AuthService;
import com.revature.service.BookService;
import com.revature.service.UserService;

import io.javalin.http.Context;

public class UserControllerImpl implements UserController {
	
	private UserService userService;
	private BookService bookService;
	private AuthService authService;
	
	public UserControllerImpl(UserService userService, AuthService authService, BookService bookService) {
		this.userService = userService;
		this.authService = authService;
		this.bookService = bookService;
	}

	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		
		//What would I need to authenticate a user?
//		
//		String username = ctx.queryParam("username");
//		String password = ctx.queryParam("password");
//		
		Boolean access = authService.validate(username,password);
		
		if(access) {
//			ctx.status(200); // 200 means everything is good! 
			return false;
		}else {
//			ctx.status(403); // access is false, so we return a forbidden status code
			return true;
		}
		
		
	}

	@Override
	public List<Book> viewUserBooks(Context ctx) {


		User u = new User(); //fake user that we're hardcoding in! 
		
		return u.getBookList();
		
	}

	@Override
	public List<Book> viewAvailableBooks(Context ctx) {

		return bookService.getAvailableBooks();
		
	}

	@Override
	public void withdrawBook(Context ctx) {

		String bookName = "placeholder";
		
		User u = new User(); //fake user. 
		
		boolean success = userService.withdrawBook(u,bookName);
		
		//Why would we not be able to withdraw a book?
		//		Book not available 
		// 		Book name not found 
		// 		User already has the book. 
		
		if(success) {
			ctx.status(200);
		}else {
			ctx.status(404); //resource not found
		}
		
	}

	@Override
	public void depositBook(Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewFees(Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payFees(Context ctx) {
		// TODO Auto-generated method stub
		
	}

}

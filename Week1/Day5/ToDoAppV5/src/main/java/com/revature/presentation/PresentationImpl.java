package com.revature.presentation;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.models.Todo;
import com.revature.models.User;
import com.revature.service.Authenticator;
import com.revature.service.AuthenticatorImpl;

public class PresentationImpl implements Presentation {
	
	private Authenticator auth;
	
	public PresentationImpl(Authenticator auth) {
		this.auth = auth;
	}

	public void welcomeMessage() {
		System.out.println("Welcome to my To do App! ");
		
	}
	
	public User loginMenu(Scanner sc) {
		
		System.out.println("Please login before you do anything!");
		System.out.println("Username");
		
		String username = sc.nextLine();
		
		System.out.println("Password:");
		String password = sc.nextLine();
		
		boolean authenticated = auth.authenticate(username,password);
		User u = null;
		
		if(authenticated) {
			
			 u = auth.getUser(username);
			
		}else {
			System.out.println("You are not authenticated");
			System.out.println("Try again!");
		}
		
		return u;
		
	}

	public boolean registerMenu() {return false;};
	
	private static final Logger loggy = Logger.getLogger(PresentationImpl.class);
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		welcomeMessage();
		loggy.info("User sees the welcome menu");
		
		boolean loggingIn = true;
		User user = null;
		while(loggingIn) {
			user = loginMenu(sc);
			
			if(user != null) {
				loggingIn = false;
				loggy.info("User logged in!");
			}else {
				loggy.warn("User failed to login");
			}
		}
		
		
		
		System.out.println("Welcome user! Here are your tasks!");
		boolean running = true;
		
		
		while(running) {
			
			System.out.println("Here is the todo menu!");
			System.out.println("1) See all todos");
			System.out.println("2) Add a todo");
			System.out.println("3) Delete a todo");
			System.out.println("4) Set a todo to complete");
			System.out.println("0) Exit the application ");
			
			String input = sc.nextLine();
			
			switch(input) {
			
			case "1": 
				seeAllTodos(user);
				break;
			case "2":
				addTodoMenu(user, sc);
				break;
			case "3":
				deleteTodoMenu(user);
				break;
			case "4":
				completeTodoMenu(user);
				break;
			case "0":
				running = false;
				System.out.println("Thanks for using my service!");
				break;
			default: 
				System.out.println("Invalid input, try again!");
				
			}
			
		}
		
		
		
		
		
		
		
		

	}

	private void completeTodoMenu(User u) {
		// TODO Auto-generated method stub
		
	}

	private void deleteTodoMenu(User u) {
		// TODO Auto-generated method stub
		
	}

	private void addTodoMenu(User u,Scanner sc) {
		// TODO Auto-generated method stub
		
		System.out.println("Title:");
		String title = sc.nextLine();
		
		System.out.println("Description: ");
		String description = sc.nextLine();
		
		
		Todo todo = new Todo();
		todo.setTitle(title);
		todo.setDescription(description);
		todo.setComplete(false);
		
		boolean success = todoService.insertTodo(todo);
		
		User u = auth.getUser(u.getUsername());
		
		
	}

	private void seeAllTodos(User u) {
		
		System.out.println(u.getTodoList());
		// TODO Auto-generated method stub
		
	}

}

package com.revature.presentation;

import java.util.Scanner;

import com.revature.models.ToDoItem;
import com.revature.service.ToDoService;

public class MainMenu {
	
	ToDoService service;
	
	//Constructor
	public MainMenu(ToDoService service) {
		this.service = service;
	}
	
	public static void prettyDisplayOfToDos(ToDoItem[] array) {
		
		for(int i = 0; i< array.length; i++) {
			
			if(array[i] != null) {
				System.out.println(array[i].getTitle());
				System.out.println(array[i].getDescription());
				System.out.println(array[i].isComplete());
				System.out.println("");
				
			}
			
		}
	}
	
	
	public void display() {
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		int i = 0;
		
		while(running) {
			
			System.out.println("1) View all the Todos");
			System.out.println("2) Add a new todo");
			System.out.println("3) Complete a todo");
			System.out.println("4) Delete a todo");
			System.out.println("5) Exit");
			
			String result = sc.nextLine();
			
			switch(result) {
			case "1":
				prettyDisplayOfToDos(service.getAllItems());
				break;
			case "2":
				System.out.println("Title: "); //We ask for title
				String title = sc.nextLine();
				
				System.out.println("Description: "); //We ask for description 
				String description = sc.nextLine();
				
				ToDoItem newItem = new ToDoItem(i,title,description,false); //We instantiate task
				i++;
				service.addListItem(newItem); //Add the task to the "database"
				
				System.out.println("Here's your list now! ");
				
				prettyDisplayOfToDos(service.getAllItems()); //Print out the new list!
				
				break;
				
			case "3":
			case "4":
				System.out.println("To be implemented!");
				break;
			case "5":
				running = false;
				break;
			
			}
			
			
		}
		
		
	}

}

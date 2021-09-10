package com.revature.views;

import java.util.Scanner;

import com.revature.exceptions.BusinessException;
import com.revature.models.ToDoItem;
import com.revature.service.ServiceToDo;

public class MenuV1 implements Menu {
	
	ServiceToDo service;
	
	public MenuV1(ServiceToDo service) {
		this.service = service;
	}
	
	
	private void prettyDisplayOfArray(ToDoItem[] array) {
for(int i = 0; i< array.length; i++) {
			
			if(array[i] != null) {
				System.out.println(array[i].getTitle());
				System.out.println(array[i].getDescription());
				System.out.println(array[i].isComplete());
				System.out.println("");
				
			}
			
		}
	}
	
	private void optionsMenu() {
		System.out.println("1) View all the Todos");
		System.out.println("2) Add a new todo");
		System.out.println("3) Complete a todo");
		System.out.println("4) Delete a todo");
		System.out.println("5) View all incomplete todos");
		System.out.println("6) Exit");
	}

	@Override
	public void display() {
		
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			
			optionsMenu();
			
			String result = scanner.nextLine();
			
			switch(result) {
				case "1":
					
					try {
						ToDoItem[] items = service.getAllToDos();
						prettyDisplayOfArray(items);
					}catch(BusinessException e) {
						System.out.println("Our database is down!");
//						e.printStackTrace();
					}catch(Exception e) {
						
						System.out.println("Something happened, we'll need to review this later!");
						e.printStackTrace();
					}
					
					break;
				case "2":
					System.out.println("Title:");
					String title = scanner.nextLine();
					System.out.println("Description");
					String description = scanner.nextLine();
					
					ToDoItem newToDo = new ToDoItem(title, description, false);
					
					if(service.addToDo(newToDo)) {
						System.out.println("Successfully added!");
					}else {
						System.out.println("not added!");
					}
					
					break;
				case "3":
					System.out.println("Which task would you like to complete? Input a number: ");
					int id = Integer.parseInt(scanner.nextLine());
					
					boolean success = false;
					try {
						success = service.completeAToDo(id);
					} catch (BusinessException e) {
						// TODO Auto-generated catch block
//						e.printStackTrace();
						System.out.println(e.getMessage());
					}
					
					if(success) {
						System.out.println("Successfully completed");
					}else {
						System.out.println("Unable to complete task!");
					}
					break;
				case "4":
					System.out.println("Which task would you like to delete?");
					int deleteId = scanner.nextInt();
					
					if(service.deleteToDo(deleteId)) {
						System.out.println("Successfully deleted");
					}else {
						System.out.println("Not deleted!");
					}
					break;
				case "5":
					System.out.println("Here's all the incomplete todos");
					ToDoItem[] incompleteItems = service.getAllIncompleteToDos();
					prettyDisplayOfArray(incompleteItems);
					break;
					
					
				case "6":
					System.out.println("Thanks for using our application ");
					running = false;
					break;
				default:
					System.out.println("That's not a valid input!");
					System.out.println("Try again!");
					
				
					
					
			}
			
			
		}
		

		

	}

}

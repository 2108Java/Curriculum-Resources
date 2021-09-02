package com.revature.repo;

import com.revature.models.ToDoItem;

public class DAOTestMainDriver {
	
	public static void prettyDisplay(ToDoItem[] todos) {
		for(int i = 0; i< todos.length; i++) {
			
			if(todos[i] != null) {
				
				System.out.println(todos[i].getId());
				System.out.println(todos[i].getDescription());
				System.out.println(todos[i].getTitle());
				System.out.println(todos[i].isComplete());
				System.out.println("");
				
			}
			
			
			
		}
	}

	public static void main(String[] args) {


		ToDoDAO database = new ToDoDAOImpl();
		
		database.insertToDo(new ToDoItem(3,"Bills","Sort out the bills!", false));
		
		ToDoItem[] todos = database.selectAllToDo();
		
		prettyDisplay(todos);

	}

}

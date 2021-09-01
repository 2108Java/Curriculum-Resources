package com.revature.service;

import com.revature.models.ToDoItem;
import com.revature.repo.ToDoItemsDummyDatabase;

public class ToDoService {
	
	ToDoItemsDummyDatabase database;
	
	public ToDoService(ToDoItemsDummyDatabase database) {
		this.database = database;
	}
	
	
	public ToDoItem[] getAllItems() {
		
		
		return database.getAllToDos();
	}
	
	public ToDoItem[] getAllCompletedItems() {
		return database.getAllCompletedToDos();
	}
	
	public ToDoItem[] getAllIncompleteItems() {
		return database.getAllIncompleteToDos();
	}
	
	public void addListItem(ToDoItem todo) {
			
		if(database.createAToDo(todo)) {
			//returns true? successful opertaion 	
			System.out.println("Successfully added an item to the task list");
			
		}else {
			System.out.println("Unable to add item, list is already full!");
			
		}
		
	}
	
	public void deleteListItem(int id) {
		
		if(database.deleteAToDo(id)) {
			System.out.println("Successfullly deleted item");
		}else {
			System.out.println("Unable to delete!");
		}
		
//		database.deleteAToDo(todo.getId());
	}

}

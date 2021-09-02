package com.revature.service;

import com.revature.models.ToDoItem;
import com.revature.repo.ToDoDAO;

public class ToDoService {
	
	ToDoDAO database;
	
	public ToDoService(ToDoDAO database) {
		this.database = database;
	}
	
	
	public ToDoItem[] getAllItems() {
		
		
		return database.selectAllToDo();
	}
	
	public ToDoItem[] getAllCompletedItems() {
		return database.selectAllToDoComplete();
	}
	
	public ToDoItem[] getAllIncompleteItems() {
		return database.selectAllToDoIncomplete();
	}
	
	public void addListItem(ToDoItem todo) {
			
		if(database.insertToDo(todo)) {
			//returns true? successful opertaion 	
			System.out.println("Successfully added an item to the task list");
			
		}else {
			System.out.println("Unable to add item, list is already full!");
			
		}
		
	}
	
	public void deleteListItem(int id) {
		
		if(database.deleteToDo(id)) {
			System.out.println("Successfullly deleted item");
		}else {
			System.out.println("Unable to delete!");
		}
		
//		database.deleteAToDo(todo.getId());
	}

}

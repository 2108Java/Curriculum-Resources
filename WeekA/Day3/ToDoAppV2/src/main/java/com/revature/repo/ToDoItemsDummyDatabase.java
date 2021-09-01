package com.revature.repo;

import com.revature.models.ToDoItem;

public class ToDoItemsDummyDatabase {
	
	//We're going to start of with an empty array of ToDoItems
	//This array is private, avoiding dangerous operations
	private ToDoItem[] toDoItemArray = new ToDoItem[10];
	
	//All databases should be able to complete CRUD
	
	//READ
	//Here are the publicly available methods, allowing us to interact with our "database", i.e. array.
	public ToDoItem[] getAllToDos() {
		return this.toDoItemArray;
	}
	
	//READ
	public ToDoItem[] getAllCompletedToDos() {
		
		ToDoItem[] completedArray = new ToDoItem[10]; 
		
		for(int i = 0; i< this.toDoItemArray.length; i++) {
			
			if(this.toDoItemArray[i].isComplete()) {
				completedArray[i] = toDoItemArray[i];
			}
			
		}
		
		return completedArray;
	}
	
	//READ
	public ToDoItem[] getAllIncompleteToDos() {
		//returning a full array, only containing tasks and no null values
		return null;
	}	

	//DELETE
	public boolean deleteAToDo(int toDoId) {
		return false;
	}
	
	//CREATE
	public boolean createAToDo(ToDoItem todo) {
		
		boolean successfulOperation = false;
		
		for(int i = 0; i< this.toDoItemArray.length; i++) {
			if(toDoItemArray[i] == null) { //checking if there is an empty space
				toDoItemArray[i] = todo;
				successfulOperation = true;
				break;
			}
		}
		
		return successfulOperation;
	}
	
	//UPDATE
	public boolean completeAToDo(int todoId) {
		
		
		boolean successfulOperation = false;
		
		for(int i = 0; i< this.toDoItemArray.length; i++) {
			
			if(this.toDoItemArray[i] != null //checking if this is not empty, null objects don't have id, or any attributes. 
					&&  // AND
						todoId == this.toDoItemArray[i].getId()) { //checking if the todoitem has the right id
				this.toDoItemArray[i].setComplete(true);
				successfulOperation = true;
			}
			
		}
		
		
		return successfulOperation;
	}
}

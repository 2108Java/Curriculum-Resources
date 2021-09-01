package com.revature.repo;

import com.revature.models.ToDoItem;

public class ToDoItemsDummyDatabase {
	
	//We're going to start of with an empty array of ToDoItems
	//This array is private, avoiding dangerous operations
	private ToDoItem[] toDoItemArray = new ToDoItem[10];
	
	
	//Here are the publicly available methods, allowing us to interact with our "database", i.e. array.
	public ToDoItem[] getAllToDos() {
		return null;
	}
	
	public ToDoItem[] getAllCompletedToDos() {
		return null;
	}
	
	public ToDoItem[] getAllIncompleteToDos() {
		return null;
	}	

	public boolean deleteAToDo(int toDoId) {
		return false;
	}
	
	public boolean createAToDo(ToDoItem todo) {
		return false;
	}
	
	public boolean completeAToDo(Integer todoId) {
		return false;
	}
}

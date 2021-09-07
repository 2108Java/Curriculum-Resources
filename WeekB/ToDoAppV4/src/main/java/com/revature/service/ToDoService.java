package com.revature.service;

import java.util.List;

import com.revature.models.ToDoItem;

public interface ToDoService {
	
	
	public List<ToDoItem> getAllTodos();
	
	public List<ToDoItem> getAllCompleteTodos();
	public List<ToDoItem> getAllIncompleteTodos();
	
	public boolean deleteTodos(String title);
	/*
	 * todoItem = database.selectToDoItem(title);
	 * 
	 * if(todoItem != null){
	 * 		database.deleteItem(todoItem.getId());
	 * 	}
	 * 
	 * 
	 */
	
	public boolean createTodo(ToDoItem todo);
	public boolean createTodo(String title, String description);

}

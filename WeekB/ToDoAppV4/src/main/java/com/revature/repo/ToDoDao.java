package com.revature.repo;

import java.util.List;

import com.revature.models.ToDoItem;

public interface ToDoDao { //Interacts with our DB
	
	//SELECT
	public List<ToDoItem> selectAll();
	public List<ToDoItem> selectAllComplete();
	public List<ToDoItem> selectAllIncomplete();
	
	public List<ToDoItem> select(String title);
	public ToDoItem select(int id);
	
	//UPDATE
	public boolean setComplete(int id);
	public boolean setIncomplete(int id);
	public boolean changeDescription(int id, String description);
	
	//DELETE
	public boolean deleteToDoItem(int id);
	
	
	//INSERT 
	public boolean insertToDoItem(ToDoItem todoItem);
}

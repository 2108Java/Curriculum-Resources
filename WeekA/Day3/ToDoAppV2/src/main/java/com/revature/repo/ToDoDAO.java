package com.revature.repo;

import com.revature.models.ToDoItem;

public interface ToDoDAO {
	
	//Data Access Object 
	// Design pattern, it allows to keep the database queries seperate from our Java code. 
	
	
	//CREATE
	public boolean insertToDo(ToDoItem todo);

	//DELETE
	public boolean deleteToDo(String todoTitle);
	public boolean deleteToDo(int id);
	
	//SELECT 
	public ToDoItem[] selectAllToDo();
	public ToDoItem[] selectAllToDoComplete();
	public ToDoItem[] selectAllToDoIncomplete();
	public ToDoItem selectToDoById(int id);
	
	
	//UPDATE
	public boolean completeToDo(int id);
}

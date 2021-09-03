package com.revature.service;

import com.revature.models.ToDoItem;

public interface ServiceToDo {

	public ToDoItem[] getAllToDos(); //Returns an array of todo

	public boolean addToDo(ToDoItem newToDo); //persist the todo 

	public boolean completeAToDo(int id);

	public boolean deleteToDo(int deleteId);

	public ToDoItem[] getAllIncompleteToDos();

	

}

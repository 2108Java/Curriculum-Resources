package com.revature.service;

import com.revature.models.ToDoItem;
import com.revature.repo.ToDoDAO;

public class ServiceToDoImpl implements ServiceToDo{
	
	ToDoDAO database;
	
	public ServiceToDoImpl(ToDoDAO database) {
		this.database = database;
	}

	@Override
	public ToDoItem[] getAllToDos() {
		
		
		return database.selectAllToDos();
	}

	@Override
	public boolean addToDo(ToDoItem newToDo) {
		// TODO Auto-generated method stub
		return database.insertToDo(newToDo);
	}

	@Override
	public boolean completeAToDo(int id) {
		// TODO Auto-generated method stub
		return database.updateToDo(id);
	}

	@Override
	public boolean deleteToDo(int deleteId) {
		// TODO Auto-generated method stub
		return database.deleteToDo(deleteId);
	}

	@Override
	public ToDoItem[] getAllIncompleteToDos() {
		// TODO Auto-generated method stub
		return database.getAllIncompleteTodos();
//		
//		ToDoItem[] allTheTodos = database.selectAllToDos();
//		ToDoItem[] incompleteTodos = new ToDoItem[allTheTodos.length];
//		
//		for(int i = 0; i < allTheTodos.length; i++) {
//			
//			if(allTheTodos[i].isComplete() == false) {
//				incompleteTodos[i] = allTheTodos[i];
//			}
//			
//		}
//		
//		return incompleteTodos;
		
	}

}

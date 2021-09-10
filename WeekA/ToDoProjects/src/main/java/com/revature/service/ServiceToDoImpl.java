package com.revature.service;

import com.revature.exceptions.BusinessException;
import com.revature.models.ToDoItem;
import com.revature.repo.ToDoDAO;

public class ServiceToDoImpl implements ServiceToDo{
	
	ToDoDAO database;
	
	public ServiceToDoImpl(ToDoDAO database) {
		this.database = database;
	}

	@Override
	public ToDoItem[] getAllToDos() throws BusinessException {
		
		if(database.selectAllToDos() == null) {
			throw new BusinessException("No objects were returned!");
		}
		
		return database.selectAllToDos();
	}

	@Override
	public boolean addToDo(ToDoItem newToDo) {
		// TODO Auto-generated method stub
		boolean success = false;
		try {
			success = database.insertToDo(newToDo);
		} catch( BusinessException e){
			
			System.out.println(e.getMessage());
			success = false;
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("I have no idea what happened!");
			success = false;
		}
		
		return success;
	}

	@Override
	public boolean completeAToDo(int id) throws BusinessException {
		
		if(id < 0) {
			throw new BusinessException("Id cannot be less than 1");
		}
		
		ToDoItem getTodo = database.getTodoById(id);
		
		if(getTodo == null) {
			throw new BusinessException("Todo item does not exist");
		}else if(getTodo.isComplete() == true) {
			throw new BusinessException("Item is already complete!");
		}
		
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

package com.revature.repo;

import com.revature.exceptions.BusinessException;
import com.revature.models.ToDoItem;


public interface ToDoDAO {

	ToDoItem[] selectAllToDos();

	boolean insertToDo(ToDoItem newToDo) throws BusinessException;
	//it can be null values are being added. 
	//connection problem 
	//varchar limit 
	// unique constraint violated. 

	ToDoItem[] getAllIncompleteTodos();

	boolean deleteToDo(int deleteId);

	boolean updateToDo(int id);

	ToDoItem getTodoById(int id);

}

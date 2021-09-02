package com.revature.repo;

import com.revature.models.ToDoItem;

public class ExerciseExampleToDoDAO implements ToDoDAO {
	
	//PLEASE IMPLEMENT THE METHODS IN THIS CLASS

	@Override
	public boolean insertToDo(ToDoItem todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteToDo(String todoTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ToDoItem[] selectAllToDo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ToDoItem[] selectAllToDoComplete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ToDoItem[] selectAllToDoIncomplete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ToDoItem selectToDoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean completeToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

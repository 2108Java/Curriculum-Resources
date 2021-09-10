package com.revature.repo;

import com.revature.models.ToDoItem;

public class ToDoDAODummyImpl implements ToDoDAO{
	
	
	private ToDoItem[] itemArray;
	
	public ToDoDAODummyImpl() {
		
		ToDoItem[] itemArray = new ToDoItem[4];
		
		itemArray[0] = new ToDoItem(1, "Shopping", "Buy food", false);
		itemArray[1] = new ToDoItem(2, "Shopping", "Buy cutlery", false);
		itemArray[2] = new ToDoItem(3, "Shopping", "Buy plates", false);
		itemArray[3] = new ToDoItem(4, "Shopping", "Buy soap", true);
		
		this.itemArray = itemArray;
		
	}

	@Override
	public ToDoItem[] selectAllToDos() {
		// TODO Auto-generated method stub
		
		
		
		return itemArray;
	}

	@Override
	public boolean insertToDo(ToDoItem newToDo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ToDoItem[] getAllIncompleteTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteToDo(int deleteId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ToDoItem getTodoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

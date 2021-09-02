package com.revature.repo;

public class DAOTestMainDriver {

	public static void main(String[] args) {


		ToDoDAO database = new ToDoDAOImpl();
		
		database.selectAllToDo();

	}

}

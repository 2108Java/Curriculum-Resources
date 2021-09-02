package com.revature;

import com.revature.presentation.MainMenu;
import com.revature.repo.ExerciseExampleToDoDAO;
import com.revature.repo.ToDoDAO;
import com.revature.repo.ToDoDAOImpl;
import com.revature.service.ToDoService;

public class MainDriver {
	
	//Scopes vs access modifiers
	// Scopes is with regards to variables 
		//Scope defines where the variable "exists"
	//Access modifiers is about permission to interact with that variable or method

	
	public static void main(String[] args) {

		
//		ToDoItemsDummyDatabase database = new ToDoItemsDummyDatabase();
		ToDoDAO database = new ExerciseExampleToDoDAO();
		
		ToDoService service = new ToDoService(database);
		
		MainMenu menu = new MainMenu(service);
		
		menu.display();
		
		

	}

}

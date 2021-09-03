package com.revature;

import com.revature.repo.ToDoDAO;
import com.revature.repo.ToDoDAOImpl;
import com.revature.service.ServiceToDo;
import com.revature.service.ServiceToDoImpl;
import com.revature.views.Menu;
import com.revature.views.MenuV1;

public class MainDriver {
	
	public static void main(String[] tomatoes) {
		
		ToDoDAO database = new ToDoDAOImpl();
		
		ServiceToDo service = new ServiceToDoImpl(database);
		
		Menu mainMenu = new MenuV1(service);
		
		mainMenu.display();
		
	}

}

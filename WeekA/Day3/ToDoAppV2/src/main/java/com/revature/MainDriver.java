package com.revature;

import com.revature.models.ToDoItem;

public class MainDriver {
	
	//Scopes vs access modifiers
	// Scopes is with regards to variables 
		//Scope defines where the variable "exists"
	//Access modifers is about permission to interact with that variable or method

	
	
	public static void main(String[] args) {

		
		//<datatype> <variable> = new <constructor> 
		
		ToDoItem task = new ToDoItem();
		ToDoItem task2 = new ToDoItem("Homework","Lots and lots of hwk to do");
		ToDoItem task3 = new ToDoItem(4, "Swimming", "Getting some exercise", false);
	
		
		task.getId();
		
		task.setTitle("Homework");
		System.out.println(task.getTitle());
		
		task.setDescription("Complete the Math and English hwk");
		System.out.println(task.getDescription());

	}

}

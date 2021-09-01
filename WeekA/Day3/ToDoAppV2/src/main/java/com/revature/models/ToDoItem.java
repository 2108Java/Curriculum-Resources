package com.revature.models;

//This is the same as the task object from before
public class ToDoItem {
	
	private int id;
	private String title;
	private String description;
	private boolean isComplete;
	
	//by default the JVM provides us with a constructor
	//this constructor is provided if we don't define a constructor at all!
	
	/*
	 * Default Constructor: 
	 * 
	 * public ToDoItem(){
	 * 		super(); //refereing to the Object class
	 * }
	 */
	
	//no args constructor!
	public ToDoItem() {
			//No-args vs default constructor
			//I can put in logic into my no -args constructor
//		super(); //referes to the parent class, but we'll talk about what that does later on. 
		System.out.println("Inside no args constructor!");
	}
	
	public ToDoItem(String title, String description) {
		
		System.out.println("Inside args constructor");
		
		this.title = title;
		this.description = description;
		this.isComplete = false;
	}
	
	public ToDoItem(int id, String title, String description) {
		
//		System.out.println("Inside args constructor");
		this.id = id;
		this.title = title;
		this.description = description;
		this.isComplete = false;
	}
	
	public ToDoItem(int id, String title, String description, boolean isComplete) {
		
//		System.out.println("Inside all args constructor");
		
		this.id = id;
		this.title = title;
		this.description = description;
		this.isComplete = isComplete;
	}
	
public ToDoItem(int id, String title, String description, boolean isComplete, String useless) {
		
//		System.out.println("Inside all args constructor");
		
		this.id = id;
		this.title = title;
		this.description = description;
		this.isComplete = isComplete;
	}
	
	
	
	
	//public getter
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}

	public boolean isComplete() {
		return this.isComplete;
	}
	
	//public setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setComplete(boolean complete) {
		this.isComplete = complete;
	}
}

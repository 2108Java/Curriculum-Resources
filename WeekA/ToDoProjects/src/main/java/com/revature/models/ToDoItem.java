package com.revature.models;

public class ToDoItem {
	
	private int id;
	private String title;
	private String description;
	private boolean isComplete;
	
	
	public ToDoItem(int id, String title, String description, boolean isComplete) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public ToDoItem(String title, String description, boolean isComplete) {
		this.title = title;
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public ToDoItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	

}

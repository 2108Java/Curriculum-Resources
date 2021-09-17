package com.revature.models;

public class Todo {
	
	private int id;
	private String title;
	private String description; 
	private boolean complete;
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(int id, String title, String description, boolean complete) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.complete = complete;
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
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", complete=" + complete + "]";
	}
	
	
	
}

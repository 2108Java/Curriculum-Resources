package com.revature.models;

public class Task {
	
	public String description;
	public boolean complete;
	//Setting the date/completion time for this task. 
	
	public Task(String description) {
		this.description = description;
		this.complete = false; //every single time I construct a task, it is not complete by default. 
	}

}

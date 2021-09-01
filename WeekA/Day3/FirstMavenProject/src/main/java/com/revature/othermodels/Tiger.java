package com.revature.othermodels;

import com.revature.models.Cat;

public class Tiger extends Cat{
	
	private boolean hunger = true;
	
	void hunt() {
		System.out.println("I'm going hunting");
		this.hunger = false;
		this.sleepy = true;
	}
	
	protected void sleep() {
		System.out.println("Going to sleep");
		this.sleepy = false;
		this.hunger = true;
	}
	
	public boolean hungerStatus() {
		return this.hunger;
	}

}

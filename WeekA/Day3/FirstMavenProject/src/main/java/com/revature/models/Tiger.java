package com.revature.models;

public class Tiger extends Cat{
	
	public boolean hunger = true;
	
	public void hunt() {
		System.out.println("I'm going hunting");
		this.hunger = false;
	}

}

package com.revature.vehicles;

public abstract class Honda implements Vehicle{

	/*
	 * Example of partial abstraction 
	 * 
	 * We can implement some of the methods, but not all of them .
	 */
	
	public double speed;
	
	
	public Honda() {
		this(0);
		System.out.println("I'm using the abstract class constructor!");
		
	}
	
	public Honda(double speed) {
		this.speed = speed;
	}
	

	@Override
	public void brake() throws Exception {
		this.speed = 0;
		System.out.println("I'm braking!");
		
	}
	
	public abstract void doingStuff();
	
	public abstract void economyMode(); 
	//In abstract classes, we need to EXCPLITLY write "abstract" 
	//A child class would have to implement this method. 



}

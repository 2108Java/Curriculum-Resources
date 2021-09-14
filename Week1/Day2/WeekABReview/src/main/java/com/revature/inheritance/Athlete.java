package com.revature.inheritance;

public class Athlete extends Human{
	
	/*
	 * public Athlete(){
	 * 	super(); //Human constructor
	 * }
	 */
	
//	public Athlete() {
//		super(100);
//	}
	
	
	//To override a method, you need to first inherit it. 
	//Athlete inherits the walk method formt he Human 
	
	
//	@Override //this will shout at me if I'm not overrideing a method! 
	public void walk() { //we can define a new one if we wish
		
	}
	
	
	
	
	public void run() {
		System.out.println("I can run");
	}
	
	public void atheletStuff() {
		
		Human h = new Human();
//		h.walk();
		
//		this.energy -= 10;
		
//		this.run(); //refererring to myself, the Athlete class
//		super.walk(); // referring to my parent class, the Human class
	}

}

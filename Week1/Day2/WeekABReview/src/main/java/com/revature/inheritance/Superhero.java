package com.revature.inheritance;

public class Superhero extends Athlete{
	
	/*
	 * "super" keyword is always referencing to it's DIRECT parent class 
	 */
	
	/*
	 * default constructor 
	 * 
	 * public Superhero(){
	 * 	super(); //Athlete constructor
	 * }
	 * 
	 */
	
	

	public void fly() {
		System.out.println("I can fly!");
		super.atheletStuff();
		super.walk(); //is this the walk method from human? 
		super.run();
	}
}

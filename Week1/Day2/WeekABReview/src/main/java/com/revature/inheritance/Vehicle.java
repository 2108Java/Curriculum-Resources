package com.revature.inheritance;

public class Vehicle {
	
	//Constructor
	//Attributes
	//Methods 
	
	/*
	 * What is the "this" keyword?
	 * 	specifier keyword. 
	 * 	specifies that the object that this is referring to is the "current" instance. 
	 * 
	 * this.property : we're refering to our "own" property
	 * this.method(...) : we're referring to our "own method 
	 * this(...); we're calling our own constructor
	 * 
	 * super();
	 */
	public double fuel; 
	public String name;
	public String model;
	public double price;
	
	public Vehicle() {
		
		this(0,"fake","fake",0);
//		this.fuel = 0;
//		this.name = "fake";
//		this.model = "fake";
//		this.price = price;
		
		
		System.out.println("Inside no args constructor");
	}
	
	public Vehicle(double fuel) {
		
		this(fuel, "default"); //constructor chaining!
		System.out.println("Inside fuel constructor");
	}
	
	public Vehicle(double fuel, String name) {
		this(fuel,name,"fake",0);
//		this.fuel = fuel;
//		this.name = name;
		
		System.out.println("Inside fuel and name constructor!");
	}
	
	public Vehicle(double fuel, String name, String model, double price) {
		this.fuel = fuel;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	
	public void crash() {
		
		this.accelerate(); // referring to the accelerate method that belongs to the 
						   // Vehicle object 
		
		this.brake();
	}
	
	private void accelerate() {
		
		this.fuel -= 10;
		
	}
	
	public void superSpeedyMode() {
		this.accelerate();
		this.crash();
	}
	
	public void brake() {}
	

}

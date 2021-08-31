package com.revature.animal;

public class Dog {
	
	public String breed;
	public String name;
	public int legs;
	public boolean vaxxed;
	
	
	
	
	public Dog(String dogName, String dogBreed, int dogLegs, boolean isVaxxed) {
		this.name = dogName;
		this.breed = dogBreed;
		this.legs = dogLegs;
		this.vaxxed = isVaxxed;
	}
	
	
	//It can bark 
	//public method, that does not return anything and has no arguments for us to pass in. 
	
	public void bark() {
		System.out.println("I'm a talking dog, my name is " + this.name);
	}

}

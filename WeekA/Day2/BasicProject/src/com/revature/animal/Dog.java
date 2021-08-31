package com.revature.animal;

public class Dog {
	
	public String breed;
	public String name;
	public int legs;
	public boolean vaxxed;
	
	
	//It can bark 
	//public method, that does not return anything and has no arguments for us to pass in. 
	
	public void bark() {
		System.out.println("I'm a talking dog, my name is " + this.name);
	}

}

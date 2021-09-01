package com.revature.models;

public class Cat extends Animal{
	
	public boolean hasFur;
	
	
	public void makeCatNoises() {
		System.out.println("Hi I'm a cat, my name is: " + this.name);
	}

	public void fetch() {
		System.out.println("With a lot of treats and laser pointers");
	}
	
}

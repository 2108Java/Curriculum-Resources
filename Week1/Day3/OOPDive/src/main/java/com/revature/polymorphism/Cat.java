package com.revature.polymorphism;

public class Cat {
	
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	public void goHunt() {
		System.out.println("successful hunt");
	}

	public void goSleep() {
		System.out.println("Sleeping for 10 hours");
	}
	
	@Override
	public String toString() {
		return "I'm a cat";
	}
}

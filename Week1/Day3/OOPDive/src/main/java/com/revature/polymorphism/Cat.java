package com.revature.polymorphism;

public final class Cat {
	
	
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	public final void goHunt() {
		System.out.println("successful hunt");
	}

	public final void goSleep() {
		System.out.println("Sleeping for 10 hours");
	}
	
	@Override
	public String toString() {
		return "I'm a cat";
	}
}

package com.revature.polymorphism;

public class Tiger extends Cat{
	
	
	public void goSquint() {
		System.out.println("I'm comfortable!");
	}
	
	//We don't need to provide a "@Override" annotation 
	//This simply tells the JVM that this method MUST override 
	
	@Override //inherited from Cat
	public void goSleep() {
		System.out.println("Now I sleep for 16 hours!"); //completely replaces parent logic
	}

	
	@Override //inherited from cat
	public void makeSound() {
		super.makeSound(); //uses parent logic
		System.out.println("Roar!"); //adds our own lgic in a on top
	}
	
	@Override //inhertited from the cat, cat inherited from the object class!
	public String toString() {
		return "I'm a tigeer!";
	}
	
	
}

package com.revature.diamond;

public interface Motorbike {
	
	//default only used in interfaces. 
	default void drive() {
		System.out.println("Riding on a bike!");
	}

	void brake();
	
	void drift();
}

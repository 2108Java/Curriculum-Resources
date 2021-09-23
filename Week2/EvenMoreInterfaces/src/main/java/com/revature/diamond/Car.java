package com.revature.diamond;

public interface Car {

	default void drive() {
		System.out.println("I'm driving in a car!");
	}
	
	void brake();
	
	void park();
}

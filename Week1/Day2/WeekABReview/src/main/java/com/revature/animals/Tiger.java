package com.revature.animals;

public class Tiger extends Cat{
	
	//The tiger inherits from the Cat 
	
	@Override
	public void sleep() {
		System.out.println("We sleep for 16 hours a day!");
	}
	
	@Override 
	public void hunt() {
		super.hunt();
		System.out.println("I can use my teeth!");
		
		System.out.println("After I sleep: ");
//		super.sleep(); //this will say 10
//		this.sleep(); this will say 16
	}

}

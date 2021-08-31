package com.revature.math;

/*
 * 	What is a Class?
 * 
 * 	Essentially a blueprint for the instantiation of an object. 
 * 
 * 	Typically if you want to access the methods and the attributes "within" a class you'll 
 * 	have to instantiate it into an object. 
 * 
 * 
 * What is an Object?
 * 	
 * 	Object is an implementation of a class. 
 * 
 * 
 * 
 * Blueprint for a car: 
 * 				It has tires (attribute) 
 * 				It has brakes (attribute)
 * 				Being able to brake/deaccelerate (method)
 * 				It has a model name (attribute)
 * 				IT can accelerate (method) 
 * 
 * Jeff's car:
 * 		The car has 4 seats
 * 		Honda Civic 
 * 		It can accelerate and brake 
 * 
 * Tommy's car:
 * 		Has 4 seats
 * 		Toyotoa Corolla 
 * 		It can't brake because it has no brakes. 
 * 
 */


public class Calculator {
	
	
	//defining a sum method, which takes in 2 integers. 
	//Whenever we define a method, we need to specify the return type as well 
	
	
	//We want this method to be available in our entire project, so we make it public 
	
	
	public int sum(int number1, int number2){
		
		int total = number1 + number2;
		
		return total;
	}
	
	
	public int betterSumMethod(int[] arrayOfInts){
		
		//I want to create a for loop that traverses the int array 
		
		int total = 0;
		
		for(int i = 0; i < arrayOfInts.length ; i++) {
			total += arrayOfInts[i]; 
		}
		
		
		return total;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

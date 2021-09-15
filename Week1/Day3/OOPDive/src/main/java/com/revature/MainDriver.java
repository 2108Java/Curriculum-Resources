package com.revature;

import com.revature.polymorphism.Cat;
import com.revature.polymorphism.Tiger;

public class MainDriver {
	
	
	/*
	 * Abstraction ?
	 * 		Hides the functionality of certain parts of the program.
	 * 		It won't be clustered around certain parts of the class. 
	 * 			Minimizing the information to the user (developer) to let them 
	 * 			focus on their own business logic. 
	 * 
	 * 	
	 * 		Interfaces (full abstraction):
	 * 			Interfaces are different to classes or abstract classes. 
	 * 			Interface establishes a "contract" that all child classes will 
	 * 				implement the abstract methods that we define in the interface. 
	 * 		
	 * 			By default (without using a modifier): 
	 * 
	 * 				All the methods are abstract. 
	 * 
	 * 				Interfaces can extend multiple other interfaces.
	 * 
	 * 				Interface CANNOT be instantiated. 
	 * 				Interfaces DO NOT have constructors. 
	 * 
	 * 				every method is implicilty got the "abstract" keyword 
	 * 
	 * 				every variable we have will have "public static final"  modifier implicitly 
	 * 
	 * 		Abstract class (partial abstraction) 
	 * 			
	 * 			Offer a little bit more flexibility. 
	 * 			We can define some of the methods and leave the rest abstract. 
	 * 			(or have no abstract methods and declare the class to be abstract)
	 * 
	 * 			AC have constructors, methods and attributes. 
	 * 	
	 * 			You can't have multiple inheritance (like a class) 
	 * 
	 * 			Child class must implement the methods or be abstract as well. 
	 * 
	 * 			Abstract class cannot be static or final. 
	 */

	public static void main(String[] args) throws Exception {
		
		
		Cat c = new Cat();
		
//		System.out.println(t);
//		System.out.println(c);
		
		Cat c2 = new Tiger();
		
//		c2.goSquint();// it see itselft as a Cat. Not as a tiger. 
		
//		c2.goSleep();
//		c2.goHunt();
//		c2.makeSound();
		
		System.out.println(c2);
		
		Object o =  new Cat();
		
		
		System.out.println(o);
		System.out.println(o.toString());

		Truck t = new Suzuki();
//		
//		Truck t2 = new Toyota();
//		
//		t2.accelerate();
//		t2.brake();
//		t2.carryStuff();
//		
//		Car car = new Toyota();
//		
//		car.parkInSmallPlaces();
//		car.zoomAbout();
//		
//		t.accelerate();
//		t.brake();
//		t.refuel();
//		
//		RandomClass rc = new RandomClass(); 
		//Even though we have constructors, we can't instantiate abstract classes

	}

}

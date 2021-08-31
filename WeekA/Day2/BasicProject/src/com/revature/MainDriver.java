package com.revature;

import com.revature.animal.Dog;
import com.revature.math.Calculator;

//What does import do? 

/*
 * What's a package?
 * 		They are folders. 
 * 		com.revature == com/revature
 * 		com.revature.main == com/revature/main
 * 
 * Why do we use packages?
 * 		1) Searching and locating classes or interfaces 
 * 		2) Avoiding name conflicts. 
 * 		3) Provides controlled access 
 * 
 * 
 */
public class MainDriver {
	
	
	
	public static void main(String[] args) {
		
		
		
		
//		System.out.println("Welcome to my first project!");
		
		
		int a = 2;
		int b = 7;
		
		
		Calculator myCalculator;
//		Calculator anotherCalc = new Calculator();
//		Calculator oneMoreCalc = new Calculator();
		
		myCalculator = new Calculator();
		
		int sumTotal = myCalculator.sum(a, b);
		
//		System.out.println(sumTotal);
		
		
		
		//Creating a Dog 
		
		Dog myDog = new Dog();
		
		Dog lulu = new Dog();
		
		lulu.name = "lulu";

		
		
//		myDog.bark();
		
		myDog.name = "Bobby";
		myDog.breed = "Poodle";
		myDog.vaxxed = true;
		myDog.legs = 4;
		
		
//		System.out.println(myDog.name);
//		System.out.println(myDog.breed);
//		System.out.println(myDog.vaxxed);
//		System.out.println(myDog.legs);
		
		myDog.bark();
		lulu.bark();
	}

}

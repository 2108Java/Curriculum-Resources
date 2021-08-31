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
		
		//In Java, arrays are "built in". 
		//Arrays are indexed. 
		//Arrays are also strongly typed, you can't have different datatypes in a single array. 
		//Arrays are fixed in size. 
		
		
		String[] stringArray;
		Dog[] dogArrays;
		Calculator[] calculatorArray;
		
		//Creating an empty array of fixed size, cannot be resized. 
		int[] intArray = new int[5]; //create an array with just 0s. 
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
//		intArray[4] = 57; //5th element is now a default value, 0.  
		
//		intArray = new int[27]; // just overwrite with another array. 
		
//		int[][] multidimensionalArray = new int[5][4];
//		multidimensionalArray[0][0] = 23;
//		
//		
//		int[][][][] moreDimensions = new int[1][2][4][3];
//		moreDimensions[0][0][0][0] = 1;
		
//		intArray[0] = 27;
//		intArray[0] = 27.0;
//		intArrya[0] = "1";
//		intArray = "StringArray";
		
		//Create an array with values implemented. 
		int[] anotherArray = {1,2,3,4};
		int[] anotherArray1 = {1,2,3,4,47,2,3,4,5};
		int[] anotherArray2 = {1,2,3,4,2,3};
		int[] anotherArray3 = {1,2};
		int[] anotherArray4 = {1,2,3,4,5555,12,3,23};
		
		char[] charArray;
		double[] doubleArray;
		boolean[] booleanArray;
		
		
		
		Calculator myCalculator;
//		Calculator anotherCalc = new Calculator();
//		Calculator oneMoreCalc = new Calculator();
		
		myCalculator = new Calculator();
		
		int sumTotal = myCalculator.sum(a, b);
		int arrayTotal = myCalculator.betterSumMethod(intArray);
		
		System.out.println(arrayTotal);
		System.out.println(myCalculator.betterSumMethod(anotherArray3));
		
		
		
		
		//Creating a Dog 
		
		Dog myDog = new Dog("Bobby","Poodle",4,true);
		
		Dog lulu = new Dog("Lulu","Pitbull",4,false);
		
		lulu.name = "lulu";

		System.out.println(lulu.vaxxed);
		
//		myDog.bark(); //methods can be identified as having () after them
		
//		myDog.name = "Bobby"; //attributes don't have ()
//		myDog.breed = "Poodle";
//		myDog.vaxxed = true;
//		myDog.legs = 4;
		
		
//		System.out.println(myDog.name);
//		System.out.println(myDog.breed);
//		System.out.println(myDog.vaxxed);
//		System.out.println(myDog.legs);
		
//		myDog.bark();
//		lulu.bark();
	}

}

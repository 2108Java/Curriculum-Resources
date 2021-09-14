package com.revature;

import com.revature.objects.StaticObject;
import com.revature.objects.StaticObject.NestedClass;

public class MainDriver {
	
	public static void main(String[] args) {
		
		new StaticObject();
		new StaticObject();
		new StaticObject();
		new StaticObject();
		new StaticObject();
		new StaticObject();
		new StaticObject();
		new StaticObject();
		StaticObject a = new StaticObject();
		
		NestedClass ns = a.new NestedClass();
		
		ns.anotherName = "a name";
		System.out.println(ns.anotherName);
		
//		System.out.println(StaticObject.numberOfObjectsCreated);
//		a.anotherMethod();
//		
//		StaticObject.method(1);
		
		
		//Main method is an entry point into my code. 
		//It allows the JVM to start executing code from top to bottom. 
		
		/*
		 * Primitive data types: 
		 * Java is not 100% OOP, it contains 8 primitive data types 
		 * 
		 * char : 16-bit
		 * boolean : 8-bit 
		 * double : 64-bit 
		 * int : 32-bit 
		 * byte : 8-bit 
		 * float : 32-bit
		 * short : 16-bit 
		 * long : 64-bit 
		 */
		
		//declariing a variable 
		int x; 
		
		//assigning a variable
		x = 7;
		
		//declaring and assigning a value 
		int y = 2;
		
		
		
		// Control Flow Statements
		/*
		 * What is a Control flow statement? 
		 * 	 Control the order a chunk of code is ran. 
		 * 	 Any statements that alters the normal execution of code from top to bottom.
		 * 
		 * for loops 
		 * for each loops
		 * while loops 
		 * do while loops
		 * 
		 * if else if 
		 * switch 
		 * 
		 */
		
	if(false) {
		System.out.println("I'm true!");
	}
	
	boolean myBool = false;
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	myBool = false;
	boolean anotherBool = true;
	x = 3;
	y = 1;
	
//	if(myBool || !(!anotherBool && !(x == 2)) ) {
//		System.out.println("I'm inside another if block!");
//	}else if(x > 7 && y > 7) {
//		System.out.println("x is greater than 7");
//	}else if(y< 3) {
//		System.out.println("y is less than 3");
//		//Only invoked if this condition has been met AND none of the previous ones have been met
//	}else {
//		//this will be invoked if NONE of the other conditions have been met 
//	}
	
	/*
	 * What can I check inside my if conditions?
	 * 
	 * 		checking if something is true. 
	 * 		checking if my variable is true. 
	 * 		verifying if a variable is matching a condition 
	 */
	
//	String s = "String";
//	
//	switch(s) {
//		case "string":
//			System.out.println("checks if a varable is matching another variable value");
//		case "String":
//			System.out.println("Another case block!");
//		default: 
//			System.out.println("None match!");
//	}
	
//	int c = 2;
//	switch(c) {
//	
//		case 1:
//			System.out.println("Equals to 1");
//			break;
//		case 2:
//			System.out.println("Equals to 2");
//			break;
//		case 3:
//			System.out.println("Equals to 3");
//			break;
//			
//		
//	}
	
	
//	double a = 2; //000000000000002.0000000000000000
//	// a = a; // 2.000000000000000 + 2.0000000000000001 
//	int a2 = 2; // 0000000000000002 
//
//	switch(a) {
//		case 1.0: 
//		break;
//		case 2.0: 
//			break;
//	}
	
	
	/*
	 * switch is differnt in that it will execute all the subsquent cases 
	 * 	if a case has been met 
	 * 
	 * switch will only evalute whether the variable is matching any of the cases!
	 * 
	 */
		
		
		
	}

}

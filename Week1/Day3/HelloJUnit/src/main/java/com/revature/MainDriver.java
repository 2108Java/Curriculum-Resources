package com.revature;

import com.revature.maths.Calculator;
import com.revature.maths.CasioCalculator;

public class MainDriver {
	
	/*
	 * Testing?
	 * 
	 * 		Ensures our code works. 
	 * 		Helps with debugging. 
	 * 		Good practice to have it before launching the code into production 
	 * 		Allows us to not lose scope of client specifications. 
	 * 
	 * 
	 * 		Unit Testing
	 * 		Integration testing
	 * 		Automation testing 
	 * 		manual testing 
	 * 		regression testing 
	 * 		stress testing 
	 * 		smoke testing 
	 * 
	 * 		We are going to focuse on Unit testing. 
	 * 		Unit testing is testing inisolation the smallest unit of code. 
	 * 		In Java that is a method. 
	 * 		
	 */
	
	public static void main(String[] args) {
		
		Calculator c = new CasioCalculator();
		
		System.out.println(c.add(2,2));
		
		System.out.println(c.minus(0, 0));
	}

}

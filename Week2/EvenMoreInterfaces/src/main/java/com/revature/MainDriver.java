package com.revature;

import com.revature.basic.Functional;
import com.revature.basic.FunctionalImpl;
import com.revature.basic.NormalImpl;
import com.revature.basic.NormalInterface;

public class MainDriver {
	
	private static Functional f2 = (String s, int a) -> {
		System.out.println("Didn't have to create a class");
	return 27;
	};
	
//	3 types of interfaces: 
//
//		Marker :
//			An interface is a marker interface if it has NO methods. 
//		Functional :
//			An interface is a functional interface if it has EXACTLY
//			1 abstract method defined. 
//		(Normal) Interfaces :
//			An interface that has 2 or more methods. 

	public static void main(String[] args) {

		System.out.println("Hello!");
		
		
		/*
		 * In Java 8 we get introduced to Lambda Expressions. 
		 * 
		 * The syntax looks like this: (...) -> {} ;
		 * 
		 * Lambda expressions allow us to utilise procedural style coding. 
		 * 
		 * Let's first see OOP style programming first!
		 * 		Define a class that implemented it 
		 * 		I needed to create an instance of the class 
		 * 		I can finally invoke the function/method. 
		 */
		
		Functional f = new FunctionalImpl();
		
		f.doStuff("STUFF", 2);
		
//		NormalInterface.ANOTHER_TAX;
		
		//The other way 
		// More flexible, easier for one of uses. 
		
		
		f2.doStuff("More Stuff", 3);
		
		
		
		//
		
		NormalInterface n = new NormalImpl();
		n.aMethod();
		n.anotherMethod();
		n.oneMoreSimpleMethod();
		
		//Abstract class vs interfaces?
		//	AC can have constructors. 
		// 	AC doesn't support multiple inheritance:
		// 		Classes cannot extend more than one AC. 
		//		There could be a conflict on concrete methods (that have the same name)
		

	}

}

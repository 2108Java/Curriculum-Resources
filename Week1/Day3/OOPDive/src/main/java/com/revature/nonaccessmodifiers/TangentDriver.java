package com.revature.nonaccessmodifiers;

import com.revature.polymorphism.Tiger;

public class TangentDriver {
	
	final int anotherInt = 3;
	
	static int integer = 0;
	
	static final void aStaticMethod() {
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * We have non-access modifiers that can manipulate the behavior of classes, methods 
		 * 	and variables. 
		 * 
		 * Static: 
		 * 		Classes: (only if nested)
		 * 		methods: 
		 * 		attributes: 
		 * 		It will allows us access to member variables and methods without the need to 
		 * 		instantiate the class. 
		 * 
		 * 		Main example of this is the main method. 
		 * 
		 * Abstract: 
		 * 		Class: declares a class to be abstract (may contain abstract methods but not 
		 * 			necessary) and it means that we can't instantiate it directly. 
		 * 		Method: modify the method to be abstract, 
		 * 			i.e. there is no concrete implementation. (we can only have abstract methods 
		 * 			in interfaces or abstract classes). 
		 * 
		 * 
		 * Final: 
		 * 		Class : a final class cannot be extended (so can't be used on abstract classes or
		 * 			interface). 
		 * 				
		 * 		Method: a final method is something that cannot be overridden (but it is still 
		 * 				inherited) 
		 * 			
		 * 		Attribute/variable: a final variable cannot be reassigned. 
		 * 			Assigning as a state of an object, it must be instantiated with a value. 
		 * 
		 * 		
		 */
		
		TangentDriver.aStaticMethod();
		aStaticMethod();
		
		System.out.println(TangentDriver.integer);
		System.out.println(integer);
		
		final int i;
		
		Tiger t = new Tiger();
		
		t.goHunt();
		
		i = 3;
		
		
//		i = 2;
		
//		final Object o;
		
//		o = new Object();
		
	}

}

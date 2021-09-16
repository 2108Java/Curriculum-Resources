package com.revature;

import com.revature.models.Garbage;

public class MainDriver {
	
	/*
	 * Garbage Collector is the reason why was as programmers don't need to worry 
	 * 	about memory allocation in creating and destroying objects. 
	 * (IF we didn't have it, we'd have a lot more OutOfMemoryErrors - we can't fix those)
	 * 
	 * Garbage collection is a daemon thread. It is always running in the background.It's
	 * 	purpose is clear the HEAP memory to free up space for other objects. 
	 * 
	 *  It removes objects that are eligible for removal, what does it take for it to be 
	 *  eligible?
	 *  
	 *  	UNREACHABLE OBJECTS:
	 *  		nullify a reference
	 *  		reassigne a reference 
	 *  		or create a reference in a method, and only in that method. 
	 *  
	 *  finalize() method: (final vs finally vs finalize() )
	 *  	Is a method from the Object class that is used jus before an object
	 *  	is reclaimed for destruction. 
	 */
	
	public static void myMethod() {
		Object reference = new Object(); // creating an object within a method
		System.out.println("MEthod is creating an object!");
	}

	public static void main(String[] args) {
		
		Object reference = new Object();
		
//		Object[] objectArray = new Object[Integer.MAX_VALUE/100];
		
//		List<Object> objectList = new ArrayList<>();
//		
//		Object o = new Object();
//		o.finalize();
//		
//		
//		
//		int i = 0;
//		
//		while(true) {
//			System.out.println("Assigning to " + i + "th position");
//			objectList.add(new Object());
//			i++;
//		}
		
		
		
		Garbage g = new Garbage();
		g = null;
		System.gc(); //This is more of a suggestion to the Grbage collector. 
		
//		while(true) {
//			new Garbage();
//		}

	}

}

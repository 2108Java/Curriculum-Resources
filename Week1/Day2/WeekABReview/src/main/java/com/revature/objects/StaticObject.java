package com.revature.objects;

public  static class StaticObject {
	
	public static int numberOfObjectsCreated = 0;
	public String name; 
	public Object myObject;
	
	public StaticObject() {
		numberOfObjectsCreated++;
	}
	
	public StaticObject(String name) {
		numberOfObjectsCreated++;
		this.name = name;
	}
	
	public static class NestedClass{
		
		public String anotherName;
		
		public NestedClass() {
			this.anotherName = "something";
		}
		
		public void aMethod() {
			
		}
		
	}
	
	
	
	/*
	 * "static" is a reserved keyword in java.
	 * 	Use the static keyword with a method, a nested class, variables (block).
	 * 
	 * Variable: 
	 * 		When a variable is declared with a static modifier, it allows the variable 
	 * 		to be accessed without needing to instantiate the class. 
	 * 
	 * Method: 
	 * 		It allows you to reference the method without needing to instantiate the class
	 */
	
	public void anotherMethod() {
		System.out.println(numberOfObjectsCreated); //non static methods can refer to static variables
		System.out.println(name);
		
//		method(2);
	}
	
//	public static void method(int a) {
//		anotherMethod();
//		System.out.println(name); //static methods cannot reference non-static methods or variables. 
//	}
	

}

package com.revature.polymorphism;

public class Abacus {
	
	/*
	 * Polymorphism means to take many forms. From inheritance we're allowed
	 * to reuse code implemented by parent classes but we can also use those same methods
	 * to complete different actions. 
	 * 
	 * Overloading: 
	 * 		Allows us to keep the same method name but distinguish the method signature 
	 * 		based on the parameters. 
	 * 
	 * 		Compile time polymorphism (static binding)
	 * 
	 * 		Can be applied to constructors and methods (of the same level) 
	 * 		Change the return type (because that is not applicable to the signature)
	 * 
	 * Overriding: 
	 * 		
	 * 		Use the same method signature as the parent class. But with different implementation. 
	 * 
	 * 		Run time polymorphism (dynamic binding)
	 * 
	 * 		Only applicable to inherited methods. 
	 * 		Same level methods cannot be overridden.
	 * 		Constructors cannot be Overridden. Each class gets its own constructor., 
	 */
	
	
	public double add(double x, double y) { //add(1,2);
		return 0;
	}
	
	public int add(double x, double y, double z) { //add(1,2,3);
		return 0;
	}
	
	public void doingSomething(String s, double y) { //doingSomething("apple",2);
		
	}
	
	public void doingSometing(double y, String s) { //doingSomething(2,"apple");
		
	}
	
	public void anotherMethod(Object o) { //anotherMethod(o)
		
	}
	
	public String anotherMethod(String s) {// anotherMethod("stringj");
		return "String";
	}

}

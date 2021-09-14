package com.revature.objects;

public class ARandomClass {
	
	int number;
	String name; //this is a field of the ARandomClass 
	
	// Every instance of ARandomClass will have a name property. 
	
	/*
	 * A class is a blueprint for an object. 
	 * 
	 * Object is a "physical" entity, memory is allocated to the object. 
	 * Class is a "logical" entity -  not allocated memory by default. 
	 * 
	 * What does it mean to be a blueprint for an object?
	 * 		What does a class define for the object?
	 */
	
	/*
	 * 
	 *  1) constructors:
	 *  	What does a constructor define?
	 *  		How to CREATE the object. 
	 *  		The constructors follows the "new" keyword and defines how to create it. 
	 *  	What happens if I don't write a constructor?
	 *  		Even if I don't write one, it will create a default constructor for me. 
	 *  2) fields/states/attributes
	 *  		class specific variable (primitive or object datatypes) 
	 *  		
	 *	3) methods/behaviours 
	 *			something for our class to do. 
	 *			class specific function. (function belongs to the Class/Object)
	 *
	 *			function vs method?
	 *				function can work on its own. 
	 *				I need an object to invoke the function (for a method). 
	 *
	 *			what do I need to define?
	 *				parameters. 
	 *				programmatic logic what will be executed. 
	 *				return type 
	 *				access modifier 
	 *				(non-access modifier) 
	 *				method name. 
	 */
	 
	
	public int aMethod() {
		
	}
	
	public int aMethod(int a) {
		
	}
	
	//Method signature is what we use to invoke it. 
	// aMethod();
	// aMethod();
	// aMethod(2);
}

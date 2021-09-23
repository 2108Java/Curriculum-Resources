package com.revature.basic;

public interface NormalInterface {
	
	//implicit modifiers
	
	//My variables have implicit modifiers of public static final 
	// When a variable is Final and Static, best practice is to capitilize it. 
	double SALES_TAX = 0.6; 
	public static final double ANOTHER_TAX = 0.7;
	
	
	void aMethod(); //This is a contract that all child class will have to implement aMethod();
	
	public abstract void anotherMethod(); //explicit version of interface methods. 
	
	//Don't have constructors, only classes get those! 
	
	
	//In Java 8 we got the "default" keyword 
	//Default keyword overrides the behavior of interface methods and allow us to write 
	// concrete methods. 
	
	//This breaks full abstraction because we're not abstracting everything away. 
	default double oneMoreSimpleMethod() {
		System.out.println("Put in a interface iimplemented method");
		return 0;
	}
	
	

}

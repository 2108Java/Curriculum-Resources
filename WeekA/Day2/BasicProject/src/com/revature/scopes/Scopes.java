package com.revature.scopes;

public class Scopes {
	
	public static String a = "Class scope";
	
	
	public static void uselessMethod() {
		//method/function scope
//		int a = 1; //variables can be overriden, but they can also use their parent scope
		System.out.println(a);
	}
	
	public static void anotherUSelessMEthod() {
		
		char a = 'a';
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) { //main method
		
		
//		String a = "This is the method scope (for the main method)";
		
		System.out.println(a);
		
		//Scopes
		//Scopes define where our variables exist!
		//Child scopes can see their parents scopes!
		
		//Object
		//Class 
		//Method
		//Block 
		
		
		//Children scope can see their parent scope. 
		//Block scope can see the method, class and object scope 
		//Method can see class scope
		//Class can only see class. 
		
		//Sibling scopes (e.g. 2 methods) can't see each other. 
		
		if(true) {
			//Block scope
//			String a = "inside if block!";
//			int a =1;
			
			System.out.println(a);
		}
		
		while(true) {
//			String a = "inside while loop";
			System.out.println(a);
			
			break; //break allows us to break out of looping/switch blocks. i.e. while, for, switch
		}
		
		for(int i = 0; i< 10; i++) {
			
		}
		
		for(int i = 7; i< 22; i= i+3) {
			
		}
		
		
//		System.out.println(a);
	}

}

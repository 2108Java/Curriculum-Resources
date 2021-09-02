package com.revature;

import com.revature.models.Animal;
import com.revature.models.Cat;
import com.revature.models.Dog;
import com.revature.othermodels.Tiger;

public class MainDriver {

	
	//<access-modifier> <non-access modifier> <return-type> <function/method-name>(<arguments)
	
	
	protected void anotherMethod(int a, double b) {
		
	}
	
	public static void main(String[] kiwi) { //very special method
		//the JVM (Java Virtual Machine) recognizes this method to where to begin the code execution 
		
//		System.out.println("Hello!");
		
		
		//Class vs Object 
		
		/*
		 * What is a class? 
		 * 		Class is a blueprint/ template. 
		 * 		We define the attributes and methods a object can have. 
		 * 
		 * What is an object?
		 * 		Object is a manifestation/instantiation of a class. 
		 * 		Has the attributes but also can have unique values with those attributes. 
		 * 		
		 * 		For homogenous inheritance we use the keyword: "extends" 
		 * 		class -> class 
		 * 
		 * 		For hetrogenous inheritance we use the keyword: "implements"
		 * 		interface -> class 
		 * 
		 * 		In Java we cannot inherit from multiple classes. 
		 * 
		 * 
		 * Object Oriented Principles 
		 *		
		 *		Inheritance
		 *			It is one of the most important aspects of OOP, allows you to inherit methods and variables
		 *			from parent classes; this promotes code reuse. 
		 *
		 *		Parent classes don't have access to their child classes variables/attributes and methods. 
		 *		Child classes have access to their parent's variable/attributes and method
		 *		A -> B -> C 
		 *		C will have access to all the methods and attributes in A and B
		 *		B will have access to all teh methods and attributes in A
		 *		A will not have access to B and C
		 *		
		 *		Polymorphism 
		 *			Overloading:
		 *				Same method but different parameters: 
		 *					Changing the number of parameters
		 *					Changing the datatypes of the parameter
		 *					Changing the order of the paramenters
		 *		
		 *		Abstraction:
		 *			Not real 
		 *			Vague but connecting 2 ideas together. 
		 *			Relationships from their concrete implementation. 
		 *			Open to interpretation 
		 *			Hide the implementation	
		 *
		 *			The concept of hiding implementation to show functionality. 
		 *			In Java we achieve this using Interfaces and Abstract classes. 
		 *			(Full abstraction and partial abstraction)
		 *
		 *		Encapsulation 
		 *			Is the practice of restricting access to resources within our classes and objects. 
		 *			This is to ensure no "dangerous" operations can be had on the data. 
		 *
		 *			We achieve this via access modiferes: 
		 *			public - Available everywhere within the project
		 *			protected - Only available in the package and to child classes 
		 *			(package) - Only available in the package
		 *			private - the attribute or method is only available to the class!
		 * 
		 */
		
		Animal a = new Animal();
		
		a.name = "Bob";
		a.weight = 2.0;
//		a.sleepy = false;
		
//		a.breed = "Pitbull";
//		a.hasFur = true;
//		
//		a.makeAnimalNoises();
//		a.fetch();
//		a.makeCatNoises();
		
		Dog d = new Dog();
		
		d.name = "Billy";
		d.weight = 20;
		d.breed = "German Shepard";
		
//		d.makeAnimalNoises();
//		d.fetch();
		
		
		Cat c = new Cat();
		c.name = "Cat name";
		c.weight = 4;
		c.hasFur = true;
		
//		c.makeAnimalNoises();
//		c.makeCatNoises();
		
		Tiger t = new Tiger();
		t.sleepy = true;
		t.hasFur = true;
		
//		t.hunger = true; //that's not good. Anyone has direct access to this attribute and can change it. 
		System.out.println(t.hungerStatus());
		
		
		t.hunt(); //MainDriver is in another package to the models package. 
		t.sleep(); //MainDriver is in another package to the models package. 
		
		System.out.println(t.hungerStatus());
		
		
//		t.makeAnimalNoises();
//		t.makeCatNoises();
//		t.hunt();
		
		
	}
	
	
}

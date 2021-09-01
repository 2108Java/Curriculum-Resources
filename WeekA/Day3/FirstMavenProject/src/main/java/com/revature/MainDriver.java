package com.revature;

import com.revature.models.Animal;
import com.revature.models.Cat;
import com.revature.models.Dog;
import com.revature.models.Tiger;

public class MainDriver {

	
	//<access-modifier> <non-access modifier> <return-type> <function/method-name>(<arguments)
	
	
	protected void anotherMethod(int a, double b) {
		
	}
	
	public static void main(String[] kiwi) { //very special method
		//the JVM (Java Virtual Machine) recognizes this method to where to begin the code execution 
		
		System.out.println("Hello!");
		
		
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
		 * 		In Java we cannot inherit from multiple classes. 
		 * 
		 * 
		 * Object Oriented Principles 
		 *		
		 *		Inheritance
		 *			It is one of the most important aspects of OOP, allows you to inherit methods and variables
		 *			from parent classes; this promotes code reuse. 
		 *		
		 *		Polymorphism 
		 *		Abstraction 
		 *		Encapsulation 
		 * 
		 */
		
		Animal a = new Animal();
		
		a.name = "Bob";
		a.weight = 2.0;
		a.sleepy = false;
		
		a.breed = "Pitbull";
		a.hasFur = true;
		
		a.makeAnimalNoises();
		a.fetch();
		a.makeCatNoises();
		
		Dog d = new Dog();
		
		d.name = "Billy";
		d.weight = 20;
		d.breed = "German Shepard";
		
		d.makeAnimalNoises();
		d.fetch();
		
		
		Cat c = new Cat();
		c.name = "Cat name";
		c.weight = 4;
		c.hasFur = true;
		
		c.makeAnimalNoises();
		c.makeCatNoises();
		
		Tiger t = new Tiger();
		t.sleepy = true;
		t.hasFur = true;
		t.makeAnimalNoises();
		t.makeCatNoises();
		t.hunt();
		
		
	}
	
	
}

package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import com.example.models.Fruit;
import com.example.models.Human;

public class MainDriver {

	public static void main(String[] args) {


		//Collection Hierarchy/library/framework 
		
		/*
		 * Why?
		 * 
		 * Array object within Java is quite limiting. Mainly the fact that arrays are immutable. 
		 * 
		 * I could create my own custom version of an array. (Difficult to share and not efficient)
		 * 
		 * This is where the Collection framework comes in:
		 * 
		 * (Called a framework, but it's more akin to a library) 
		 * Provides interfaces and classes that allow developers to more easily manage groups of objects. 
		 * 
		 * A "collection" object is designed to store a group of objects. 
		 */
		
		
		/*
		 * List vs Array
		 * 
		 * List we don't have to define size. 
		 * 		The list will grow with the number of elements in the structure. 
		 * 
		 * Both of them are still indexed. 
		 * 
		 * Arrays can store primitives, List has to store objects
		 * 
		 */
		
		/*
		 * 
		 * List: 
		 * 
		 * An ordered collection. 
		 * May contain duplicates. 
		 * Access via index (positional access): interact with elements based on their 
		 * 		numerical position in the list. (get, set, add, addAll and remove)
		 * 
		 * Useful properties: 
		 * 		Search: find a specified object in the list and return its position. 
		 * 		Iteration: extends 'Iterator' to utilize the list's sequential nature
		 * 		Range-view: Perform arbitrary range operations (sublist)
		 * 
		 * 
		 * Classess: 
		 * 		List 
		 * 		ArrayList: 
		 * 		LinkedList
		 * 		(depcreated) Vector: 
		 * 
		 */
		
//		Human[] humanArray = new Human[10];
//		
//		humanArray[0] = new Human(); //assigning the first position 
//		
//		int length = humanArray.length; //length of the array, an attribute of the object
//		System.out.println(length);
//		
//		List<Human> humanList = new ArrayList<Human>();
//		
//		Human h = new Human();
//		
//		humanList.add(h);
//		humanList.add(h);
//		humanList.add(new Human());
//		humanList.add(new Human());
//		
//		System.out.println(humanList.size()); //method of the object 
//		
//		Human h2 = humanList.get(0); //selecting the 1st element in the list 
//		h2.walk();
//		
//		humanList.get(1).walk();
//	
//		//Traditional for loops
//		for(int i = 0; i < humanList.size(); i++) {
//			humanList.get(i).walk();
//		}
//		
//		for(int i = 2; i < humanArray.length - 1; i=i+2) {
//			humanArray[i].walk();
//		}
//		
//		//enhanched for loops 
//		for(Human human: humanList) {
//			human.walk();
//		}
//		
//		for(Human human: humanArray) {
//			human.walk();
//		}
		
		
		
//		humanList.get(7); //this will throw an error, because the list is not that big. 
		
		
		
		//Generics, have to be objects. 
		//I can't store primitives into my Collection objects. 
		//How do we store primitives?
		//We wrap them around Wrapper classes. 
		// int -> Integer
		// double -> Double 
		// float -> Float 
		// byte -> Byte 
		// long -> Long 
		// short -> Short
		// boolean -> Boolean 
		//char -> Character 
		
//		int a = 1;
//		Integer b = a;
//		
//		System.out.println(b);
//		
//		
//		Collection<String> collectionString = new ArrayList<String>();
//		
//		List<String> listStrings = new ArrayList<String>();
//		List<Object> listObjects = new ArrayList<>();
//		
//		List<Integer> listOfIntegers = new ArrayList<>();
//		List<Double> listOfDoubles = new ArrayList<>();
//		
//		listObjects.add(new Object());
//		listObjects.add(new Human());
//		listObjects.add("String");
		
//		listObjects.get(1).walk(); // The List doesn't know it has a human, so it assumes 
									// everything is an object. And objects can't walk. 
		
//		listObjects.get(2).
		
		
//		ArrayList<String> arrayListString = new ArrayList<String>();
		
		
		
		
		
		
//		collectionString.add("A new String to collection");
////		collectionString.add(new Human()); Can't add different datatypes. 
//		
//		for(int i = 0; i < collectionString.size(); i++) {
////			collectionString.get
//		}
//		
//		for(String s: collectionString) {
//			System.out.println(s);
//		}
		
		
		
		/*
		 * Set:
		 * 		Does not allow duplicates 
		 * 		Does not guarantee insertion order. 
		 * 		(Only inhertis methods from the Collection + restriction to duplicates)
		 * 
		 * 		Classes: 
		 * 			HAshSet 
		 * 			TreeSet
		 * 
		 */
		
		Set<Integer> setIntegers = new HashSet<>();
		
		setIntegers.add(0);
		setIntegers.add(1);
		setIntegers.add(2);
		setIntegers.add(3);
		setIntegers.add(null);
		
//		if(!setIntegers.add(3)) {
//			System.out.println("3 is already there!");
//		}
//		
//		for(Integer i: setIntegers) {
//			System.out.println(i);
//		}
		
		
		Set<Human> setHumans = new HashSet<>();
		
		Human h = new Human();
		
		setHumans.add(h);
		setHumans.add(h);
		setHumans.add(h);
		setHumans.add(h);
		
//		for(Human human: setHumans) {
//			human.walk();
//		}
		
		Set<Fruit> setFruits = new HashSet<>();
		
		setFruits.add(new Fruit("Kiwi"));
		setFruits.add(new Fruit("Kiwi"));
		setFruits.add(new Fruit("Kiwi"));
		setFruits.add(new Fruit("Kiwi"));
		
//		for(Fruit f: setFruits) {
//			System.out.println(f.getName());
//		}
		
		
		
	/*
	 * Queue: 
	 * 
	 * 	Ordered list of objects, related to insertion order. 
	 * 	Follows the FIFO principle (First in , first out) 
	 * 
	 * 		(Stack follows the reverse principle, First in, Last out) 
	 * 	Methods: 
	 * 		poll, remove, peek and element
	 */
		
		
//	Queue<String> queueString = new LinkedList<>();
//	List<String> listOfStrings = new LinkedList<>();
//	
//	queueString.add("First element");
//	queueString.add("Second element");
//	queueString.add("Second element");
//	queueString.add("Second element");
//	queueString.add("Second element");
//	queueString.add("Second element");
//	
//	
//	System.out.println(queueString.peek());
//	System.out.println(queueString.peek());
//	System.out.println(queueString.peek());
//	System.out.println(queueString.peek());
//	System.out.println(queueString.poll());// select the "head" of the queue and removes it from the queue
	
	//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.remove());
//	System.out.println(queueString.poll());
//	System.out.println(queueString.poll());
//	System.out.println(queueString.poll());
//	System.out.println(queueString.poll());
//	System.out.println(queueString.poll());
	
		
		
		
		
		Queue<String> queueString = new LinkedList<>();
//		queueString = new ArrayList<>();
		
		List<String> listOfStrings = new LinkedList<>();
		listOfStrings = new ArrayList<>();
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.poll();
		linkedList.add("In My linkedlist");
		
		queueString.add("Hello");
		listOfStrings.add("Hello again");
		
//		queueString.get(0);
		listOfStrings.get(0);
		
		queueString.poll();
//		listOfStrings.poll();
		
		
		/*
		 * ArrayList: 
		 * 		A resizable array (mutable) compared to the built in array inside JAva. 
		 * 
		 * LinkedList:
		 * 	
		 * 		Consists of nodes, each node will store a value and a 'pointer' to the next
		 * 		node. Alllows for easier addition and removal for entries (Arraylist has to 
		 * 		resize the entire structure). However, this requires more memory overhead, 
		 * 		each node holds data + memory address to another node). 
		 */
		
		
		

	}

}

package com.revature;

import com.revature.models.Boring;

public class MainDriver {

	/*
	 * A String is NOT a primitive!
	 * 
	 * A String is an object that contains an array of characters. 
	 * It allows you to create and manipulate strings of characters. 
	 * 
	 * If String is a class, what do String's have?
	 * 		Attributes
	 * 		Methods 
	 * 		Constructors
	 * 
	 * The String class is somewhat special:
	 * 		The class is immutable and final. 
	 * 		final: the class cannot be extended 
	 * 		immutable: The string cannot be changed. 
	 */
	
	public static void main(String[] args) {


		String apples = "apples"; //create a string literal in memory if one doesn't exist
		
		String anotherApple = "apples"; //or point ot an existing one
		String anotherApples2 = "apples";
		
		String s1 = new String("apples"); //overcome this default behaviour by using the consturctor and "new"
		String s2 = new String("apples"); //but I shouldn't really, because there's no reason to. 
		String s3 = new String("apples");
		String s4 = new String("apples");
		
		System.out.println(1 == 1);
		System.out.println('a' == 'a');
		
		Object o = new Object();
		Object o2 = new Object();
		
		System.out.println(o == o2);
		System.out.println(o.equals(o2));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		Boring b = new Boring(100);
		Boring b2 = new Boring(100);
		Boring b3 = new Boring(10);
		
		System.out.println(b.equals(b3));
		
//		System.out.println(apples == anotherApple);
		
		
		
		
//		Boring b = new Boring(100);
//		b.setBoredomLevel(11);
//		System.out.println(b.getBoredomLevel());
//		
//		
//		apples = apples.toUpperCase();
//		apples.toLowerCase();
//
//		System.out.println(apples.toUpperCase());
//		System.out.println(apples);
//		System.out.println(anotherApple);
//		System.out.println(anotherApples2);
	}

}

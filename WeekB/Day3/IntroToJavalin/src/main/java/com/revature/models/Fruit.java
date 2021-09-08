package com.revature.models;

public class Fruit {
	
	/*
	 * What can a class/object have? 
	 * 		Methods
	 * 		Attributes 
	 * 		Constructors 
	 * 
	 * What methods and attributes will every Object/Class in Java have?
	 * 		methods and attributes inherited from the Object class 
	 */
	
	private String name;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
//	public String toString() {
//		return "Hello, I'm a fruit! My name is " + this.name ;
//	}
	
	
	
	
	

}

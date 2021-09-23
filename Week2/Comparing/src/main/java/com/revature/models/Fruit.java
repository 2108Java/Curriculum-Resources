package com.revature.models;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
	
	private String name;
	private double price;
	
	
	public Fruit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	
	
	@Override
	//This defines the "natural" ordering of the Fruits 
	public int compareTo(Fruit o) { //Compare to method is what Collection use to 
									//compare our objects!
	
		//complicated String logic where I compare every character in a String 
		//or I could look for a inbuilt String method. 
		
		System.out.println(this.name.compareTo(o.name));
		return this.name.compareTo(o.name);
		
		//Compare methods return 3 kinds of values. 
		// REturns positive values (i.e. greater than)
		// REturns 0 : (value is equal to )
		// Return negative values (i.e. less than)
	}
	
	

}

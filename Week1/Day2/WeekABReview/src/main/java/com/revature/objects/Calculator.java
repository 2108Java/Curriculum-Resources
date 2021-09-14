package com.revature.objects;

public class Calculator {
	
	private String name;
	
	public double add(double x, double y) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * lots of code here
		 * 
		 * 
		 */
		return x+y;
	}
	
	public double add(double x, double y, double z, double w) {
		
		System.out.println(name);
		
		double a = this.add(x, y); //left 2 variable sum
		double b = this.add(z, w); // right 2 variable sum
		
		double total = this.add(a, b);
		
		return total;
	}

}

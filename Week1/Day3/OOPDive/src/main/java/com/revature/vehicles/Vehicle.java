package com.revature.vehicles;

public interface Vehicle {
	
	double salesTax = 1;
	//public static final double salesTax = 1;
	
	
	//Every child class of Vehicle, must have these methods! 
	
	public void accelerate() throws Exception;
	
	public void brake() throws Exception;
	
	public void refuel();
	

}

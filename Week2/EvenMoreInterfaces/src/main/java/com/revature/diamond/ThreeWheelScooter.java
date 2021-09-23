package com.revature.diamond;

public class ThreeWheelScooter extends Object implements Car, Motorbike{
	
	@Override
	public void drive() {
		//I'm ignoring both implementations at the moment. 
		Car.super.drive(); //We're overriding this method with the Car's implementaiton.
		Motorbike.super.drive();
		
		System.out.println("Add your own spin on top ");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void park() {
		// TODO Auto-generated method stub
		
	}
	
	@Override 
	public void drift() {
		
	}

}

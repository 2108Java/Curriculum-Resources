package com.example.cars;

public class Honda implements Truck{

	@Override
	public void accelerate() {
		System.out.println("Honda's implementation of acceleration ");
		
	}

	@Override
	public void brake() {
		System.out.println("Honda's implementation of braking");
		
	}

	@Override
	public void refil() {
		System.out.println("Honda's implementation of refueling");
		
	}
	
	public void automaticWindow() {
		
	}

}

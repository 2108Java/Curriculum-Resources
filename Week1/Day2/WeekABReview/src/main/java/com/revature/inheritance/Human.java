package com.revature.inheritance;

public class Human extends Object{
	
	private double energy = 100;
	
	public Human() {
		
	}
	
	public Human(double energy) {
		super(); //Object constructor
		this.energy=energy;
	}
	
	/*//default Constructor provided by the JVM
	 * public Human(){
	 * 	super();
	 * };
	 */
	
	public void walk() {
		this.energy -= 10;
		System.out.println("Walk");
		System.out.println("My energy levels: " + this.energy);
	}
	
	public double getEnergy() {
		return energy;
	}
	
	public void setEnergy(double energy) {
		this.energy = energy;
	}

}

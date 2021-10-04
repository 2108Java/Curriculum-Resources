package com.revature.design.patterns;

public class Car {
	
	private int id;
	private String name;
	private double mileage;
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Car(int id, String name, double mileage) {
		super();
		this.id = id;
		this.name = name;
		this.mileage = mileage;
	}
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getMileage() {
		return mileage;
	}




	public void setMileage(double mileage) {
		this.mileage = mileage;
	}




	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", mileage=" + mileage + "]";
	}
	
	
	
	

}

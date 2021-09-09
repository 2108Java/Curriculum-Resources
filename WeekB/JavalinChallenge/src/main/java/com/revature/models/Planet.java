package com.revature.models;

public class Planet {
	
	
	private String name;
	private double mass;
	private boolean rings;
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(String name, double mass, boolean rings) {
		super();
		this.name = name;
		this.mass = mass;
		this.rings = rings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	@Override
	public String toString() {
		return "Planet [name=" + name + ", mass=" + mass + ", rings=" + rings + "]";
	}
	
	

}

package com.revature.models;

public class Moon {
	
	private int id;
	private String name;
	
	
	//private Planet myPlanet;
	
	public Moon(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Moon() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Moon [id=" + id + ", name=" + name + "]";
	}
	
	
	//private Planet myPlanet;


	
}


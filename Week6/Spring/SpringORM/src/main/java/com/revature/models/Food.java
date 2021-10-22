package com.revature.models;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //This class should be persisted as a table 
@Table(name = "food_table")
public class Food {
	
	@Id //Defines it as a primary key for our table
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "food_id") //is an optional annotation, we use it to give our column a name or constraints!
	private int id;
	
	@Column(name = "food_name", unique = true, nullable = false)
	private String name;
	
	private double price;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}

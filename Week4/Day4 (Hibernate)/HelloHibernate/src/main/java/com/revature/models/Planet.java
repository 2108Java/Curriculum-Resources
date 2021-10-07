package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * We are using the JPA (JAva persistance annotation/api)
 * This is a standard, used by Java ORM frameworks to help provide metadata
 */

@Entity
@Table(name = "planet_table")
public class Planet {
	
	//have to match 
	//primary key column, with serial datatype
	// auto increments for us (serial)
	
	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", nullable = false, unique = false)
	private String name;
	
	@Column(name = "planet_description")
	private String description;
	
	
	private boolean rings;

	public Planet(int id, String name, String description, boolean rings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rings = rings;
	}

	public Planet() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRings() {
		return rings;
	}

	public void setRings(boolean rings) {
		this.rings = rings;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + ", rings=" + rings + "]";
	}
	
	

}

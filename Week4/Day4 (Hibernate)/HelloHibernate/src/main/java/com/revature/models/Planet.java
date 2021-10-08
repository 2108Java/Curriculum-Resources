package com.revature.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * We are using the JPA (JAva persistance annotation/api)
 * This is a standard, used by Java ORM frameworks to help provide metadata
 */

@Entity
@Table(name = "planet_table")
@NamedQueries({
	@NamedQuery( name = "viewAllPlanets", query = "FROM Planet planet"),
	@NamedQuery( name = "viewPlanetsWithName", query = "FROM Planet planet where planet.name = :name")
})
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

	@OneToMany(cascade = CascadeType.ALL, mappedBy= "myPlanet", fetch = FetchType.LAZY)
	private List<Moon> myMoons;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Feature> myFeatures;
	
	public Planet(int id, String name, String description, boolean rings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rings = rings;
	}
	
	

	public Planet(int id, String name, String description, boolean rings, List<Moon> myMoons) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rings = rings;
		this.myMoons = myMoons;
	}

	
	


	public Planet(int id, String name, String description, boolean rings, List<Moon> myMoons,
			List<Feature> myFeatures) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rings = rings;
		this.myMoons = myMoons;
		this.myFeatures = myFeatures;
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
	
	

	public List<Moon> getMyMoons() {
		return myMoons;
	}



	public void setMyMoons(List<Moon> myMoons) {
		this.myMoons = myMoons;
	}


	

	public List<Feature> getMyFeatures() {
		return myFeatures;
	}



	public void setMyFeatures(List<Feature> myFeatures) {
		this.myFeatures = myFeatures;
	}



	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + ", rings=" + rings
				+ ", myMoons=" + myMoons + ", myFeatures=" + myFeatures + "]";
	}







	
	
	

}

package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {

	List<Planet> viewAllPlanets();

	Planet selectPlanetByName(String name);

	void insertPlanet(Planet p);
	
	

}

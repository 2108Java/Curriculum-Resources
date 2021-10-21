package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.models.Planet;

@Component
public class PlanetDaoImpl implements PlanetDao {
	
	private List<Planet> planetList = new ArrayList<>();

	@Override
	public List<Planet> viewAllPlanets() {
		// TODO Auto-generated method stub
		return this.planetList;
	}

	@Override
	public Planet selectPlanetByName(String name) {


		Planet outcomingPlanet = null;
		boolean planetExists = false;
		
		for(Planet p: this.planetList) {
			if(name.equals(p.getName())) {
				outcomingPlanet = p;
				planetExists = true;
			}
		}
		
		if(!planetExists) {
			outcomingPlanet = new Planet(-1, "fake");
		}
		return outcomingPlanet;
	}

	@Override
	public void insertPlanet(Planet p) {

		this.planetList.add(p);

	}

}

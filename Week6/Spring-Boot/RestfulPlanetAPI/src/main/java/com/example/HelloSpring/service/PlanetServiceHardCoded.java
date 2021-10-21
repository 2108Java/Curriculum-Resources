package com.example.HelloSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HelloSpring.models.Planet;

@Service
public class PlanetServiceHardCoded implements PlanetService {
	
	private List<Planet> planetList = new ArrayList<>();
	
	public PlanetServiceHardCoded() {
		this.planetList.add(new Planet("Test 0"));
		this.planetList.add(new Planet("Test 1"));
		this.planetList.add(new Planet("Test 2"));
		this.planetList.add(new Planet("Test 3"));
	}

	@Override
	public List<Planet> getAllPlanets() {
		// TODO Auto-generated method stub
		return this.planetList;
	}

	@Override
	public Planet getPlanetByIndex(int index) {
		// TODO Auto-generated method stub
		return this.planetList.get(index);
	}

	@Override
	public boolean insertPlanet(Planet incomingPlanet) {
		// TODO Auto-generated method stub
		
		return this.planetList.add(incomingPlanet);
	}

	@Override
	public boolean deletePlanetByIndex(int index) {

		
		if(this.planetList.remove(index) != null) {
			return true;
		}else {
			return false;
		}
	}

}

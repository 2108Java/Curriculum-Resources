package com.example.HelloSpring.service;

import java.util.List;

import com.example.HelloSpring.models.Planet;

public interface PlanetService {

	List<Planet> getAllPlanets();

	Planet getPlanetByIndex(int index);

	boolean insertPlanet(Planet incomingPlanet);

	boolean deletePlanetByIndex(int index);

}

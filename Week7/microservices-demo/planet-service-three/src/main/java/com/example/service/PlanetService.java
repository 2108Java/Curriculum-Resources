package com.example.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.models.Planet;

@Service
public class PlanetService {
	
	//PlanetService class in my 3rd Java service is going to require Planet service 2 to get all the planets. 
	
	private final RestTemplate restTemplate; //restTemplate is going to be used to communciate with our other services. 
	
	
	public PlanetService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public List<Planet> getRockyPlanets(){
		
		URI uri = URI.create("http://localhost:7100/api/planets");
		
		//Grabbing an array instead of a list, so Jackson knows to turn it into a Planet object and not a LinkedHashMap object
		Planet[] allThePlanets = this.restTemplate.getForObject(uri, Planet[].class);
		
		//Add the planet list
		List<Planet> rockyPlanets = new ArrayList<>();
		
		//Filtering through the array, if rocky we add it to the rockyPlanets List
		for(Planet p: allThePlanets) {
			if(p.isRocky()) {
				rockyPlanets.add(p);
			}
		}
		
		//We will also add Pluto
		rockyPlanets.add(new Planet(9,"Pluto",true,0));
		
		
		return rockyPlanets;
	}

}

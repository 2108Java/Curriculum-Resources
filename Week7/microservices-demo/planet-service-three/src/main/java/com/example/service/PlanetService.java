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
		
//		List<LinkedHashMap<String, String>> allThePlanets = this.restTemplate.getForObject(uri, List.class);
		
		Planet[] allThePlanets = this.restTemplate.getForObject(uri, Planet[].class);
		
		
		List<Planet> rockyPlanets = new ArrayList<>();
		
		for(Planet p: allThePlanets) {
			if(p.isRocky()) {
				rockyPlanets.add(p);
			}
		}
		
//		allThePlanets.add(new Planet(9,"Pluto",true,0));
		
		// We're not grabbing rocky planets, instead we're just going to add pluto to it as well!
		
		
		return rockyPlanets;
	}

}

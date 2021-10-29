package com.example.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.models.Planet;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PlanetService {
	
	//PlanetService class in my 3rd Java service is going to require Planet service 2 to get all the planets. 
	
	private final RestTemplate restTemplate; //restTemplate is going to be used to communciate with our other services. 
	
	
	public PlanetService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	//With riky methods, like communicating with a service we want to have a fallback method
	@HystrixCommand(fallbackMethod = "securePlanetMethod")
	public List<Planet> getRockyPlanets(){
		
		URI uri = URI.create("http://localhost:9100/api/planets");
		
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

	@HystrixCommand(fallbackMethod = "evenMoreSecure")
	public List<Planet> securePlanetMethod(){
		List<Planet> rockyPlanets = new ArrayList<>();
		rockyPlanets.add(new Planet(1, "Secure Planet", false, 0));
		
		return rockyPlanets;
	}
	
	public List<Planet> evenMoreSecure(){
		return null;
	}
	
}

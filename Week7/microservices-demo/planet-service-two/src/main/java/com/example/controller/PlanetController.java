package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Planet;

@RestController
@RequestMapping("/api")
public class PlanetController {
	
	/*
	 * What is planet service 2 doing?
	 * 		It is going to get the original list of planets
	 * 		Acts as a repository service: 
	 * 			We expose it via Rest API 
	 */

	public static List<Planet> getPlanets(){
		List<Planet> planets = new ArrayList<>();
		
		planets.add(new Planet(1, "Mercury", true, 0));
		planets.add(new Planet(2, "Venus", true, 0));
		planets.add(new Planet(3, "Earth", true, 0));
		planets.add(new Planet(4, "Mars", true, 0));
		planets.add(new Planet(5, "Jupiter", false, 0));
		planets.add(new Planet(6, "Saturn", false, 0));
		planets.add(new Planet(7, "Nepture", false, 0));
		planets.add(new Planet(8, "Uranus", false, 0));
		
		return planets;
	}
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/test/hello")
	public String sayHello() {
		return "Hello from: " + serverPort; 
	}
	
	@GetMapping(value = "/planets", produces = "application/json")
	public List<Planet> getSomePlanets(){
		return getPlanets();
	}
	
}

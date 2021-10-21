package com.example.HelloSpring.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.HelloSpring.models.Planet;
import com.example.HelloSpring.service.PlanetService;

//@Controller("Planet API")
@RestController("Restful Planet API")
@CrossOrigin
public class PlanetAPI {
	
	@Autowired
	private PlanetService planetService;
	
	@GetMapping("/planets") //return the full list of planets 
	public List<Planet> allPlanets(){ //rest controller will assume every return value should be sent by the body. 
		return planetService.getAllPlanets();
	}
	
	@GetMapping("/planets/{index}") //select a planet based on the position of it in the arraylist 
	public Planet getPlanetByIndex(@PathVariable int index) {
		return planetService.getPlanetByIndex(index);
	}
	
	@PostMapping("/planets") //insert planets, sending a JSON 
	public void insertPlanet(@RequestBody Planet incomingPlanet, HttpServletResponse response) {
		if(planetService.insertPlanet(incomingPlanet)) {
			response.setStatus(201);
		}else {
			response.setStatus(400);
		}
		
	}
	
	@DeleteMapping("/planets/{index}")
	public void deletePlanet(@PathVariable int index, HttpServletResponse response) {
		
		if(planetService.deletePlanetByIndex(index)) {
			response.setStatus(200);
		}else {
			response.setStatus(400);
		}
	}
	
	
	

}

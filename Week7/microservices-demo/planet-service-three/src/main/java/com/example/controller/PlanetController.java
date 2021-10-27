package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Planet;
import com.example.service.PlanetService;

@RestController
@RequestMapping("/api")
public class PlanetController {

	@Autowired
	private PlanetService planetService;
	
	
	@GetMapping("/planets/rocky")
	public List<Planet> getRockyPlanets(){
		return this.planetService.getRockyPlanets();
	}
}

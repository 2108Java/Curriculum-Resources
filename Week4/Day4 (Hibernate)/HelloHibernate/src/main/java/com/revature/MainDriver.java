package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.PlanetDao;
import com.revature.models.Feature;
import com.revature.models.Moon;
import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class MainDriver {
	
	public static void initalizeValues(PlanetDao pdao) {
		Planet earth = new Planet(-10, "Earth", "Blue and Green", false);
		Planet mercury = new Planet(0, "Mercury", "very small",false);
		Planet venus = new Planet(0, "Venus", "Very yellow",true);
		Planet pluto = new Planet(0, "Pluto", "Very cold",true);
		Planet jupiter = new Planet(0,"Jupiter", "Very big",true);
		Planet myPlanet6 = new Planet();
		myPlanet6.setName("Fake");
		
		Moon theMoon = new Moon(0, "The Moon", earth);
		Moon ganymede = new Moon(0, "Ganymede", jupiter);
		Moon io = new Moon(0,"IO",jupiter);
		
		Feature earthquakes = new Feature(0,"Earthquake");
		Feature storm = new Feature(0,"Storm");
		Feature magneticPoles = new Feature(0,"Magnetic Poles");
		
		
		List<Moon> earthMoons = new ArrayList<>();
		List<Moon> jupiterMoons = new ArrayList<>();
		
		List<Feature> earthFeatures = new ArrayList<>();
		List<Feature> venusFeatures = new ArrayList<>() ;
		List<Feature> jupiterFeatures = new ArrayList<>();
		
		earthMoons.add(theMoon);
		jupiterMoons.add(ganymede);
		jupiterMoons.add(io);
		
		
		earthFeatures.add(magneticPoles);
		earthFeatures.add(storm);
		earthFeatures.add(earthquakes);
		
		venusFeatures.add(earthquakes);
		venusFeatures.add(storm);
		
		jupiterFeatures.add(magneticPoles);
		jupiterFeatures.add(storm);
		
		earth.setMyMoons(earthMoons);
		jupiter.setMyMoons(jupiterMoons);
		
		earth.setMyFeatures(earthFeatures);
		venus.setMyFeatures(venusFeatures);
		jupiter.setMyFeatures(jupiterFeatures);
		
		pdao.insertPlanet(jupiter);
		pdao.insertPlanet(venus);
		pdao.insertPlanet(pluto);
		pdao.insertPlanet(mercury);
		pdao.insertPlanet(earth);
		
		
	}

	public static int initializeAnotherValue(boolean bool, int a) {
		
	
		return a;
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		PlanetDao pdao = new PlanetDao();
		
		initalizeValues(pdao);
		
		
		//LAZY vs EAGER fetching
		/*
		 * Lazy fetching means that we get a placeholder of our objects! At least initially. 
		 * If we do require the object, Hibernate will go and grab the required object from the database
		 * But this requires an active session. 
		 */
		
		List<Planet> planetList =pdao.selectAllPlanets();
//		
		for(Planet p: planetList) {
			System.out.println(p.getName());
			
			//I can't grab lazy loaded objects without an active session. 
			System.out.println(p.getMyMoons());
			
			//I can grab eager loaded objects without an active session
			System.out.println(p.getMyFeatures());
			
			
			System.out.println(p);
			
		}
		
		
		
		
		//Linting 
		// Is a way of reinforcing appropriate coding practices
		// such as appropirate naming convetions. 

		
		
	}

}

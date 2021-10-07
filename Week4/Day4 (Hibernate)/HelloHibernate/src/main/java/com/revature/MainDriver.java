package com.revature;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

public class MainDriver {
	
	public static void initalizeValues(PlanetDao pdao) {
		Planet planet = new Planet(-10, "Earth", "Blue and Green", false);
		Planet myPlanet2 = new Planet(0, "Mercury", "very small",false);
		Planet myPlanet3 = new Planet(0, "Venus", "Very yellow",true);
		Planet myPlanet4 = new Planet(0, "Pluto", "Very cold",true);
		Planet myPlanet5 = new Planet(0,"Jupiter", "Very big",true);
		Planet myPlanet6 = new Planet();
		myPlanet6.setName("Fake");
		
		pdao.insertPlanet(myPlanet2);
		pdao.insertPlanet(myPlanet3);
		pdao.insertPlanet(myPlanet4);
		pdao.insertPlanet(myPlanet5);
		pdao.insertPlanet(myPlanet6);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		PlanetDao pdao = new PlanetDao();
		
		initalizeValues(pdao);
		
		System.out.println(pdao.selectPlanetByName("Venus"));
		
		
		
//		System.out.println(pdao.selectPlanetById(1));

	}

}

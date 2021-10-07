package com.revature;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet planet = new Planet(-10, "Earth", "Blue and Green", false);
		
		PlanetDao pdao = new PlanetDao();
		
//		pdao.insertPlanet(planet);
		
		System.out.println(pdao.selectPlanetById(1));

	}

}

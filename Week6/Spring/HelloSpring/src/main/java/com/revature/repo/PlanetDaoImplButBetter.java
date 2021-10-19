package com.revature.repo;

import java.util.LinkedList;
import java.util.List;

import com.revature.models.Planet;

public class PlanetDaoImplButBetter implements PlanetDao{

	@Override
	public List<Planet> selectAll() {
		// TODO Auto-generated method stub
		
		System.out.println("The better way of doing it!");
		
		List<Planet> planetList = new LinkedList<>();
		
		planetList.add(new Planet(0,"Mercury"));
		planetList.add(new Planet(1,"Venus"));
		planetList.add(new Planet(2,"Earth"));
		planetList.add(new Planet(3,"Mars"));
		planetList.add(new Planet(4,"Jupiter"));
		return planetList;
	}

}

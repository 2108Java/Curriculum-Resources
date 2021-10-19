package com.revature.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.models.Planet;

@Repository
public class PlanetDaoImpl implements PlanetDao {
	
	private List<Planet> planetListHardCoded = new ArrayList<>();
	
	public PlanetDaoImpl() {
//		System.out.println("inside no args constructor! ");
		initilazeList();
		
	}

	@Override
	public List<Planet> selectAll() {
		// TODO Auto-generated method stub
		return this.planetListHardCoded;
	}
	
	private void initilazeList() {
		this.planetListHardCoded.add(new Planet(0,"Mercury"));
		this.planetListHardCoded.add(new Planet(1,"Venus"));
		this.planetListHardCoded.add(new Planet(2,"Earth"));
		this.planetListHardCoded.add(new Planet(3,"Mars"));
	}
	
	

}

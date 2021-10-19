package com.revature.repo;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	public List<Planet> selectAll();

}

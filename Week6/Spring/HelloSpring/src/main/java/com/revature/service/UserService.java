package com.revature.service;

import com.revature.repo.PlanetDao;

public class UserService {
	
	public UserService(PlanetDao pDao) {
		this.planetDao = pDao;
	}

	private PlanetDao planetDao;

}

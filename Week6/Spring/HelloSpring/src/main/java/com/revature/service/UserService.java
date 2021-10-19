package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Planet;
import com.revature.repo.PlanetDao;

@Service("MyService")
public class UserService {
	
	public UserService(PlanetDao pDao) {
		System.out.println("Inside service layer, using a single args constructor");
		this.planetDao = pDao;
	}
	
	@Autowired
	public UserService(PlanetDao planetDao, AuthService authService) {
		super();
		this.planetDao = planetDao;
		this.authService = authService;
		System.out.println("All args constructor!");
	}



	public UserService() {
		System.out.println("Inside no args constructor, service layer!");
	}
	
	@Autowired
	public void setPlanetDao(PlanetDao planetDao) {
		System.out.println("Inside setter!");
		this.planetDao = planetDao;
	}
	
	@Autowired
	public void setAuthService(AuthService authService) {
		System.out.println("Inside auth service setter");
		this.authService = authService;
	}


	@Autowired //This is field injection, and we lose encapsulation because of it. 
	private PlanetDao planetDao;
	@Autowired //We're now tightly coupled to frameworkds that support field injection, harder to switch framework. 
	private AuthService authService;
	
	public List<Planet> getAllPlanet(){
//		System.out.println("Inside service layer!");
		
		if(authService.checkUser()) {
			return planetDao.selectAll();
		}else {
			return null;
		}
		
	}

}

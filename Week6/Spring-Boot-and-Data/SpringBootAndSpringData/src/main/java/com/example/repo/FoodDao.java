package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.models.Food;


/*
 * Spring Boot and Spring Data follow similar philosophy with regards to the Spring framework 
 * 
 * Spring Boot is an opnionated, auto-configured setup of our Spring (Web) project
 * 
 * Spring Data also streamlines the process of setting up our dao layers. 
 * We know which queries we want, we don't really care about how it is implemented. 
 */
public interface FoodDao extends CrudRepository<Food, Integer>{

	
	//A better version of the CrudREpository 
	// JPARepository vs CrudREpository 
	
	List<Food> findAll();

	Food save(Food ffasdkfjasdk);

	Food findByName(String name);
	
	void delete(Food faasdfjklasdkfjalskdjf);

}

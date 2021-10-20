package com.revature.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.models.Food;
import com.revature.repo.FoodDao;
import com.revature.service.AuthService;
import com.revature.service.KitchenService;


//@Controller //@Controller requires SpringWeb to work, it does not have the libraries yet. 
//We're going with the most generic stereotype we can have
@Component("MyController")
public class FoodController {
	
	private KitchenService kitchen;
	
	//Spring doesn't have a no args constructor anymore 
	//To create the FoodController it is forced to use the following constructor! 
	//Spring desperatly looks for dependencies that it can use to plug into our construcotr.
	public FoodController(KitchenService kitchen, FoodDao foodDao,AuthService authService) {
		
		if(foodDao != null) {
			
			System.out.println("Spring is also injecting FoodDAo!");
		}
		this.kitchen = kitchen;
	}
	
	public void viewFood() {
		List<Food> foodList = kitchen.viewAllMenuItems();
		
		System.out.println(foodList);
	}

}

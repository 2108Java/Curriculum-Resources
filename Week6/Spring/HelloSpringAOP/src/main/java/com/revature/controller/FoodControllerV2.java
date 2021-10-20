package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.models.Food;
import com.revature.service.KitchenService;

@Component("BetterController")
public class FoodControllerV2 {

	@Autowired
	private KitchenService kitchenService;
	
	public void viewFood() {
		System.out.println(kitchenService.viewAllMenuItems());
	}
	
	
	
}

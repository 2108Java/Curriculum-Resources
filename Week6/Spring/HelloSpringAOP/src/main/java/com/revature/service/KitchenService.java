package com.revature.service;

import java.util.List;

import com.revature.models.Food;

public interface KitchenService {
	
	public List<Food> viewAllMenuItems();
	
	public boolean removeItemFromMenu(Food f);
	
	public boolean addItemToMenu(Food f);

	//createOrder
	
	//calculateOrder
	
	

}

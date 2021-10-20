package com.revature.repo;

import java.util.List;

import com.revature.models.Food;

public interface FoodDao {
	
	//This is abstraction
	//For the rest of my project, the methods I define here is what is going to be avaiable for everyone else. 
	
	public void insertFood(Food f);
	
	public void deleteFood(Food f);
	
	public List<Food> viewAllFood();

}

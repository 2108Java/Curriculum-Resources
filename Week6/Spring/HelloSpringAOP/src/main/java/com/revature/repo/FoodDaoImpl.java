package com.revature.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.models.Food;

/*
 * @Repository is a "child" of component - this means that Spring will take care of this class as a Spring bean. 
 * 
 * @Repository is a stereotype - stereotype defines the role of a class. 
 * 	@Repository does not add too much additional functionality - it's a nice label for us to understand the purpose of this class. 
 */

@Repository
public class FoodDaoImpl implements FoodDao {
	
	private static List<Food> foodList;
	
	
	public FoodDaoImpl() {
		
		
		
		initializeFood();
		
	}

	private static void initializeFood() {

		foodList = new ArrayList<>();
		foodList.add(new Food(0, "Burger", 1));
		foodList.add(new Food(1, "Hot Dog", 2));
		foodList.add(new Food(2, "Apples", 3.50));
		foodList.add(new Food(3, "Sausage Roll", 4));
//		System.out.println("Iniatlizing database");
		
	}

	@Override
	public void insertFood(Food f) {
		
		foodList.add(f);
		
//		System.out.println("Adding food");

	}

	@Override
	public void deleteFood(Food f) {

		foodList.remove(f.getId());
		
//		System.out.println("Removing food");
	}

	@Override
	public List<Food> viewAllFood() {
//		System.out.println("Viewing all foods!");
		return foodList;
	}

}

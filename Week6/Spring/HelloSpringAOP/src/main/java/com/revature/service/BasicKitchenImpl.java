package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Food;
import com.revature.repo.FoodDao;

@Service
public class BasicKitchenImpl implements KitchenService {

	@Autowired //field injection
	private FoodDao foodDao;
	
	@Override
	public List<Food> viewAllMenuItems() {

		return foodDao.viewAllFood();
	}

	@Override
	public boolean removeItemFromMenu(Food f) {

		foodDao.deleteFood(f);
		return true;
	}

	@Override
	public boolean addItemToMenu(Food f) {

		foodDao.insertFood(f);
		return true;
	}

}

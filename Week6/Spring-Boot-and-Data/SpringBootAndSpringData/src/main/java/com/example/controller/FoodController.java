package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Food;
import com.example.repo.FoodDao;

@RestController("FoodController")
@RequestMapping("/api/")
public class FoodController {
	
	@Autowired
	private FoodDao foodDao;

	
	@GetMapping("/hello")
	public String testMethod() {
		return "hello";
	}
	
	@GetMapping("/foods")
	public List<Food> getAll() {
		return foodDao.findAll();
	}
	
	@GetMapping("/food/{name}")
	public Food getFoodByName(@PathVariable String name) {
		
		return foodDao.findByName(name);
	}
	
	
	@PostMapping("/food")
	public void addFood(@RequestBody Food f) {
		foodDao.save(f);
	}
}

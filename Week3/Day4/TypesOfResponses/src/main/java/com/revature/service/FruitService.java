package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Fruit;

import io.javalin.http.Context;

public class FruitService {
	//Service layer is not interested in any database or http stuff 
	//it only cares about java things - NO Connection, PreparedStatement, HTTPrequest, HttpResponse
	
	//ADO dependency 
	private List<Fruit> fakeDatabase = new ArrayList<>();
	
	public FruitService() {
		initFruits();
	}
	
	public void initFruits() {
		fakeDatabase.add(new Fruit("First fruit"));
	}
	
	public Fruit getFruitById(int id) throws IndexOutOfBoundsException{ //only java stuff,
		
		return fakeDatabase.get(id); //my service also does not care about setting up the response!
	}
	
	public List<Fruit> getAllFruits(){
		
		return fakeDatabase;
	}

}

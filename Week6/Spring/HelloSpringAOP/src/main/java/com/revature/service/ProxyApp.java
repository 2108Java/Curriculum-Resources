package com.revature.service;

import org.springframework.stereotype.Component;

import com.revature.models.Food;

@Component("FakeApplication")
public class ProxyApp {
	
	//create some dummy methods 
	
		@Deprecated
		public Boolean funMethod(int a) {
			System.out.println("Inside fun method");
			return true;
		}
		
		public Boolean funMethod(int a, boolean b) {
			System.out.println("Inside fun method that is overloaded!");
			return false;
		}
		
		public Object fruitMethod() {
			System.out.println("Inside fruit method");
			return new Food();
			
		}
		
		public void arrayMethod(int[] arrayOfInts) {
			System.out.println("Inside array method");
			
		}
}

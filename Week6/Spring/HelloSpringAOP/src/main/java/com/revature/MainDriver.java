package com.revature;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.controller.FoodController;
import com.revature.controller.FoodControllerV2;
import com.revature.models.Food;
import com.revature.service.ProxyApp;

public class MainDriver {
	
	
	/*
	 * Spring containers have support for AOP: 
	 * 
	 * 		Aspect Oriented Programming. 
	 * 		AOP can be used in conjuction with OOP. 
	 * 
	 * 		AOP tries to reduce the amount of Cross cutting concerns and aims to modularize our classes as much as possible. 
	 * 			
	 * 		Logging, authorization, exception handling is an example of cross cutting concern. End up acting as boiler plate code. 
	 * 		Not necessary for the functionality of the project, but important for the maintenacne and management ofour project. 
	 * 
	 * 
	 * 		Aspects! Aspects help us to resolve cross cutting concerns.
	 * 
	 */
	
	//I'll need to have a Spring Inversion OF Control container in my project!
	
	//ApplicaitonContext is a modern version of IoC, it is a child of the BeanFactory (an older version of IoC) 
	private static ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//	private static BeanFactory container = new ClassPathXmlApplicationContext("beans-annotation.xml");
	
	public static void viewFood() {
		System.out.println("Testing aspects!");
	}


	public static void main(String[] args) {
	
		FoodControllerV2 foodController = container.getBean("BetterController",FoodControllerV2.class);
		
//		viewFood(); //MainDriver isn't a bean controlled by Spring, so advices don't trigger here!
		
		foodController.viewFood();

		System.out.println(new Food(0,"Test",0.0));
		
		
//		----------------------------------------AOP Example----------------------------------------
		
//		ProxyApp app = container.getBean("FakeApplication",ProxyApp.class);
//		
//		app.arrayMethod(null);
//		app.fruitMethod();
//		app.funMethod(0);
//		app.funMethod(0,true);


	}

}

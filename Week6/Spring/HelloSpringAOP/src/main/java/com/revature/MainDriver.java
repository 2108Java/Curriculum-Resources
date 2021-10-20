package com.revature;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.controller.FoodController;

public class MainDriver {
	
	//I'll need to have a Spring Inversion OF Control container in my project!
	
	//ApplicaitonContext is a modern version of IoC, it is a child of the BeanFactory (an older version of IoC) 
	private static ApplicationContext container = new ClassPathXmlApplicationContext("beans-annotation.xml");
	
//	private static BeanFactory container = new ClassPathXmlApplicationContext("beans-annotation.xml");


	public static void main(String[] args) {
	
		FoodController foodController = container.getBean("MyController",FoodController.class);
		
		foodController.viewFood();

	}

}

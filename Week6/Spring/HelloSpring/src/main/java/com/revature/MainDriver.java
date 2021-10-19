package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.controller.UserController;
import com.revature.repo.PlanetDao;
import com.revature.repo.PlanetDaoImpl;
import com.revature.service.UserService;

public class MainDriver {
	
	/*
	 * What is Spring?
			Spring is a module based, open source, Java AOP framework. 
			Spring is used to support enterprise applications. 

		What is a module?
			A grouping of libraries that work toegther to achieve goals using reusable abstracted code. 
			Inside of Spring, what does a module like? Maven dependencies. 

		What are the modules in Spring?
			Core, Context, ORM, AOP, WebMVC, Beans, Security, Test, etc.... 

		Features of Spring: 
			IoC container: 
				Inversion of Control container will create and manage all the dependencies our project 
				is going to use. We will be using the applicationContext container!
	 */
	
	
	//Let's go ahead and create Spring's IOC container.
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-manual.xml");

	public static void main(String[] args) {
		
		
		
		//This is the old way of doing it! 
		//We're manually passing in the dependencies and having to manage every aspect of it. 
		//From instantiating it (managing lifecycle) as well as controlling the dependencies themselves. 
		
//		PlanetDao pDao = new PlanetDaoImpl();
		
		//The NEW way of doing it!
		//We don't use the New keyword! -- We're not instantiating this. Instead Spring is making it for us!
//		PlanetDao pDao = appContext.getBean("PlanetDaoFirst", PlanetDao.class);
		
//		System.out.println(pDao.selectAll());
		System.out.println("Hello");
		
		
//		UserService userService = new UserService(pDao); //We're constructor injecting our dao dependency into our service component. 
//		
//		UserController userController = new UserController();
//		userController.setUserService(userService); //We're doing setter injection, passing our service dependency into our controller. 
		
		

	}

}

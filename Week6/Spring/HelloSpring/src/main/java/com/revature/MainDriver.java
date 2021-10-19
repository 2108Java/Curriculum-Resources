package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.controller.UserController;
import com.revature.repo.PlanetDao;
import com.revature.repo.PlanetDaoImpl;
import com.revature.repo.PlanetDaoImplButBetter;
import com.revature.service.AuthService;
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
				
				Our inversion of control container is: 
					ApplicaitonContext: is a type of BeanFactory (BeanFactory is a parent of ApplicaitonContext). 
					BeanFactory contains the information regarding the beans you have defined in your project. 
						A beans is an object that is instantiated and managed by a spring container. 
							(We are no longer responsible for creating and managing our objects).
					
					We ddon't use bean factory because ApplicaitonContext is better in almost every scenario.
						(The only reason you would use BeanFactory is if performance REALLY MATTERS). 
						
					Review the advantages of ApplicationContext over BeanFactory: 
					
			AOP
			MVC 
			A LOT of abstracted APIs. 
						
	 */
	
	
	//Let's go ahead and create Spring's IOC container.
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-manual.xml");
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
	public static void main(String[] args) {
		
		
		
//		//This is the old way of doing it! 
//		//We're manually passing in the dependencies and having to manage every aspect of it. 
//		//From instantiating it (managing lifecycle) as well as controlling the dependencies themselves. 
//		
//		PlanetDao pDao;
//		
////		pDao = new PlanetDaoImpl();
////		pDao = new PlanetDaoImpl();
////		pDao = new PlanetDaoImpl();
////		pDao = new PlanetDaoImpl();
//		
//		//The NEW way of doing it!
//		//We don't use the New keyword! -- We're not instantiating this. Instead Spring is making it for us!
//		pDao = appContext.getBean("PlanetDaoFirst", PlanetDao.class);
////		pDao = appContext.getBean("PlanetDaoFirst", PlanetDao.class);
////		pDao = appContext.getBean("PlanetDaoFirst", PlanetDao.class);
////		pDao = appContext.getBean("PlanetDaoFirst", PlanetDao.class);
////		pDao = appContext.getBean("PlanetDaoFirst", PlanetDao.class);
//		
////		System.out.println(pDao.selectAll());
//		
//		UserService userService;
//		
////		userService = new UserService(pDao); //We're constructor injecting our dao dependency into our service component. 
////		userService = appContext.getBean("PlanetServiceBean",UserService.class);
//		userService = appContext.getBean("PlanetServiceBeanUsingSetters",UserService.class);
//		
//		System.out.println(userService.getAllPlanet());
////		
////		UserController userController = new UserController();
////		userController.setUserService(userService); //We're doing setter injection, passing our service dependency into our controller. 
		
		
		
		
		
		
		
		
		
		//-----------------------------------------AUTOWIRE EXAMPLE ----------------------------------------------------------------
		
//		PlanetDao planetDao;
//		planetDao = appContext.getBean("planetDao",PlanetDaoImplButBetter.class);
//		
//		AuthService authService;
//		authService = appContext.getBean("authService",AuthService.class);
//		
//		UserService userService;
//		userService = appContext.getBean("PlanetServiceAutoByName",UserService.class);
//		userService = appContext.getBean("PlanetServiceAutoByType",UserService.class);
//		userService = appContext.getBean("PlanetServiceAutoByConstructor",UserService.class);
//		
//		System.out.println(userService.getAllPlanet());
		
		
		//-------------------------------------------ANNOTATION EXAMPLE---------------------------------------------------------------
		
		
//		UserService userService = appContext.getBean("MyService",UserService.class);
		
//		System.out.println(userService.getAllPlanet());
		
		UserController userController = appContext.getBean("MyController",UserController.class);
		
		userController.prinoutService();
		
		
		

	}

}

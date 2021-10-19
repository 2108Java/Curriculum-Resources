package com.revature.service;

import org.springframework.stereotype.Component;

/*
 * Stereotypes are annotations that tell Spring that THIS class is a Spring bean, and should be treated as such!
 * 
 * @Component is used for any basic java class. It tells Spring to "manage" it for us as a bean, but it does not fit into 
 * 	a speciifc category
 * 
 * @Service: service/business classes
 * @Repository: repo/dao classes
 * @Controller: is used for controller classes
 * @RestController: Used for RESTful controller classes 
 * @Configuration: used for classes that configure aspects of our spring project. 
 * 
 * 
 * @Bean is NOT A STEREOTYPE. It is used inside of @Configuration classes to have a bean that is managed by Spring
 */

@Component("FullAnnoAuth")
public class AuthService {
	
	public AuthService(String dummyVariable, int a) {
		
	}
	
	public AuthService() {
		
	}
	
	public boolean checkUser() {
		return true;
	}

}

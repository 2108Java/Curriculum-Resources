package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAndSpringDataApplication {
	
	/*
	 * Spring boot is an opinioated approach to creating a Spring project. 
	 * 
	 * It streamlines the process by assuming a lot of things for us and autoconfiguring the project! 
	 * 
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndSpringDataApplication.class, args);
	}

}

package com.example.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//This class is also going to be a bean managed by Spring 
//But it's a configuration class 

@Configuration
public class ConfigureRestTemplate {

	
	//I want to create a restTemplate 
	//RestTemplateBuilder is a bean that IS managed by Spring, so it will inject it in! 
	
	@Bean //This tells spring, that whatever is returned from this method should be managed by Spring. 
	public RestTemplate restTemplateGenerator(RestTemplateBuilder builder) {
		
		return builder.build();
	}
}

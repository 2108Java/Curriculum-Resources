package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class PlanetServiceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanetServiceThreeApplication.class, args);
	}

}

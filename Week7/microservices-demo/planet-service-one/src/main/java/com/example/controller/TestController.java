package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * For example I don't want all my classes or method running in a production environment vs 
 * 	testing environment. 
 */


@Controller("Test Controller")
@Profile("dev")
public class TestController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping(value = "/hello", produces = "application/json")
	public @ResponseBody String sayHello() {
		return "Hello, Welcome to my first Planet Service: " + this.serverPort;
	}

}

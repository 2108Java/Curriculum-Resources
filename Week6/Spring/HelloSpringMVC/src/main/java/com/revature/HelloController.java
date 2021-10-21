package com.revature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Message;

@Controller("HelloController") //This stereotype turns this class into a controller
@RequestMapping(value = "/greetings") 
public class HelloController {
	
	/*
	 * Setting up endpoints with different methods and url 
	 * 
	 * Sending a json back to the frontend (postman)
	 * 
	 * parsing information from the request: 
	 * 		form, query, path parameters as well as json (from the body)
	 * 
	 * From the response: 
	 * 		Send back a status code 
	 * 		A JSON object 
	 * 		
	 * 		Types of responses: 
	 * 			Redirect
	 * 			Forward 
	 * 			Direct response (JSON in the response body) 
	 */
	
	@RequestMapping(value = "/hello") //localhost:<>/HelloSpringMVC/greetings/hello
	public @ResponseBody String sayHello() {
		return "Hola";
	}
	
//	@RequestMapping(value = "/bye") //localhost:<>/greetings/bye
	@GetMapping(value = "/bye")
	public @ResponseBody Message sayGoodBye() { //The reason why we can a Message object is because of Jackson.
		return new Message("Bye");
	}

}

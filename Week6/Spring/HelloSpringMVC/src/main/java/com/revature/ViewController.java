package com.revature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("ViewController")
public class ViewController {
	
	
	//This is server side rendering! (What we did for p1)
	//The server is also responsible for controlling the view of the client side, by providing the html resources. 
	//Moving forward, we'll be using Angular mostly!
	
	@GetMapping(value="/myPage")
	public String page() {
//		return "Index.html"; //this will send the request to /HelloSpringMVC/mvc/Index.html (without view resolver)
		
//		return "/html&Css&Js/html/Index.html"; //When we add "/" at the start, it expects a html, or non-Java/controller resource. This is a forward. 
//		return "redirect: https://www.google.com";	
		
		
		//Using the view resolver 
//		return "Index";
		
		
		return "HelloSpringMVC/greetings/hello";
	}

}

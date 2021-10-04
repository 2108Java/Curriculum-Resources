package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 * @author BenjaminArayathel
 * 
 * There are 2 ways to configure our projects, xml configuration or annotation configuration 
 *
 */

@WebServlet("/hello") //the endpoint becomes localhost:<port>/HardWayHello/hello
public class HelloServlet extends HttpServlet{
	
	
	
	/**
	 * 
	 * Servlet is a Java class that allows us to handle requests and responses to the server 
	 * 
	 * 		It extends the capability of the server to execute JAva code with regards to requests and responses. 
	 * 
	 */
	
	
	//Every time a request is handled by this servlet, the service method gets invoked!
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//service method triggers of all verbs!
		
		System.out.println("Inside service method!");
		
		PrintWriter pw = null;
		
		switch(req.getRequestURI()) {
		
		case "localhost:7000/hello":
			
			switch(req.getMethod()){
			case "GET":
				HelloController.sendHello();
				break;
				
			case "HEAD":
				ViewController.sendHello();
				break;
				
			default: 
				resp.setStatus(401);
				
				pw = resp.getWriter();
				
				pw.write("Method is not supported!");
				
			}
		
			
		}
		
		
	}

}

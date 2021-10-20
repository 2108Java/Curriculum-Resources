package com.revature.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * What is an aspect?
 * 		An aspect is a modularization of cross cutting concerns. 
 * 		Inside Jave, it takes the form of a class. You can ALSO think of an aspect as a collection of advices!
 *
 */

@Component("MyAspect")
@Aspect
public class AspectExample {
	
	private static int numberOfExecutions = 0;
	
	//Food controller logging!
	
	@Before("execution(* viewFood())") //specify that this advice will trigger before a particular execution! This method will execute at every method invocation!
	public void beforeAdvice(JoinPoint jp) {
		numberOfExecutions++;
		System.out.println("I'm logging stuff before the viewFood Method is invoked! number of times invoked: " + numberOfExecutions);
		
	}
	
	@After("execution(* viewFood())")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("I'm loggin stuff afterwards to check that it went well!");
	}

}

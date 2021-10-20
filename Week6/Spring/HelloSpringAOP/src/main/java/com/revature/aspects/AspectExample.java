package com.revature.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.service.ProxyApp;

/**
 * 
 * What is an aspect?
 * 		An aspect is a modularization of cross cutting concerns. 
 * 		Inside Java, it takes the form of a class. You can ALSO think of an aspect as a collection of advices!
 * 
 * 
 * Cross Cutting Concern?
 * 		Self review!
 *
 *	What is an advice?
 *		An advice is an action taken by an aspect. In Spring AOP, an advice is triggered by a method invokation. 
 *		In Java, an advice takes the form of a method itself. 
 *
 *	Types of Advices: 
 *		@Before
 *		@After 
 *		@AfterReturning 
 *		@AfterThrowing 
 *		@Around - the most powerful kind of advice
 *
 *	Joinpoints: 
 *		JP are the possible points in the runtime of the porgram WHERE an avice can be invoked.
 *
 *  PointCut: 
 *  	Subset of all the joinpoints. We define which joinpoints (i.e. method invokation) cause our advices to trigger.
 */

@Component("MyAspect")
@Aspect
public class AspectExample {
	
	private static int numberOfExecutions = 0;
	
	//Food controller logging!
	
	@Before("execution(* viewFood())") //specify that this advice will trigger before a particular execution! This method will execute at every method invocation!
	public void beforeAdvice(JoinPoint jp) {
		numberOfExecutions++;
		System.out.println(jp);
		System.out.println("I'm logging stuff before the viewFood Method is invoked! number of times invoked: " + numberOfExecutions);
		
	}
	
	@After("execution(* viewFood())")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("I'm loggin stuff afterwards to check that it went well!");
	}
	
	
//	@Before("execution(* *(..))") //triggering of all methods, regardless of return type, name and parameters we pass in!
//	@Before("execution(boolean *(..))") //triggering of all methods that have a boolean return!
//	@Before("execution(* funMethod(..))") //triggering based on method name!
//	@Before("execution(* *(int,boolean))")
//	public void setup(JoinPoint jp) { //joinpoints are optinoal, recommended because we can utilise them. 
//		System.out.println("---------------------------------------");
//		System.out.println(jp);
//		System.out.println("Invoking setup methods!");
//		System.out.println("---------------------------------------");
//	}
//	
//	
//	//How to trigger a function regardless of datatypes, but with only 1 arguments, 2 or 3 argumetns. 
//	@After("execution(Object *(..))")
//	public void afterwards(JoinPoint jp) { //joinpoints are optinoal, recommended because we can utilise them. 
//		System.out.println("---------------------------------------");
//		System.out.println(jp);
//		System.out.println("Invoking Afterwards!");
//		System.out.println("---------------------------------------");
//	}
	
	
	
	@Around("execution(* funMethod(..))") //Any method that has the name funMethod, with any return type and any kind of arguments!
	public void allAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("---------------------------------------");
		System.out.println("Inside around advice!");
		
		
		
		System.out.println(pjp.getSignature());
		System.out.println(pjp.getArgs().length); //we get an array of all the arguuments passed in!
		
		//If I have a depcreated method! 
		
		if(pjp.getArgs().length < 2) { //I'm stopping the 1 args funMethod from being triggere!

			ProxyApp app = new ProxyApp(); 
			app.funMethod((Integer) pjp.getArgs()[0],false); //whenever this depcreated method is triggered, I inoke the newer version. 
		}else {
			pjp.proceed();
		}
		
		
		
		
		System.out.println("After everything!");
		System.out.println("---------------------------------------");
	}
	
	
	
	
	
	

}

package com.revature.math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationTest {
	
	//Provides meta data to our jvm
	//Allows for additional configurations/behaviours based on the annotatations we provide. 
	
	@BeforeClass
	public static void veryFirstSetup() {
		System.out.println("Hello!");
	}
	
	@Before
	public void beforeTests() {
		System.out.println("Before!");
		System.out.println("-------");
	}
	
	@After
	public void afterTest() {
		System.out.println("-------");
		System.out.println("After!");
	}
	
	@Test
	public void firstTest() {
		System.out.println("first test!");
	}
	
	@Test
	public void secondTest() {
		System.out.println("second test!");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("third test!");
	}
	
	@AfterClass
	public static void finalSetup() {
		
	}

}

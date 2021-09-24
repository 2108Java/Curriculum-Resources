package com.revature.math;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import com.revature.math.exceptions.DivideException;

public class CalculatorTest {
	
	
	//We're not testing the abacus here, so we want a fake version. 
	
	/*
	 * What is Mockito?
	 * 		When we have multiple dependencies on each other, we need to isolate them. 
	 * 
	 * 		We create "perfect" copy of each dependency. 
	 * 			(Regardless of how messed up the real code is) 
	 * 
	 * 		Mockito comes in as an assitant to our JUnit testing framework!
	 */
	
	@Mock
	private Abacus abacus; //fake version of an Abacus. Why?
		//Becausse I'm not testing the abacus and I don't want my calculator to fail
		// because of the abacus
	
	//We want the real calculator - that's what we're testing!
	public Calculator calculator;
	
	@Before
	public void setup() throws Exception {
		
		abacus = mock(Abacus.class); //This tells Mockito to "mock" my Abacus
		calculator = new Calculator(abacus); //I pass the mock object into my calculator. 
		
		when(abacus.add(0, 1)).thenReturn(1.0);
		when(abacus.add(1, 0)).thenReturn(1.0);
		
		when(abacus.add(10, 20)).thenReturn(30.0);
		when(abacus.add(30, 70)).thenReturn(100.0);
		
		when(abacus.add(1000, -500)).thenReturn(30.0);
		when(abacus.add(500, -500)).thenReturn(100.0);
		
		
		when(abacus.divide(100, 100)).thenThrow(DivideException.class);
		
	}
	
	@BeforeClass
	public static void fakeMyAbacus() {
		
//		Abacus a = mock(Abacus.class); //Asking Mockito to take over and fake it. 
//		
//		Mockito.when(abacus.add(0, 0)).thenReturn(0.0);
//		
//		calculator = new Calculator(abacus);
//		
		
		
	}
	

	
	@Test
	public void testMultiply() {
		
		assertEquals(0,calculator.multiply(0), 0.00001);
		assertEquals(0,calculator.multiply(0,0,0,0,0), 0.00001);
		assertEquals(0,calculator.multiply(1,1,1,1,0), 0.00001);
		assertEquals(0,calculator.multiply(127,0,-127), 0.00001);
		
		assertEquals(1,calculator.multiply(1), 0.00001);
		assertEquals(12,calculator.multiply(2,6), 0.00001);
		assertEquals(144,calculator.multiply(12,3,4), 0.00001);
		assertEquals(10000,calculator.multiply(10,10,10,10), 0.00001);
		
	}
	
	//When Unit testing, we want to test the "Unit" in isolation. 
	// The Class or method should not be dependent on another method or class 
	// to PASS a UNIT TEST. 
	
	@Test
	public void testAdd() {
		
		assertEquals(0,calculator.add(0,0,0), 0.00001);
		assertEquals(1,calculator.add(0,1,0), 0.00001);
		assertEquals(100,calculator.add(10,20,70), 0.00001);
		assertEquals(0,calculator.add(1000,-500,-500), 0.00001);
//		assertEquals(-10,calculator.add(1000,1000,-2010), 0.00001);
	}

}

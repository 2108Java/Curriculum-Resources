package com.revature.maths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CasioCalculatorTest {
	
	Calculator c;
	
	//after, before, test, beforeClass, Afterclass
	
	@Before
	public void setupCalculator() {
		System.out.println("Setting up a new calculaotr!");
		c = new CasioCalculator();
	}
	
	@Test //This is an annotation that tells the JVM that his is a testing method
	public void testAdd() {
		
		//For my calculator to pass, it has to satisfy all the assertment statements. 
		
		assertEquals(2, c.add(1,1), 0.000001); //if 2.000000000001 == 2, 2.1 != 2 
		assertEquals(7, c.add(3,4), 0.000001);
		assertEquals(10, c.add(6,4), 0.000001);
		assertEquals(14, c.add(10,4), 0.000001);
		assertEquals(30000006, c.add(3,30000003), 0.000001);
		assertEquals(-2, c.add(-6,4), 0.000001);
		assertEquals(-14, c.add(-10,-4), 0.000001);
		
		assertEquals(-14, c.add(-10,-4,0,0,0,0), 0.000001);
	}
	
	@Test
	public void testMinus() {
		
		//MAKRE SURE YOUR TEST CASES ALSO WORK 
		assertEquals(7,c.minus(3, 10),0.000001);
		
		assertTrue(false);
		assertNotEquals(10, c.minus(3, 4));
		assertFalse(false);
		assertEquals(2,2);
		assertEquals("Strings", "Strings");
		assertThrows(null, null);
	}

}

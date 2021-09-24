package com.revature.math;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.revature.math.exceptions.DivideException;


public class AbacusTest {
	
	private Abacus abacus = new Abacus();
	
	@Test
	public void testAdd() {
		
		//We want to treat these methods as black boces. 
		//Given a input we expect a particular output. 
		//The expected outputs have to match the real outputs to pass the test.
		
		assertEquals(0,abacus.add(0, 0),0.0001); // 0 + 0 ~= 0 (+-0.0001)
		
		assertEquals(1000,abacus.add(500, 500),0.0001); 
		
		assertEquals(27,abacus.add(13, 14),0.0001); 
		
		assertEquals(-39,abacus.add(-30, -9),0.0001); 
		
		assertEquals(-2,abacus.add(10000, -10002),0.0001); 
	
		
		
	}
	
	@Test
	public void testDivide() throws Exception {
		
		assertEquals(0, abacus.divide(0, 10),0.0001);
		
		assertEquals(10, abacus.divide(100, 10),0.0001);
		
		assertEquals(0.1, abacus.divide(10, 100), 0.0001);
			
		//When a 0 is passed into my denominator, I want the method to throw an exception. 
	
	}
	
	@Test(expected = DivideException.class)
	public void throwDivideException() throws DivideException, Exception{
		abacus.divide(10, 0);
	}
	
	@Test(expected = Exception.class)
	public void throwNumber1Exception() throws Exception{
		abacus.divide(10, 1);
	}
	
	

}

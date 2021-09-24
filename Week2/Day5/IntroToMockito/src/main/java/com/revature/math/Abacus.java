package com.revature.math;

import com.revature.math.exceptions.DivideException;

public class Abacus {
	
	public static void main(String[] args) {
		
		System.out.println(0.0/0.0);
		System.out.println(0/0);
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public double divide(double x, double y) throws Exception{
		
		if( y == 0) {
			throw new DivideException("Dividing by 0");
		}else if( y == 1) {
			throw new Exception();
		}
		
		//I just don't like the number 1 or dividing by it. 
		
		
		
		return x/y;
	}

}

package com.revature.maths;

public class CasioCalculator implements Calculator{
	
	private int storedValue;

	@Override
	public double add(double x, double y) {
		
		return x + y;
	}

	@Override
	public double add(double... x) {
		return  x[0];
	}

	@Override
	public double minus(double x, double y) {
		return y-x;
	}

}

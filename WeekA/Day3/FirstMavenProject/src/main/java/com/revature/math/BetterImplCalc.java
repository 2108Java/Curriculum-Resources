package com.revature.math;

public class BetterImplCalc implements Calculator{

	@Override
	public double add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double add(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	public double add(double... x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double minus(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

}

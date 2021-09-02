package com.revature.math;

public interface Calculator {
	//Interfaces are ways of establisihing "contracts" with child classes
	//Interfaces do not have constructors! We cannot directly instantiate a interface!
	
	public double add(int x, int y);
	
	public double add(int x, int y, int z);
	
	public double add(double...x);

	public double minus(double x, double y);
	
}

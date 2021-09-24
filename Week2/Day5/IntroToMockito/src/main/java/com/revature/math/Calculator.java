package com.revature.math;

public class Calculator {
	
	//Rather than rebuilding all the code.
	//We're going to have a abacus inisde it (HAS-A relationship)
	
	public Abacus abacus;
	
	
	
	
	public Abacus getAbacus() {
		return abacus;
	}

	public void setAbacus(Abacus abacus) {
		this.abacus = abacus;
	}

	public Calculator(Abacus abacus) {
		this.abacus = abacus;
	}
	
	public double add(double x, double y, double z) {
		
		double initialSum = abacus.add(x, y);
		double fullSum = abacus.add(initialSum, z);
		
		return fullSum;
		
	}
	
	public double divide(double x, double y) throws Exception {
		return this.abacus.divide(x, y);
	}
	
	public double multiply(double...x) {
		
		double sum = 1;
		
		for(double i: x) {
			sum *= i;
		}
		
		return sum;
	}

}

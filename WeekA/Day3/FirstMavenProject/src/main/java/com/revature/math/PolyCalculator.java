package com.revature.math;

public class PolyCalculator {
	
	
	public double add(int x, int y) {
		return x + y;
	}
	
//	private int add(int a, int b ) { //changing the access modifeir, return type and parameters names
//										//will not achieve overloading
//		return 0;
//	}
	
	public double add(int x, int y, int z) { //different number of arguments
		return x + y + z;
	}
	
	public int add(int x, int y, String z) {
		return 0;
	}
	
	public int add(String z, int x, int y) {
		return 1;
	}
	
//	public int add(String x, int y, int z) {
//		return 1;
//	}
	
	public int add(int... x ) {//var args 
		
		int total = 0;
		
		for(int i = 0; i<x.length; i++) {
			total+=x[i];
		}
		
		return total;
	}
	
//	public double add(int[] arrayOfInts) { //different datatype int vs int[]
//		
//		double total = 0;
//		
//		for(int i = 0; i< arrayOfInts.length; i++) {
//			total += arrayOfInts[i];
//		}
//		
//		return total;
//	}
	
	public static void main(String[] args) {
		
		PolyCalculator calc = new PolyCalculator();
		
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(2, 3, 4));
		System.out.println(calc.add(1, 1, "String"));
		System.out.println(calc.add("String", 1, 1));
		
		int[] intArray = {3,4,5};
		
		System.out.println(calc.add(intArray));
		System.out.println(calc.add(1,2,3,4,5,6,6,7));
		
	}

}

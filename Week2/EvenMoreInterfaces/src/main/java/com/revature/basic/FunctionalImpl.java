package com.revature.basic;

public class FunctionalImpl implements Functional {

	@Override
	public double doStuff(String s, int i) {

		System.out.println("Does something!");
		return 27;
	}

}

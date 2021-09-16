package com.revature.models;

public class Garbage {
	
	private static int numberOfGarbageCreated = 0;
	private static int numberOfGarbageRemoved = 0;
	
	public Garbage() {
		numberOfGarbageCreated++;
		System.out.println("I'm being created! " + numberOfGarbageCreated);
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		numberOfGarbageRemoved++;
		System.out.println("I'm being destroyed! " + numberOfGarbageRemoved);
	}

}

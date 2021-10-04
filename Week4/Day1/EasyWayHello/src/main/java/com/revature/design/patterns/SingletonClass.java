package com.revature.design.patterns;


/*
 * Singleton? 
 * 		There is only a single instance of this! 
 * 		We want to create something once, and stop it from ever being created again!
 * 
 * 
 * 		lazy-loaded and eager loaded: 
 * 			lazy loaded: the singleton is only created once we call the method!
 * 			eager loaded: we load up the singleton, even if we don't call it!
 */
public class SingletonClass {
	
	//the default constructor is provided, but I don't have control over it!
	
	private static SingletonClass mySing = new SingletonClass();
	
	private SingletonClass() {
		System.out.println("I'm being created!");
	}

	
	public static SingletonClass getSingleton() {
		
		//check if the singletonClass has been invoked before? 
		
//		if(mySing == null) {
//			mySing = new SingletonClass();
//		}else {
//			//it's been instantiated before!
//			//so we don't do anything about it!
//		}
		
		return mySing;
	}
}

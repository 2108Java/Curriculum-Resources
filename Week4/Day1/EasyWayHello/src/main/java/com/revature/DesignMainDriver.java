package com.revature;

import com.revature.design.patterns.Car;
import com.revature.design.patterns.FactoryDesignClass;
import com.revature.design.patterns.SingletonClass;

public class DesignMainDriver {

	
		public static void main(String[] args) {
			
			System.out.println(SingletonClass.class);
			
			SingletonClass sing = SingletonClass.getSingleton();
			SingletonClass sing2 = SingletonClass.getSingleton();
			SingletonClass.getSingleton();
			
			sing = null;
			sing2 = null; 
			
			SingletonClass sing3 = sing; //won't work 
			sing3 = sing2; //null
			
			sing3 = SingletonClass.getSingleton();
			
			//final: not able to modify the variable (reassign) 
//					class: not extendable
//					method: not overridable 
			//private: restricts access to the class: 
			
			
			Car c1 = FactoryDesignClass.getCar("RED"); //I don't need to know how thcar is made, jsut what to provide the factory
			Car c2 = FactoryDesignClass.getCar("GREEN");
			
		}
}

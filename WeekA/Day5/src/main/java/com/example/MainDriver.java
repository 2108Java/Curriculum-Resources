package com.example;

import com.example.cars.Honda;
import com.example.cars.Mercedes;
import com.example.cars.Toyota;
import com.example.cars.Truck;
import com.example.models.Athlete;
import com.example.models.Car;
import com.example.models.Human;
import com.example.models.Superhero;

public class MainDriver {
	
	public static void aMethod(Car car) {
		System.out.println(car);
		
		Car newCar = new Car();
		
	}
	
	public static void truckMethod(Truck t) {
		
	}
	
	public static void main(String[] apples) {
		
		
//		int a; //declaring a primitive variable 
//		a = 1;
//		
//		double b = 2.0;
//		
//		double c = b;
//		
//		
////		System.out.println(b);
////		System.out.println(c);
//		
//		
//		
//		
//		Object o = new Object();
//		
//		Car car = new Car();
//		
//		car.setFuel(10);
//		
//		Car car2 = car;
//		
//		Car car3 = car2;
//		
//		Object o2 = new Car(); // My Car object still inherits everything from Object
//		
////		o2.setFuel(10); Object does not know that it is a Car
//		
//		
////		Car objectCar = new Object(); //The Object class does not have fuel, and no getters or setters. 
//		
//		
//		
//		car3.setFuel(5);
//		
//		System.out.println(car.getFuel());
//		System.out.println(car2.getFuel());
//		System.out.println(car3.getFuel());
		
		
		
		
		Object o = new Object();
		Human h = new Human();
		Athlete a = new Athlete();
		
		Superhero kent = new Superhero();
		
		
		h.walk();
		
		a.walk();
		a.run();
		
		kent.walk();
		kent.run();
		kent.fly();
		
		
		Human mcBobby = new Superhero(); //mcBobby is an athlete, but a superhero under the hood
		
		mcBobby.walk();
//		mcBobby.run();
//		mcBobby.fly();
		
		
		Superhero marvel = (Superhero) mcBobby;
		
		marvel.walk();
		marvel.run();
		marvel.fly();
		
		
		Superhero bruce = (Superhero) new Human();
		
		bruce.fly();
		
		
		
		
		//ABSTRACTION PORTION
		
		
		Truck t = new Honda();
		t.accelerate();
//		t.automaticWindow();
		
		truckMethod(t);
		
		Mercedes t2 = new Mercedes();
		
		
		t = new Mercedes();
		
		truckMethod(t);
		
		t = new Toyota();
		t.accelerate();
		
	}

}

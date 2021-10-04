package com.revature.design.patterns;

public class FactoryDesignClass {
	
	//Is a way of abstracting the production of objects/netites 
	
	
	public static Car getCar(String color) {
		
		
		switch(color.toUpperCase()) {
			case "RED":
				
				Car redCar = new Car(0, "RED", 10000);
				
				return redCar;
			case "BLUE":
				Car blueCar = new Car(1, "RED", 1000);
				return blueCar;
			case "GREEN":
				Car greenCar = new Car(2, "RED", 1000);
				return greenCar;
			default: 
				Car fakeCar = null;
				return fakeCar;
		}
	}

}

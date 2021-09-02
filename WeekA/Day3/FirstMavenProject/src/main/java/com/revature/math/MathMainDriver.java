package com.revature.math;

public class MathMainDriver {

	public static void main(String[] args) {


		Calculator c = new CalculatorImpl();
		Calculator c2 = new BetterImplCalc();
		Calculator c3 = new TylerCalcuator();
		
		
		c.add(1,2);
		c2.add(2,3);
		c3.add(2,3);

	}

}

package com.revature.models;

import java.util.Comparator;

public class FruitPriceComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {

		int value = 0;
		if(o1.getPrice() > o2.getPrice()) {
			
			value = 10000000;
			
		}else if(o1.getPrice() < o2.getPrice()) {
			
			value = -1;
			
		}else if(o1.getPrice() == o2.getPrice()) {
			
			value = 0;
		}
		
		return value;
	}

}

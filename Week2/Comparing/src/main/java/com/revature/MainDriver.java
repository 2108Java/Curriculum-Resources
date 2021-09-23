package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.models.Fruit;
import com.revature.models.FruitPriceComparator;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> integerSet = new HashSet<>(); //sets aren't sorted either. 
		
		integerSet.add(111);
		integerSet.add(11);
		integerSet.add(10);
		integerSet.add(12);
		integerSet.add(1);
		integerSet.add(13);
		integerSet.add(0);
		integerSet.add(-10);
		
		
//		for(Integer i: integerSet) {
//			System.out.println(i);
//		}
		
//		Collections.sort(integerSet); //sort method will not work on sets. 
		
//		List<Integer> integerList = (List<Integer>) integerSet;
		
//		List<Integer> integerList = new ArrayList<>(integerSet);
//		
//		System.out.println(integerList);
//		
//		Collections.sort(integerList);
//		
//		System.out.println(integerList);
//		
//		List<String> stringList = new ArrayList<>();
//		stringList.add("Zoo");
//		stringList.add("Xylephone");
//		stringList.add("apples");
//		stringList.add("kiwi");
//		
//		System.out.println(stringList);
//		
//		Collections.sort(stringList); //lexilogical ordering. [A-Z] < [a-z] 
//		
//		System.out.println(stringList);
		
		
		List<Fruit> fruitList = new ArrayList<>();
		
		fruitList.add(new Fruit("Apples", 10));
		fruitList.add(new Fruit("Kiwi", 7));
		fruitList.add(new Fruit("Tomato", 2));
		fruitList.add(new Fruit("WaterMelon", 100));
		fruitList.add(new Fruit("Mango", 7));
		fruitList.add(new Fruit("Banana", 1000));
		
		
		//Using Comparable and Comparator interfaces!
		
		System.out.println(fruitList);
		
		Collections.sort(fruitList); //sort it by alphabetical order. 
		
		System.out.println(fruitList);
		
		Collections.sort(fruitList, new FruitPriceComparator()); //sort by price
		
		System.out.println(fruitList); 
		
		
		//Feature of Java 8. 
		Comparator<Fruit> price = (o1,o2)->{
			return (int) (o1.getPrice()-o2.getPrice());
		};
		
		Collections.sort(fruitList, price);
		
		System.out.println(fruitList);

	}

}

package com.revature.view;

import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.revature.MainDriver;

public class View {
	
	private static final Logger loggy = Logger.getLogger(View.class);
	
	public void display() {
		
		loggy.setLevel(Level.ALL);
		
		System.out.println("Select option 0, 1 or 2");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		loggy.info("User put in the option :" + input);
		
		loggy.setLevel(Level.WARN);
		switch(input) {
		
		case "0":
//			System.out.println("User selected 0");
			loggy.info("User selected 0");
			break;
		case "1":
//			System.out.println("User selected 1");
			loggy.info("User selected 1");
			break;
		case "2":
//			System.out.println("User selected 2");
			loggy.info("User selected 2");
			break;
		default:
			loggy.warn("User did not select any valid options!");
			
		}
	}

}

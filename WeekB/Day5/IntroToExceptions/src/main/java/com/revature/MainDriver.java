package com.revature;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var a; //This is not an exception , this is just gibberish. 
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Unchecked exception 
		 * 		Are unlikely to happen , or at least that's what the developers that created 
		 * 		the libraries or code believe. 
		 * 
		 * 		They don't force you to handle/prepare for it. 
		 */
		
		/*
		 * try catch blocks. 
		 * 
		 * try catch blocks are used to execute "risky" code, with a backup plan if it doesn't work
		 */
		
		try {//Risky code
			//unchecked exception
			int number = Integer.parseInt(sc.nextLine());
			
			System.out.println("You've printed the number: " + number);
			
			
		}catch(NumberFormatException exceptionObject) { //back up plan, that SHOULD be safe code
			
			exceptionObject.printStackTrace();
			
			System.out.println("Invalid number!");
			
			System.out.println("Make sure to input an actual number next time!");
			
			
		}
		
		
		System.out.println("Youve made it to the end!");
		
//		throw new NumberFormatException();
		
		
//		
//		//unchecked exception 
//		Object o = new String();
//		String aString = (String) new Object();
		
	

		
		

	}

}

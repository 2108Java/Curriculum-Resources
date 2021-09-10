package com.revature;

import java.util.Scanner;

import com.revature.exceptions.CustomException;

public class MainDriver {
	
	public static String badMethod() throws Exception{
		//anyone that uses this method is aware of the dangers of it!
		
		throw new RuntimeException();
		
		
	}

	public static void anotherMethod() throws Exception{
		String results = badMethod();
		System.out.println("Method worked! " + results);
	}
	
	public static void businessMethod() throws CustomException{
		//risky logic 
		throw new CustomException("business method going wrong!");
	}
	
	public static void anotherBusinessMethod() {
		try {
			businessMethod();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			businessMethod();
		}catch(CustomException e) {
			e.printStackTrace();
		}
		
		
		
//		try {
//			badMethod();
//			System.out.println("After bad");
//			
//			anotherMethod();
//			
//			System.out.println("After another");
//		}catch(Exception e) {
//			
//			System.out.println("Bad method did not work!");
//			System.out.println("This is only executed if something goes wrong. ");
//		}finally {
//			System.out.println("This part of the code will execute in all cases!"
//					+ ""
//					+ "regardless of an expetion being thrown. ");
//		}
//		
//		try {
//			anotherMethod();
//		}catch(Exception e) {
//			System.out.println("This method also did not work!");
//		}
		
		
//		System.out.println("Hello!");
		
		
		
		
		
		
//		var a; //This is not an exception , this is just gibberish. 
		
//		Scanner sc = new Scanner(System.in);
		
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
		 * 
		 * 
		 * 
		 * try catch blocks 
		 * try catch finally blocks 
		 * try finally blocks 
		 * 
		 * 
		 * You CANNOT have a try block on it's own
		 */
		
//		try {//Risky code
//			//unchecked exception
//			int number = Integer.parseInt(sc.nextLine());
//			
//			System.out.println("You've printed the number: " + number);
//			
//			
//		}catch(NumberFormatException exceptionObject) { //back up plan, that SHOULD be safe code
//			
//			exceptionObject.printStackTrace();
//			
//			System.out.println("Invalid number!");
//			
//			System.out.println("Make sure to input an actual number next time!");
//			
//		}catch(ClassCastException e) {
//			System.out.println("We'll never reach here!");
//		}
//		
//		catch(RuntimeException e) {
//			System.out.println("A runtime exception was thrown");
//		}catch(Exception e) {
//			System.out.println("An exception was thrown!");
//		}catch(Throwable e) {
//			System.out.println("I don't knwo waht happeend!");
//		}finally {
//			
//			System.out.println("Will execute regardless of what happens");
//			
//			
//		}
		
		
//		System.out.println("Youve made it to the end!");
		
//		throw new NumberFormatException();
		
		
//		
//		//unchecked exception 
//		Object o = new String();
//		String aString = (String) new Object();
		
		
//		throw new RuntimeException(); //parent of every unchecked exception 
		
		
		//Checked exceptions are exceptions that you are forced to handle (or declare)
		// Checked exceptions are not "worse" 
		// Developers create checked exceptions because they think it's likely to happen!
//		try {
//			throw new Exception(); 
//		}catch(Throwable e) {
//			System.out.println("Hello!");
//		}
//		
		
	

		
		

	}

}

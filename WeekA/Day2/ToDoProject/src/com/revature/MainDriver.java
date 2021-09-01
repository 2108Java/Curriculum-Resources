package com.revature;

import java.util.Scanner;

import com.revature.models.Task;

public class MainDriver {
	
	
	public static void prettyDisplayOfTasks(Task[] taskArray) {
		
		for(int i = 0; i < taskArray.length; i++) {
			//check if task array is not null 
			
			if(taskArray[i] != null) { //Checks that the current element is not null 
				System.out.println(taskArray[i].description);
				
				
				if(taskArray[i].complete) {
					System.out.println("Task is complete!");
				}else {
					System.out.println("Task is incomplete!");
				}
				System.out.println("");
				
			}
			
		}
			
		
	}
	
	public static Task[] createDummyList() {
		
		Task t = new Task("Complete Hwk");
		Task t1 = new Task("Complete Hwk 2");
		Task t2 = new Task("Complete laundry");
		Task t3 = new Task("Complete Hwk 3");
		Task t4 = new Task("Complete Hwk 4");
		Task t5 = new Task("Mow the lawn");
		
		//We're on a budget, so we can only have 10 tasks at a time
		Task[] taskList = new Task[10];
//		
		taskList[0] = t;
		taskList[1] = new Task("Clean the bedroom");
		taskList[2] = t3;
		taskList[3] = t4;
		taskList[4] = t5;
		
//		System.out.println(taskList); //The array is a very basic data structure, 
									  //by default it will only print its memory location
		
		
		//challenge
		return taskList;
		
	}
	
	public static Task[] addTaskToTaskArray(Task[] taskList, Task newTask) {
		
		boolean listFull = true;
		
		for(int i = 0; i<taskList.length; i++) {
			
			if(taskList[i] == null) { //When I find my first null value, I'll add my task
				
				listFull = false;
				
				taskList[i] = newTask; //adding my task 
				break; //break out of the loop to stop me adding the tas over and over again. 
			}
		}
		
		if(listFull) {
			System.out.println("Unable to add tasks, delete a task!");
		}
		
		return taskList;
	}
	
	public static boolean isFull(Task[] taskList) {
		
		boolean listFull = true;
		
		for(int i = 0; i<taskList.length; i++) {
			
			if(taskList[i] == null) { //When I find my first null value, I'll add my task
				
				listFull = false;
				
				break; //break out of the loop to stop me adding the tas over and over again. 
			}
		}
		
		return listFull;
	}
	
	public static Task[] deleteTask(Task[] taskList, Scanner sc) {
		return null;
	}
	
	public static void main(String[] args) {
		
		
		//dummy list
		Task[] listOfTasks = createDummyList();
		
		
		//Scaner allows me to take in inputs from users on the terminal 
		
//		Scanner sc;
//		
//		sc = new Scanner(System.in); //Creatinga  scanner object that reads from the terimnal 
//		
//		int a = sc.nextInt();
//		
//		double b = sc.nextDouble();
//		
//		String c = sc.nextLine();
//		
//		String d = sc.nextLine();
//		
//		System.out.println("a " + a);
//		System.out.println("b " + b);
//		System.out.println("c " + c);
//		System.out.println("d " + d);
		
		
		
		Scanner sc = new Scanner(System.in); //We instantiate a scanner object to read it!
		
		
		//Scanner object allows us to write into the terminal 
		
		System.out.println("Hello, please print out your name!"); //Tell the user to print their name
		
		String name = sc.nextLine(); //whatever value the user passes through, will be stored in name!
		
		System.out.println("Here's your name! " + name); //We printing their name back to them!
		
		System.out.println("Here is your list of tasks! (You can only have up to 10)");
		
//		Task[] listOfTasks = new Task[10];
		
		prettyDisplayOfTasks(listOfTasks); //print out an empty list, they don't have a task
		
		do {
		
		System.out.println("What task would you like to add to the list?");
		
		String description = sc.nextLine(); //ask them for a task description
		
//		System.out.println(newTask);
		
		Task newTaskObject = new Task(description); //once task has been made, add it to array
				
		Task[] newTaskList = addTaskToTaskArray(listOfTasks, newTaskObject);
		
		
		prettyDisplayOfTasks(newTaskList);
		}while(!isFull(listOfTasks));
		
//		System.out.println("Your task: " + newTaskObject.description);
	}

}

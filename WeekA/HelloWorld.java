
public class HelloWorld{

//This is a comment
//Comments are not read by the machine
//They are after "//"


/*
*	What is Java?
*		Programming language
*		Object oriented programming language
*		Write Once Run Anywhere 
*		Based of the C syntax
*		Is it dynamically typed? (Datatypes can be converted) --- Actually Strongly typed
*		Does not support multiple inheritance
*		Class based 
*		4 pillars to it - Abstraction, Encapsulation, Inheritance, Polymorphism
*
*		Is a general purpose programming language, follows the (Object Oriented programming) OOP paradime.
*		Mostly used for enterprise software applications 
*		Strongly typed language. 
*
*		What are the features?
*			WORA (Write Once Run Anywhere). Java code is turned into bytecode, bytecode is then converted into 
*			machine code by the JVM (Java Virtual Machine) . Anything that can run a JVM, can run Java code.
*	
*			OOP
*
*			Garbage Collection (Automatic memory management)
*	
*			Java is simple (Based on C)
*
*			Java is secure 
*
*			Java is open source 
*
*
*
*/

public static void main(String[] args){ //Basically tells the "machine" i.e. JVM to begin executing the code!

	System.out.println(args[0]); //This is a print statement 


	//Java is not entirely based around objects, we have primitives as well. 

	//int : 4 byte
	//boolean : 1 byte 
	//char : 2 byte
	//double : 8 byte
	//float : 4 byte
	//long : 8 byte
	//short : 2 byte 
	//byte : 1 byte : 8 bit
	
	// Datatype variable = value;
	int x = 27;
	double y = 7.0;

	//x = y; //will not work, because x can't store all the information that y has. 
	y = x; // beacause double is bigger than int. 

	System.out.println(x); //printing out int
	System.out.println(y); //printing out double

	double z = 7.0301;
	System.out.println(z);

	//declaration - declares a variable that can store a value
	boolean myBool; 

	//assigment
	myBool = true;


	


	//for loops 

	//for(
	//	initail starting condition;
	//	terminating condition;
	//	incrementating condition
	// ) 

	for(int i = -10 ; i >= -30; i = i - 3){
		System.out.println("I'm inside a for loop");
		System.out.println("Currently on: " + i);
	}

	for(int i = 0 ; i < args.length; i++){
		
		System.out.println(args[i]); //this will print out the ith element of the array !

	}

		
	//while loops 
	
	//while(conditional statement) 

	while(myBool){
		System.out.println("My Boolean is true");
		myBool = false;

		System.out.println("My Boolean is now false!");
		}
		
	//do while loops 

	do{
		System.out.println("Boolean is still false");
		}
	while(myBool);
	
		
	//if and else if 
	// if the user inputs a number greater than 12

	//switch statements
	// if the user inputs apple or kiwi 
}

}




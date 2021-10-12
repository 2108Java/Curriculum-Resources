console.log("Hello World!");

/**
 * Typescript is a superset of Javascript
 * Perfectly valid JS code is also valid TS code 
 * 
 * Our typescript compiler will turn into js code, but it will follow it's own style of coding. 
 * 
 * Datatypes for TS 
 * 
 * Control flow statements :
 *      for
 *      while
 *      switch 
 *      if 
 *      try-catch ? 
 *      
 * function : 
 *      IIFE 
 *      Callback function 
 *      arrow noatation function 
 * 
 * OOP: 
 *      inheritance
 *      abstraction
 *      polymorphism 
 *      encapsulation 
 */

let s = "hello from a variable";
let s4: any = "can be anything";

console.log(s);

//Strongly typed variables 
let s2 : number = 2; //this declares s2 has a number variable 
let s3: number| string | boolean = true; //we still get the flexbility of js, to an extend 


//How is this different to Java?
//No return type 
// no variable type 
function  myFuction(x: number ,y: number | boolean ,z : any) : boolean {
    return true;
}

console.log(myFuction(true,true,true));


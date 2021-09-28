// console.log("Hello");

//This is an inline comment. 

/*
    This is a block comment. 

    Javascript is a loosely typed, interpreted, object-based, scripting language (that's also dynamic)

    Conceived to create additional functionality to our webpages. 

    Benefits of JS?
        Less server interfaction. 
        Increased interactivity on our web pages. 

    Fun little features like ASI (Automatic semicolon insertion)
*/

/**
 * 
 * What are the datatypes in Javascript?
 * 
 * number 
 * bigint - ES10
 * 
 * undefined 
 * null
 * 
 * string
 * 
 * boolean 
 * 
 * symbol (unique and immutable primitive value, can be used as the key for an object) - ES6
 * 
 * objects 
 * arrays 
 * function
 * 
 */

/**
 * What is ES6?
 *      Scripting languages follow a standard set by a organisaction called ECMAS.
 *      Javascript being a scripting language follows these standards.
 *      ES6 a standard introduced in 2015, EcmaScript 2015. Which introduced new features 
 *          and datatypes for developers.
 *      ECMA is an international body that sets that standard for all scripting languages. 
 * 
 *      fat arrow notation 
 *      let and const 
 *      template literals 
 *      class declarations 
 */


/**
 * In JS, you don't need to declare a datatype. (loosely typed)
 * When we declare a variable, we don't assign a datatype to it. 
 * 
 * int a = 1;
 * String b = "a String";
 * a can't be equal to b
 */

//We use var (prior to ES6) to declare variables. 

var a //when we declare a variable, but don't assign it to anything it is a "undefined" value 
a = 1;
a = "A string";
a = true ;
a = null ;
a = [];

// console.log(a);

//Post ES6 we get 2 more declaration terms, let and const 
//let, var and const are NOT datatypes. 

let b = 7;
b = "another value";

const c = "a string"; //const variables cannot be resassigned another value. 
// c = "another string";

// console.log(b);

// console.log(c);

//---------------------------------------------------------------------------------------------------

//var vs let ? Why was let introduced in the first place. 
//scopes. 
//  Block: within conditional statements (control flow statements) 
//  Local: function/object scope 
//  Global: accessible anywhere. 


/**
 * var values ahve scope bleed. 
 * When we declare and assign values inside of our block scopes. var variables will bleed into 
 *  local or global scopes. 
 * 
 * var variable can only support global and local scopes. 
 * 
 * let variables can support, local, global and block scopes. 
 * 
 * const variable can support, local, global and block scopes. it also stops the variable from being reassigned a value. 
 */

// if(true){
//     var value = "inside block scope!"
//     console.log(value);

//     let anotherValue = "let value";
//     console.log(anotherValue);
// }

// for(var i = 0;i<10;i++){
//     console.log(i);
// }

// for(i; i< 20; i++){
//     console.log(i);
// }

// console.log(value);
// console.log(anotherValue);

//-------------------------------------------------------------------------------------------
//CREATING AN ARRAY 

//In Javascript we declare an array like a variable 
// an array is mutable in size. (the array can be resized on the fly )
// an array does not need to have the same datatypes. 

let arrayOfPlanets;
arrayOfPlanets = [[],1,"String",true,null,"Earth",["Mars",2],{"name":"Mercury","moons":2}];

arrayOfPlanets[27] = "Pluto"; //we can select positions that aren't yet defined. 
                                // JS will simply add empty sizes to resize the array. 

// console.log(arrayOfPlanets);

arrayOfPlanets[26] = arrayOfPlanets;

// console.log(arrayOfPlanets[6][0]);

//---------------------------------------------------------------------------------------------
//Creating an Object 

let myObject; //We just declared a variable that can store an object. 
myObject = {}; //We just mand an object! Unlike in Java, we don't need the "new" or a constructor. 

//Objects in JS are effectively key value pairs
//The key can be a string or a variable made on the fly. 

//(JSON, Javascript Object Notation)
//This is the syntax we are going to send information over to our server and back (but in text format)


//JS has support for objects. 
//We don't need classes or constructors to instantiate objects in JS
//In JS we can use "Object literals", by using key value pairs enclosed in {};
//JS is also dynamic, i.e. objects can be changed during rumtime. 

let planet = {
    name: "Earth",
    "distance": 1,
    humans: true
}

planet.weather = "Quite lovely!";

let planet2 = {
    name: "Mercury",
    "distance": 0.1,
    "humans": true, 
    "weather": "Quite Hot"
}

// console.log(planet);
// console.log(planet2);
// console.log(planet.weather);

// we will create a special kind of constructor, using our function datatype. 
//utilising the "this" keyword allows us to associate it with an object.  

function Planet(name,distance,humans){
    this.name = name;
    this.distance = distance;
    this.humans = humans; 
}

let planet3 = new Planet("Pluto",100,false);
planet3.weather = "quite chilly";

// console.log(planet3);

//-------------------------------------------------------------------------------------
//Function 
//In JS we don't define the datatypes of our function paramenters. 
//Don't declare the return type of our function. 

// printStuff(); //invoke the function
// let a1 = add(10,20);


// function printStuff(){ //declare the function
//     let g = 7;
//     console.log(g);
// }

// function add(x,y){
//     console.log(typeof(x));
//     console.log(x+y);
//     return x+y;
// }

//-------------------------------------------------------------------------------------------------
//Anonymous functions 

//we're storing a function within our variable
// let anon = function(a,b){
//     return a*b;
// }
// console.log(anon);
// console.log(anon(10,20));

// anon = 7;

// console.log(anon);

//-------------------------------------------------------------------------------------------------
//Callback functions 
// passes a function as a parameter to another function. 

// function travel(destination, myFunc){
//     console.log("travelling to " + destination);
//     myFunc(); // we're invoking the function inside of our parent function. 
//     theWeather(); //theWeather will AWLAYS be invoked, regardless of what I pass in. 
// }

// function theWeather(){
//     console.log("it's quite warm!")
// }

// travel("India",theWeather); //we're passing in a string and a function 
// travel("Nigeria",printStuff); //we can pass in different functions into our function. 

//------------------------------------------------------------------------------------------------
//(ES6) Fat Arrow Notation.

// let arrow = (x,y) => {return x/y};
// let sayHello = names =>{
//     console.log(names + " says hello!")
// }

// sayHello("Bob");

//------------------------------------------------------------------------------------------------
//Self Invoking Function 
//Functions taht call themselves straightaway. 
//IIFE - Immediately Invokable Function Expression. 
//executes automatically if the expression is followed by paranethesis. 

// let func1 = function(){
//     console.log("Inside IIFE");
// }();

//-------------------------------------------------------------------------------------------------
//Hoisting
//Interpreted vs Compiled. 
// We don't need a compiler to run the code. Just an HTML file. 
// Interpreter (with JS, it is the browser.) will read code line by line. 
// Compiled code, the code is first compiled. Then executed. 

/**
 * 
 * When we declare a variable or a function, it's declaration gets automatically moved to the top
 *  of its respective scope. 
 * This is automatic and done by the browser whenever it sees a JS file. 
 * 
 * var, let and const get move upd, but let and const blocks this behaviour
 *      with variables, you only move the declaration and not the assignment. 
 * functions: 
 *      Are hoisted completely, with funciton body as well. 
 */



console.log(fruit);
var fruit = "apples";

//-------------------------------------------------------------------------------------------
//Truthy and Falsey values. 
// EVERYTHING has a true or false boolean value, when used in a conditioanl statement. 
    // falsy values
    /**
     * Let you guys discover the rest. 
     *  0 
     *  undefined. 
     * 
     */

let k; //undefined: a falsy value 
k = -1000; // k is now a number 
// k = 100000;
// k = 0; //falsy value, every other number is truthy;
// k = -0; // also falsy

// if(k){
//     console.log(k + " is truthy!")
// }

//------------------------------------------------------------------------------------
//Control Flow statments

//----------------------------
// if, else and else if 
// if(!k){
//     console.log("k is falsy")
// }else if ( k == 1){

// }else{
//     console.log(" k is truthy")
// }

//----------------------------
// switch 
// switch(k){
//     case 2:
//             console.log("inside case!")
//             break 
//     case "-1000": //what kind of operation are we doing? === 
//             console.log("inside another case")
//             break;
//     default:
//         console.log("none of the cases have been met!");

// }

//---------------------------
//Traditional For loop s
//For each loop 
//For in loop 


//Traditional 
// for(let i = 0;i<10; i++){
//     console.log(i);
// }

//For each loop, we use with an iterable entity. i.e. arrays
let foods = ["cakes","apples","pizza","kiwi"];
foods[4] = foods;

// for(let item of foods){
//     console.log(item);
// }
//Back to Java, we can use with List, arrays, any data structure that is iterable (i.e. implements Iterable interface)
// for(Object o: Object){};


//For in loop
let jupiter = {"name":"Jupiter","distance":2,humans:false};

// console.log(jupiter.name); //dot notation
// console.log(jupiter["name"]); //bracket notation

// for(let attribute in jupiter){
    
//     console.log("key: " + attribute + "|" +"value: " + jupiter[attribute]);

// }

//---------------------------------------------------------------------------------------------
//Comparison Operators

let test1 = 1;
let test2 = "1";

// == does not check the type only the value. 
// == does type coercion, where it automatically converts the value into the right datatype. 
console.log(test1==test2); //returns a true value

console.log(test1 === test2) //returns a false, because types don't match. 

/**
 * comparison operators 
 * 
 * == 
 * ===
 * != 
 * >=
 * <= 
 * 
 */

console.log(typeof(test1));
console.log(typeof(test2)); //check the datatype

let anon = function(a,b){
    return a*b;
}

console.log(typeof(anon));

//Sometimes we want to do mathematical operations, so we want to just check if it's a number. 

console.log(isNaN(2)); //isNaN() is a function of the browser, checks if something is not a number 

console.log(isNaN(1/0)); //isNaN() can be used to check if we get a valid result back from an operation. 

console.log(0*(1/0)); //this is an example of not checking before we do an opertaion. 0*infinity is NaN. 

//NaN is NOT a datatype or a keyword!
// isNaN: a  function tath returns true if variable is not a type of number
// 1) 0/0
// 2) Infinity/Infinity
// 3) 0*Infinity
// 4) Converting a string into a number e.g. "apples" -> NaN 

console.log(typeof(NaN)); //NaN is defined to be of a number datatype. 

//------------------------------------------------------------------------------------------------

//(ES6) Template Literal Strings 
//It's much easier to create strings and format them !

let namePerson = "Ben";
//If I wanted to create a space in my statement. 
console.log(namePerson + " says " + "\n hello!");

console.log(` ${namePerson}
                            says 
                                                    Hello!`)







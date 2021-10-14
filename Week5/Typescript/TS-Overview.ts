/**
 * What is TS?
 *  TS was developed for larger applications. The syntax is closer to Java or C#
 * 
 *  TS is strongly typed, easier to debug. 
 * 
 *  We can install typescript from npm using: 
 *      "npm install -g typescript"
 * (npm comes with a node.js install)
 * 
 * We can transpile TS into JS using: 
 * 
 *  "tsc *filename*.ts"
 * 
 * We can ask TS to target a particular version of JS 
 * 
 *  "tsc -t <version> *filename*.ts"
 *  tsc -t es2015 TS-Overview.ts
 *
 * With future version of JS we get more feature, however not all browsers can support the latest versions of Js. 
 * Typescript is the best of both worlds, we get all the latest features provided by ECMA but we can also compile into 
 * 		older version of JS to let the scripts run in browsers. 
 * 
 * Why transpile rather than compile?
 *  (compiling is when we go from a higher level language (more abstraction) -> lower level code (bytecode))
 * 
 *  Transpiling is where we convert a similar level language into another language, TS -> JS 
 */


/**
 * datatypes we get from JS: 
 *  boolean, number, array, object, undefined, string, null, symbol 
 */

let s: number|boolean|string = 1;

s = "a string";

//null, void, undefined 
let v1: null| string = null;
let v2: void = null; 
let v3: null = undefined;
let v4: undefined = null;
// let v5: null = void; because void isn't a actually value 

//Objects: 
let o1: object| Object | {}; //examples of "object" that we can have 
let o2: {};
o2 = {"key": "value", key2: "another value"};
o2 = undefined;

let o3: Object;
o3 = {"key": "value", key2: "another value"};
o3 = undefined;
o3 = null;

let o4: {name: number}; //we can specify the key value pairs, and the name of the key, and the datype 
                        //of the value. 
o4 = {name:1};




//Arrays 
//How do arrays work in JS?
//arrays can have different data types 
//Can have nested arrays 
//arrays are resizable in JS 

let a1: Array<number>; //have an array of numbers 
let a2: number[]; //also an array of numbers, just syntax difference 
let a3: any[] | string ; //using an array of any datatypes. 

a1 = [1,2,2.3,4];
a1[5] = 7;

// a1[6] = "string";
// a1 = ["a string", true, 0];

//Tuples 
// Like an array, immutable 
// fized size and the datatypes have to be in a specific order 
let tuple1: [string,boolean,number];
tuple1 = ['hola',false,0];


//Enum 
/**
 * Specific values, can only be those value 
 * Good for when you want to declare a specific set of values. 
 * 
 * A enumeration is a collection of constants, representational values
 */

//Below is the JS way 

const OFF = 0; 
const IDLE = 1;
const ACCEL = 2;

let myCarState = ACCEL;

if(myCarState == OFF){

}else if(myCarState == IDLE){

}else if(myCarState == ACCEL){
    
}

enum carStates {OFF = 0, IDLE = 1, STOPLIGHT = 72, ACCEL =2, CRUISING = 3}

if(myCarState == carStates.ACCEL){

}


//Functions 

function myJSFunction(x,y,z){
    //bare bones JS function
}

function myOtherFunction(a: number, b: string, c){
    //adding in datatype restrictions
}

function emptyFunction(): void{
    //void is not a datype
    //used to specific the lack of a returnvalue 
}


//OOP aspects of Typescript
// Abstraction
//      Hiding away the details of what's going on to the developer. 
//      interfaces, abstract classes 


//-------------------------------------------Abstraction, inheritance, polymorphsim-------------------------------------------
interface Moon { //We define a moon interface, so any object of type Moon has to have a name. 
    name: string 
}

interface Planet{
    name: string, //Planet has to have a String type name
    hasRings: boolean, //has to have a boolean value for the hasRings attribute
    moons: Array<Moon>, //has to have an array of Moon
    orbit(): void, //HAve a method, with no arguments, no return value!
    // spin(x: number): boolean 
}

let nix: Moon;
nix = {name: "Nix"};

let earth: Planet = {
    name: "Earth",
    hasRings: false,
    moons: [nix],
    orbit: () => {console.log("I'm orbitting")}
}

class Star implements Moon, Planet{
    name: string;
    nickname: string;
    planets: number;
    moons: Moon[];
    hasRings: boolean;
    
    //In TS, we can't have multiple constructors, instead we get optional parameters. 
    //optional paramentes means, we don't need to add them to our arguments. 
    //optional parameters HAVE to be on the right of the non-optional paramenters. 
    constructor(name?: string, nickname?: string, planets?: number, moons?: Moon[], hasRings?: boolean){
        this.name = name;
        this.nickname = nickname;
        this.planets = planets;
        this.moons = moons;
        this.hasRings = hasRings;
    }

    // constructor(name: string, nickname: string);
    // constructor(name: string);
    // constructor(name: string, nickname: string, planets: number){

    // }

    // constructor(x: number, y: string);
    // constructor(s: string);
    // constructor(xs: any, y?: any){

    // }
  

    // constructor(name: string, nickname: string, planets: number, moons: Moon[], hasRings: boolean){
    //      
    // }

    //In Java we would create another construcotr or method, with the same name and provide a different number of arguments.

    toString(): string {
        return `Star: [name = ${this.name}, nickname = ${this.nickname}, number of planets = ${this.planets}]`;
    }

    fusion(): void{
        console.log(`${this.nickname} getting brighter`)
    }

    orbit(): void {

    }

}

let sun: Star = new Star('The Sun','Bright thingy',8);
sun.moons = [nix];
sun.hasRings = false;

console.log(sun.toString());

sun.fusion();


class NeutronStar extends Star{
    hasExploeded: boolean 

    constructor(hasExploded: boolean, name: string, nickname: string, planets: number){
        super(name,nickname,planets);
        this.hasExploeded = hasExploded;
    }

    spinabout(): void{
        console.log("Spinning a lot!");
    }

    toString(): string {
        
        let stringRepresentation 
            = `Neutron Star: [name = ${this.name}, nickname = ${this.nickname}, number of planets = ${this.planets}]`;

        return stringRepresentation;
    }

}

let neutron: NeutronStar = new NeutronStar(false,"A Neutron star", "nuetron", 3);

console.log(neutron.toString())

//Polymorphism: 
// Overriding and Overloading 
// OVerrding?
//  Takes over a methods of a parents class. Same method signature, but different action.
//



//-------------------------------------------Encapsulation-----------------------------------------------------------------
// To allow encapsulation in TS, we need to compile to a version of JS beyond es5. 
//Getter's and setters are functionally the same as Java OOP, but with brand new syntax. 

// Getters and Setters are defined with the keywords "get" and "set"
// Both methods must have the same name, and the data types must match (return type of getter and argument type of setter)
// Invoking both functions are also different: 
// we don't do animal.get() , instead we do animal.Age
// we don't do animal.set(value), instead we do animal.Age = value; 
class Animal {

    //All the attributes are public
    //3 different access modifiers
    // public, protected, void

    name: string; //by default, we are implicitly public 
    private age: number; //the attribute is only avaiable internally
    protected breed: string; //accessible internally to the class or any child classes. 
    public weight: number; //also explicitly write out public  

    constructor(name: string, age: number, breed: string, weight: number ){
        this.age = age;
        this.breed = breed;
        this.weight = weight
        this.name = name;
    }

    get Age(): number{
        console.log("I'm in my getter!")
        return this.age;
    }

    set Age(age: number){
        console.log("I'm in my setter!")
        this.age = age;
    }

}

let dog: Animal = new Animal("Bob",2,"Labrador",20);

console.log(dog.Age); //we're using our getter
dog.Age = 10; //we're using our setter
console.log(dog.Age);


//( Some really weird Typescript )
//To cut down on coding syntax, we can declare the variable's access modifier inside of the constructor arguments. 
// This will associate the argument as an attribute of the instantiated object. 
// Below is 2 difference implementation of class, each are functionally the same but one has less syntax. 

class Cat {

    //I'm not going to define explicitly attributes. 
    // This will reduce the amount of code I'm writing out! 
    constructor(private name: string, public nickname: string){ 
        //this will create a private attribute name, and assign it the value
    }
}

/**
 * class Cat {
 *      private name: string;
 *      public nickname: string;
 * 
 *      constructor(name: string, nickname: string){
 *          this.name = name;
 *          this.nickname = nickname;     
 *      }
 * }
 */

let cat: Cat = new Cat("bob", "bobby");

console.log(cat.nickname);
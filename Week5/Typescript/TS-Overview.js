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
 * Why transpile rahter tha compile?
 *  (compiling is when we go from a higher level language (more abstraction) -> lower level code (bytecode))
 *
 *  Transpiling is where we convert a similar level language into another language, TS -> JS
 */
/**
 * datatypes we get from JS:
 *  boolean, number, array, object, undefined, string, null, symbol
 */
let s = 1;
s = "a string";
//null, void, undefined 
let v1 = null;
let v2 = null;
let v3 = undefined;
let v4 = null;
// let v5: null = void; because void isn't a actually value 
//Objects: 
let o1; //examples of "object" that we can have 
let o2;
o2 = { "key": "value", key2: "another value" };
o2 = undefined;
let o3;
o3 = { "key": "value", key2: "another value" };
o3 = undefined;
o3 = null;
let o4; //we can specify the key value pairs, and the name of the key, and the datype 
//of the value. 
o4 = { name: 1 };
//Arrays 
//How do arrays work in JS?
//arrays can have different data types 
//Can have nested arrays 
//arrays are resizable in JS 
let a1; //have an array of numbers 
let a2; //also an array of numbers, just syntax difference 
let a3; //using an array of any datatypes. 
a1 = [1, 2, 2.3, 4];
a1[5] = 7;
// a1[6] = "string";
// a1 = ["a string", true, 0];
//Tuples 
// Like an array, immutable 
// fized size and the datatypes have to be in a specific order 
let tuple1;
tuple1 = ['hola', false, 0];
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
if (myCarState == OFF) {
}
else if (myCarState == IDLE) {
}
else if (myCarState == ACCEL) {
}
var carStates;
(function (carStates) {
    carStates[carStates["OFF"] = 0] = "OFF";
    carStates[carStates["IDLE"] = 1] = "IDLE";
    carStates[carStates["STOPLIGHT"] = 72] = "STOPLIGHT";
    carStates[carStates["ACCEL"] = 2] = "ACCEL";
    carStates[carStates["CRUISING"] = 3] = "CRUISING";
})(carStates || (carStates = {}));
if (myCarState == carStates.ACCEL) {
}
//Functions 
function myJSFunction(x, y, z) {
    //bare bones JS function
}
function myOtherFunction(a, b, c) {
    //adding in datatype restrictions
}
function emptyFunction() {
    //void is not a datype
    //used to specific the lack of a returnvalue 
}
let nix;
nix = { name: "Nix" };
let earth = {
    name: "Earth",
    hasRings: false,
    moons: [nix],
    orbit: () => { console.log("I'm orbitting"); }
};
class Star {
    //In TS, we can't have multiple constructors, instead we get optional parameters. 
    //optional paramentes means, we don't need to add them to our arguments. 
    //optional parameters HAVE to be on the right of the non-optional paramenters. 
    constructor(name, nickname, planets, moons, hasRings) {
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
    toString() {
        return `Star: [name = ${this.name}, nickname = ${this.nickname}, number of planets = ${this.planets}]`;
    }
    fusion() {
        console.log(`${this.nickname} getting brighter`);
    }
    orbit() {
    }
}
let sun = new Star('The Sun', 'Bright thingy', 8);
sun.moons = [nix];
sun.hasRings = false;
console.log(sun.toString());
sun.fusion();
class NeutronStar extends Star {
    constructor(hasExploded, name, nickname, planets) {
        super(name, nickname, planets);
        this.hasExploeded = hasExploded;
    }
    spinabout() {
        console.log("Spinning a lot!");
    }
    toString() {
        let stringRepresentation = `Neutron Star: [name = ${this.name}, nickname = ${this.nickname}, number of planets = ${this.planets}]`;
        return stringRepresentation;
    }
}
let neutron = new NeutronStar(false, "A Neutron star", "nuetron", 3);
console.log(neutron.toString());
//Polymorphism: 
// Overriding and Overloading 
// OVerrding?
//  Takes over a methods of a parents class. Same method signature, but different action.
//
//Encapsulation 
class Animal {
    constructor(name, age, breed, weight) {
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.name = name;
    }
    get Age() {
        console.log("I'm in my getter!");
        return this.age;
    }
    set Age(age) {
        console.log("I'm in my setter!");
        this.age = age;
    }
}
let dog = new Animal("Bob", 2, "Labrador", 20);
console.log(dog.Age); //we're using our getter
dog.Age = 10; //we're using our setter
console.log(dog.Age);
// dog.breed
dog.name;
dog.weight;

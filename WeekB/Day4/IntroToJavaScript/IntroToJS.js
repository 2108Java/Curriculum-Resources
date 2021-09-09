
// console.log("Hello JavaScript!")

/**
 * This is a comment in JS
 * 
 * 
 */

//This is a line comment 

/**
 * 
 * What is Javascript?
 *      
 *      Not at all related with Java 
 *      Scripting language, not a compiled one. 
 * 
 *      Main/Original purpose is to design and manipulate Webpages. 
 *      Designed to run on the client side, i.e. the browser. 
 * 
 *      Created in 1995 by Brandan Eich (10 days)
 * 
 */


// Java: int a = 1;

//JS is loosely typed, we don't need to define the datatype when we declare it. 
// Instead we use general declaration terms, such as var, const and let 

var a = 1;
var b = 'A string';
var c = true;
var d = 3.0;

//variables in JS can store different datatypes 

// a = 2;
// console.log(a);
// a = 'A another string';
// console.log(a);
a = false;


// console.log(a);


// for(var i =0; i<10; i++){
//     console.log(i);
// }


// Java: access-modifer non-access modifiers return-type method(parameters)

function greetings(a,b,c){
    console.log("Hello");
    console.log(a);
    console.log(b);
    console.log(c);
    return 0;
}

//function nameOfTheFuction(parameters)
function minus(a,b){
    return a-b;
}

// console.log(minus("20",true))

// var e = greetings();

// // console.log(greetings(2,3));

//Javascript can modify a HTML page!






function titleToRed(){
    var titleTag = document.getElementById("title");

    console.log(titleTag.getAttribute("style"));

    if(titleTag.getAttribute("style") == "color:red"){
        titleTag.setAttribute("style","color:black")
    }else{
        titleTag.setAttribute("style","color:red");
    }

    


    
    console.log(titleTag);
}

function titleToGreen(){
    
    var title = document.getElementById("title");

    title.setAttribute("style","color:green");
}

function setTable(){
    var fruit1 = {"name":"kiwi","price":2};
var fruit2 = {"name":"apple", "price": 2};
var fruit3 = {"name":"tomato", "price": 3};
var fruit4 = {"name":"banana", "price": 4};
var fruit5 = {"name":"dragonfruit", "price": 1};

fruit1.tasty = true;

//JS vs Java?
// Arrays are mutable in size 
// We can have different datatypes 
var fruitArray = []; //creating an array 

fruitArray[0] = fruit1;
fruitArray[1] = fruit2;
fruitArray[2] = fruit3;
fruitArray[3] = fruit4;
fruitArray[4] = fruit5;


for(var i = 0; i < fruitArray.length; i++){

    addRow(fruitArray[i].name, fruitArray[i].price);
}

}

function addRow(textValue, priceText){
    let table = document.getElementById("fruit-table");

    //Create elements
    
    //Creating a column
    let tableRow = document.createElement("tr");
    let nameColumn = document.createElement("td");
    let priceColumn = document.createElement("td");

    //Attaching those elements to the the table row
    tableRow.appendChild(nameColumn);
    tableRow.appendChild(priceColumn);

    //Attaching the table row to the table
    table.appendChild(tableRow);
    
    //Assigning text inside of those columns
    nameColumn.innerText = textValue;
    priceColumn.innerText = priceText;
}

//Creating a dynamic webpage 

window.onload = function(){ //as soon as the page is loaded 

    var redButton = document.getElementById("red");
    
    var greenButton = document.getElementById("green");

    var tableButton = document.getElementById("tableButton");

    var createTableButton = document.getElementById("createTable");

    tableButton.addEventListener('click', addRow);

    redButton.addEventListener('click', titleToRed);
    greenButton.addEventListener('click',titleToGreen);

    createTableButton.addEventListener('click',setTable);
    
}


//Objects and array in JS

//Objects in JS are key value pairs;
//There's no "new" keyword, we don't need a constructor to "create" an object 
//We don't need a class eitehr in JS 


var fruit1 = {"name":"kiwi","price":2};
var fruit2 = {"name":"apple"};
var fruit3 = {"name":"tomato"};
var fruit4 = {"name":"banana"};
var fruit5 = {"name":"dragonfruit"};

fruit1.tasty = true;

//JS vs Java?
// Arrays are mutable in size 
// We can have different datatypes 
var fruitArray = []; //creating an array 

fruitArray[0] = fruit1;
fruitArray[1] = fruit2;
fruitArray[2] = fruit3;
fruitArray[3] = fruit4;
fruitArray[4] = fruit5;

console.log(fruitArray);

console.log(fruit1);
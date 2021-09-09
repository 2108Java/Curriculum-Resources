
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


//Creating a dynamic webpage 

window.onload = function(){ //as soon as the page is loaded 

    var redButton = document.getElementById("red");
    
    var greenButton = document.getElementById("green");

    redButton.addEventListener('click', titleToRed);
    greenButton.addEventListener('click',titleToGreen);
    
}
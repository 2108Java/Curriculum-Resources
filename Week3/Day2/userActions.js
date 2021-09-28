console.log("hello from user actions!");

/**
 * 1) Select the element we want to associate an event with. 
 * 
 * 2) Define a function to trigger based on the event
 * 
 * 3) We tie the event and the function to the element we want. 
 */

//We select the tag we want to associate an event with 
let myButton = document.getElementById("myButton");
let anotherButton = document.getElementById("anotherButton");
let deleteButton = document.getElementById("deleteButton");

console.log(myButton);

//We want to associate user actions to programatic logic - increases interactivity 
//What are user actions?
// User actions are a subset of events that occur in JS 
// An event can be: 
//      click
//      mousehover
//      mouseenter

//Whenever the button see a 'click' event, it will invoke our sayHello function. 
myButton.addEventListener('mouseenter', sayHello);
myButton.addEventListener('click',basicDomManipulation);

anotherButton.addEventListener('click',addHTagsToBody);

//tie together our event and our function. 
deleteButton.addEventListener('click',deletingHTags);


//We create the functions we want to be invoke dwhenever an element experiences an event
function sayHello(){
    console.log("Hello");
}

function basicDomManipulation(){

    let classElements = document.getElementsByClassName("text");

// classElements.innerText = "Modifing my Paragraph tags"; This isn't valid

let i = 0;
for(let tag of classElements){
    tag.innerHTML = "MODIFING ALL THE TAGS!"
    

    console.log(tag.getAttribute("style"));

    if(tag.getAttribute("style") == "color:green"){
        tag.setAttribute("style","color:yellow");
    }else{
        tag.setAttribute("style","color:green");
    }
    tag.setAttribute("id",`para${i}`)
    i++;
}

}


function addHTagsToBody(){
    let body = document.getElementsByTagName('body')[0];

    let newH3 = document.createElement("h3");

    newH3.innerHTML = "Brand new tag, created from Jacascript!";

    body.appendChild(newH3);
}

function deletingHTags(){
    //feel free to have a go at this!
    console.log("To be implemnted!")
}
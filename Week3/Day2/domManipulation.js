// console.log("hello");

/**
 * What is DOM?
 *      Document Object Model 
 *      This is a representation of our html page, for our JS to manipulate!
 * 
 *      HTML follows a strict hierarchy, tags are within tags. 
 *      DOM looks a little bit like a flow chart. 
 *          
 *                  -> meta
 *          -> head -> title
 *      html
 *          -> body -> header -> h1
 *                  -> div -> p
 *                  -> p 
 * 
 *  
 */    

//document is an object with all the properties of the webpage
// console.log(document);

//deprecateds property/method are things that are no longer supported. 
//They're not removed, but they tell us that this should be not in use. 
// console.log(document.all);

// console.log(document.all[7]) // all is a property of document object, which is an array.  

// console.log(typeof(document.all[7])); //This is a TERRIBLE way of selecting our elements. 

// console.log(document.URL);
// console.log(document.title);

//---------------------------------------------------------------------------------------

//Elements by ID 

let idElement; 

idElement = document.getElementById("title"); //making sure we explicitly invoke our functions. 

// idElement = "Modified text!"; This won't work, I'm replacing the variable value with a string

idElement.innerText = "Modified title!"; 

//inner text: html tags will not be registered as HTML
//innerHTML: html tags will be registered as HTML

idElement.innerHTML = idElement.innerText + "Modified again, this time using <strike>innerText</strike> innerHTML!";

// idElement.innerText = "Modified again, this time using <strike>innerText</strike> innerHTML!"; 

idElement.setAttribute("style","color:blue");
idElement.setAttribute("class","more-text");

console.log(idElement);

//-----------------------------------------------------------------------------------------
//Selecting By Class

let classElements = document.getElementsByClassName("text");

// classElements.innerText = "Modifing my Paragraph tags"; This isn't valid

let firstTextClassTag = classElements[0];
firstTextClassTag.innerHTML = "INSIDE PARAGRAPH TAG!";

let i = 0;
for(let tag of classElements){
    tag.innerHTML = "MODIFING ALL THE TAGS!"
    tag.setAttribute("style","color:red");
    tag.setAttribute("id",`para${i}`)
    i++;
}

// console.log(classElements);

//-------------------------------------------------------------------------------------------
//Selecting by Tag names 

let allParagraphTags = document.getElementsByTagName("p");

console.log(allParagraphTags);

for(let tag of allParagraphTags){
    tag.innerHTML = "Modifing all the paragraphs, even within my div tags or different classes of paragraph!";

    console.log(tag.getAttribute("id"));

    if(tag.getAttribute("id") == null){
        tag.setAttribute("style","color:green");
        tag.innerHTML = "These tags are getting modified only <strike>once</strike>!";

    }

}

//----------------------------------------------------------------------------------------
//Query Selector
//Query selector uses css selector syntax
let header = document.querySelector("header"); //query selectors will only return the first element it sees




//Creating our brand new element
let newH3 = document.createElement("h3");

newH3.innerHTML = "Brand new tag, created from Jacascript!";

//Then select the element we want to add it to! 

let body = document.getElementsByTagName('body')[0];

//Append it as a child class!
body.appendChild(newH3);

header.appendChild(newH3);











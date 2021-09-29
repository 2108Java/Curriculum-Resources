

// function StarWarsPerson(name,age,birthYear){
//     this.name = name;
//     this.age = age;
//     this.birthYear = birthYear;
// }

//Getting the infromation from Star Wars API 

function getStarWars(){

    //Grab information from the User! 
    //We get that information from the input tags that we have on the html page!

    let starWarsId = document.getElementById("starId").value;
    // let starWarsId = "apples";

    //Specify the URL that we want to trigger! 
    let baseUrl = "https://swapi.dev/api/people/";

    let fullUrl = baseUrl + starWarsId; 

    let xhttp = new XMLHttpRequest();

    //Whenever there is a change in state, this function gets invoked: 
    xhttp.onreadystatechange = function(){
        
        if(this.readyState == 4 && this.status == 200){
            

            console.log(JSON.parse(this.responseText));

            let fullObject = JSON.parse(this.responseText);
            fullObject.id = starWarsId; //JS is dynamic with object

            addRow(fullObject);

            //We want to define a dom manipulation function to manipulate our page with the object. 
        }else if(this.readyState == 4 && this.status == 404){
            console.log(this.responseText);
            console.log("This request was not found by the server!");
        }
    }


    xhttp.open("GET", fullUrl);

    xhttp.send(); //This causes the state of the xmlhttpObject to change! 
                    //It will go through 4 changes, we want to grab the respone on the final stage!

        
}

let button = document.querySelector("#starSubmit");
// let title = document.querySelector("#starTitle");
// console.log(button);

button.addEventListener('click',getStarWars);
// title.addEventListener('mouseover',getStarWars);

//I need to tie the function "getStarWars" to an event on the page. 
// Tie it to the button, once it's clicked the getStarWars function should be triggered!



//Mainpulating our DOM/HTML page with the objects/response we get back.

function addRow(starWarsPerson){
    // let fakeObject = {id: 1, "name":"bob", age:12, birth_year:"fake birth year"};


    //Append this onto my table, 
    let tableBody = document.getElementById("starTableBody");

    //Creating a table row
    let tableRow = document.createElement("tr");

    //Create the columns
    let idColumn = document.createElement("td");
    let nameColumn = document.createElement("td");
    let heightColumn = document.createElement("td");
    let birthColumn = document.createElement("td");

    //assigning the "text value" to our columns 

    idColumn.innerText = starWarsPerson.id;
    nameColumn.innerText = starWarsPerson.name;
    heightColumn.innerText = starWarsPerson.height;
    birthColumn.innerText = starWarsPerson.birth_year;

    //attach the columns to our newly created row 
    tableRow.appendChild(idColumn);
    tableRow.appendChild(nameColumn);
    tableRow.appendChild(heightColumn);
    tableRow.appendChild(birthColumn);

    //attach the row itself to the table
    tableBody.appendChild(tableRow);

    


}

function setTable(){
    for(){
        addRow(object);
    }
}
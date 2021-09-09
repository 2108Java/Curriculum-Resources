
function addRow(planet){
	
	let table = document.getElementById("planet-table");

    //Create elements
    
    //Creating a column
    let tableRow = document.createElement("tr");
    let nameColumn = document.createElement("td");
    let massColumn = document.createElement("td");
    let ringsColumn = document.createElement("td");

    //Attaching those elements to the the table row
    tableRow.appendChild(nameColumn);
    tableRow.appendChild(massColumn);
    tableRow.appendChild(ringsColumn);

    //Attaching the table row to the table
    table.appendChild(tableRow);
    
    //Assigning text inside of those columns
    nameColumn.innerText = planet.name;
    massColumn.innerText = planet.mass;
    ringsColumn.innerText = planet.rings;

}

function addPlanetsToTable(planetList){

	//Get the planets
	
	for(let i = 0; i < planetList.length; i++){
		
		addRow(planetList[i]);
	}
	
	//add it to our table!
    

}



//AJAX section (Asynchronous Javascript and XML)

function getPlanets(){
	
	let xhr = new XMLHttpRequest();

    const URL = "view-all";

    xhr.onreadystatechange = function(){

        switch(xhr.readyState){
            case 0:
                console.log("nothing, not initalized yet");
                break;
            case 1: 
                console.log("connection established");
                break;
            case 2:
                console.log("request sent");
                break;
            case 3:
                console.log("awaiting response");
                break;
            case 4:
                //if everything went okay!
                if(xhr.status == 200){
                    console.log(xhr.responseText);
                    
                    let planetList = JSON.parse(xhr.responseText);
                    
                    console.log(planetList);
                    
                    addPlanetsToTable(planetList);
                }
        }

    }

    xhr.open("GET", URL);
    xhr.send();

}



window.onload = function(){
	
	let button = document.getElementById("getPlanets");
	button.addEventListener('mouseover',getPlanets);
	
}
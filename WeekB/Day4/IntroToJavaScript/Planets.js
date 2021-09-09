

//Document Object Manipulation section 
//(Changing the html)

function addRow(){

}

function addPlanetsToTable(){

    let xhr = new XMLHttpRequest();

    const URL = "localhost:9000/view-all"

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
                }
        }

    }

    xhr.open("GET", URL);
    xhr.send();

}


addPlanetsToTable();
//AJAX section (Asynchronous Javascript and XML)

function getPlanets(){

}


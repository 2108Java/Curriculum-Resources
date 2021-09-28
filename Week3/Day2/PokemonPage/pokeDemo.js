console.log("Hello");


//JS is going to be responsible for 2 things. 

//For manipulating the page 




function Pokemon(name,type,image,backImage){
    this.name = name;
    this.image = image;
    this.type = type;
    this.backImage = backImage;
}


//be careful, there are no generics so nothing stopping from sending anything to this function. 
//pokemon could be a number, string, even another function. 
//anything other than a specific pokemon object will break this function. 

function DOMManipulation(pokemon){

    document.getElementById("pokemonName").innerText = pokemon.name;

    let pokeImg = document.getElementById("pokemonImg");

    pokeImg.setAttribute("src",pokemon.image);

    document.getElementById("pokemonType").innerText = pokemon.type;

    let backImg = document.getElementById("backImg");

    backImg.setAttribute("src",pokemon.backImage);
}


document.getElementById("pokemonSubmit").addEventListener('click',getPokemon);


//For communicating with an API, in this case PokeAPI 

/**
 * AJAX - a technique for access web servers from a web page asynchronously. 
 * 
 * synchronous and asynchronous?
 *      Allows us to still have a functioning webpage while it waits for a response from the server.
 *      Otherwise, the whole page will block you from doing anything in the mean time. 
 * 
 * Javascript is a single threaded scripting language. 
 *  If operations were done synchronously (i.e. one "action" at a time), it will cause the whole page 
 *     to stop and refresh. 
 * 
 * AJAX consists of: 
 *      - Browser build in XMLHttpRequest object (requests data from the wbe server)
 *      - Javascript to dynamically change the page. 
 *      - DOM ( to display our data)
 */

function getPokemon(){


/**
 * How does AJAX work?
 *      1) An event occurs in the web page (button is clicked or page is loaded)
 *      2) an XMLHttpRequest object is created by JS
 *      3) XMLHttpRequest object sends a request to a web server
 *      4) Server process the request
 *      5) Server sends a response back to the web page!
 */

    console.log("I'm getting the pokemon");

    const BASE_POKEMON_URL = "https://pokeapi.co/api/v2/pokemon/";

    let pokemonId = document.getElementById("pokemonId").value;

    let pokeURL = BASE_POKEMON_URL + pokemonId

   
    let xhttp = new XMLHttpRequest(); //this is a built in object in the browser. 

    //Whenever the state of the xmlhttprequest object changes, it will invoke this funciton!
    xhttp.onreadystatechange = function(){
        // console.log("Hello there!");

        //onreadystatechange function gets invoked whenever the readystate changes. 

        //What a readystate? it holds the status of the XMLHttpRequest 
        /**
         * 0 - request is not initialized
         * 1 - server connection established 
         * 2 - request recieved
         * 3 - processing request 
         * 4 - request is finished and response is ready 
         */

        // switch(this.readyState){
        //     case 0:
        //         console.log(`I'm in state ${this.readyState}`)
        //         break;
        //     case 1:
        //         console.log(`I'm in state ${this.readyState}`)
        //         break;
        //     case 2:
        //         console.log(`I'm in state ${this.readyState}`)
        //         break;
        //     case 3:
        //         console.log(`I'm in state ${this.readyState}`)
        //         break;
        //     case 4:
        //         console.log(`I'm in state ${this.readyState}`)
        //         break;
        // }

        //We will only interact with the response, once it's complete and it's a success!
        if(this.readyState == 4 && this.status == 200){
            // console.log(this.responseText); //This is simply text, in the format off JSON 

            //fortunatley for us, we have libaries that will convert it for us! 

            let responseObject = JSON.parse(this.responseText);

            
            console.log(responseObject);
            console.log(responseObject.name);
            console.log(responseObject.types[0].type.name);
            console.log(responseObject.sprites.front_shiny);

            //We want to turn this into something our DOMManipulation function expects. 
            //A pokemon with, name, image, and type. 

            let pokeObject = new Pokemon(responseObject.name,
                            responseObject.types[0].type.name,
                            responseObject.sprites.front_shiny,
                            responseObject.sprites.back_default);

            DOMManipulation(pokeObject);

        }

    }

    xhttp.open("GET", pokeURL);

    xhttp.send();



    // DOMManipulation(pokeObject);
}
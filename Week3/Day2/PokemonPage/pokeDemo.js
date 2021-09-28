console.log("Hello");


//JS is going to be responsible for 2 things. 

//For manipulating the page 


let pokeObject = {
    "name":"fake",
    "image":"https://th.bing.com/th/id/OIP.NQsFTBv0qpkaUuun3djgnQHaHa?w=179&h=180&c=7&r=0&o=5&dpr=1.75&pid=1.7",
    "type":"fake"
}


function DOMManipulation(pokemon){

    document.getElementById("pokemonName").innerText = pokemon.name;

    let pokeImg = document.getElementById("pokemonImg");

    pokeImg.setAttribute("src",pokemon.image);

    document.getElementById("pokemonType").innerText = pokemon.type;
}


document.getElementById("pokemonSubmit").addEventListener('click',getPokemon);


//For communicating with an API, in this case PokeAPI 


function getPokemon(){
    console.log("I'm getting the pokemon");

    DOMManipulation(pokeObject);
}
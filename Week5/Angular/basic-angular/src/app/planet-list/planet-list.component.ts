import { Component, OnInit } from '@angular/core';
import { Planet } from './planet';

@Component({
  selector: 'app-planet-list',
  templateUrl: './planet-list.component.html',
  styleUrls: ['./planet-list.component.css']
})
export class PlanetListComponent implements OnInit {

  // used to demo interpolation in the HTML page
  currentUser = 'Bob'; //attribute of our PlanetListComponent Class 


  //used to demo structural directives , *ngFor
  planets: Planet[] = [];


  //demoing deleting a planet!
  deletePlanet(event: any){

    let planetName: string = event.target.id;
    let planetPosition: number = -1;

    for(let p of this.planets){
      if(p.name == planetName){

        planetPosition = this.planets.indexOf(p);

        this.planets.splice(planetPosition,1);

        this.filteredPlanets = this.planets;
      }
    }
    
    // this.filteredPlanets = this.planets;
  }

  //demoing event from star component
  starEventString: string = 'placeholder';

  starEventWasTriggered(message: string): void {
    this.starEventString = message;
  }

  planetWasSentFromChild(message: Planet): void {
    console.log(message);
  }
  

  //demoing filter function
  filteredPlanets: Planet[] = [];
  actualInputField: string = 'Placeholder';
  numberInputField: number = 0;

  //also create a filter based on libivility 
  get NumberInputField(){
    return this.numberInputField;
  }

  set NumberInputField(userInput: number){
    this.numberInputField = userInput;

    this.filteredPlanets = this.performLivibilityFilter(userInput);

  }

  get InputField(){
    return this.actualInputField;
  }

  set InputField(userInput: string){
    this.actualInputField = userInput;

    //Once I set a value, what should happen?
    //We should instantly start filtering!

      console.log(userInput);


    //This is another ternary expression, that only filters if there is an input 
    // no input means that the "acutalInputField" is a empty string 
    // emptry string is a falsy value 
    this.filteredPlanets = (this.actualInputField)?
    this.performFilter(this.actualInputField):this.planets//my filtereted function return value

    // this.filteredPlanets = this.performFilter(this.actualInputField);
  }

  performLivibilityFilter(filterValue: number): Planet[] {

    return this.planets.filter(
      (planet: Planet) => { return filterValue <= planet.livibility;} //if the livibility is greater than the filter. 
      
    )
  }


  performFilter(filterValue: string): Planet[] { // a function that I define to filter based on the planet's names

    return this.planets.filter(//inbuild method where we define the filter condition

      //it filters based on whether the filtervalue exists inside of the planet name 
      (planet:Planet) => planet.name.toLowerCase().indexOf(filterValue.toLowerCase())!= -1
    ); 
  }

  //used to demo property binding for table
  imageWidth = 100;
  imageMargin = 1;

  //used to demo event binding for table 
  showTable: boolean = true;
  toggleTable(): void{
    this.showTable = !this.showTable;
    console.log("I'm pressing the button!")
  }

  constructor() { 

    this.planets = [ {
      name: 'Earth',
      image: 'https://images.unsplash.com/photo-1564053489984-317bbd824340?ixlib=rb-1.2.1&auto=format&fit=crop&w=2014&q=80',
      livibility: 5
    },
    {
      name:'Mars' ,
      image: 'https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg',
      livibility: 3
    },
    {
      name: 'Venus',
      image: 'https://upload.wikimedia.org/wikipedia/commons/a/a9/PIA23791-Venus-NewlyProcessedView-20200608.jpg',
      livibility: 4
    },
    {
      name: 'Mercury',
      image: 'http://dreamicus.com/data/mercury/mercury-06.jpg',
      livibility: 2
    },
    {
      name: 'Pluto',
      image: 'https://earthsky.org/upl/2019/11/Pluto-false-color-New-Horizons-2015-800x813.jpg',
      livibility: 1
    }];

    this.filteredPlanets = this.planets;
  }

  ngOnInit(): void {
  }

}

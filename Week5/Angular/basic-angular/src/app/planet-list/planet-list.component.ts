import { Component, OnInit } from '@angular/core';
import { Planet } from './Planet';

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
  

  //demoing filter function
  filteredPlanets: Planet[] = [];
  actualInputField: string = 'Placeholder';

  get InputField(){
    return this.actualInputField;
  }

  set InputField(userInput: string){
    this.actualInputField = userInput;

    //Once I set a value, what should happen?
      //We should instantly start filtering!

      console.log(userInput);


    this.filteredPlanets = (this.actualInputField)?
    this.performFilter(this.actualInputField):this.planets//my filtereted function return value

    console.log(this.filteredPlanets);

  }

  performFilter(filter: string): Planet[]{

    return this.planets.filter( //filter is an inbuilt method for all arrays 

      (planet:Planet) => { //filter will invoke this function, for every object it has.

        //I'm checking if a substring exists that matches the name of the planet. 
        //if the filter does not match anything, we will return a -1 
        //I'm return a true or a false, based on wether the filter exists in the name.
        console.log(planet.name.toLowerCase());
        console.log(filter.toLocaleLowerCase()); 
        // planet.name.toLowerCase().indexOf(filter.toLowerCase())!= -1
        planet.name.toLowerCase().indexOf(filter.toLowerCase())!= -1;
      }
    )
    
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

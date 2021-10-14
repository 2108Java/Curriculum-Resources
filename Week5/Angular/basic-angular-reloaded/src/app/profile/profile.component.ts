import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Planet } from '../planet-list/planet';
import { PlanetServiceService } from '../services/planet-service.service';
import { PokeAjaxService } from '../services/poke-ajax.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  currentUser: string | null = '';

  pokemonName: string = '';
  pokemonImage: string = '';

  //angular is taking over the management and lifecycle of my components 
  //Angular has something called the injector!
  //The injector will inject dependencies into our classess for us!

  public planets: Planet[] = [];

  constructor(private router: ActivatedRoute, private planetsService: PlanetServiceService, private pokeService: PokeAjaxService) {

    this.planets = planetsService.getAllPlanets();
   }

  ngOnInit(): void {

    this.pokeService.ajaxCallToAPI(10).subscribe(
      (data) => {
        this.pokemonName = data.name
        this.pokemonImage = data.sprites.front_default;
      }
    )
    //This is a lifecycle hook method.  
    //When this component is instantiated (after the constructor), this method get's triggered. 
    //All the ng...() methods are Angular specific! 

    this.currentUser = this.router.snapshot.paramMap.get('myPathVariable');

    // console.log(this.router.snapshot.paramMap.get('myPathVariable'))

    if(this.currentUser == null){
      this.currentUser = 'No path variable was specified!';
    }
  }

}

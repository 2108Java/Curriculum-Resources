import { Component, OnInit } from '@angular/core';
import { PokeAjaxService } from '../services/poke-ajax.service';
import { Observable } from 'rxjs';
import { Poke } from './Poke';

@Component({
  selector: 'app-pokemon-page',
  templateUrl: './pokemon-page.component.html',
  styleUrls: ['./pokemon-page.component.css']
})
export class PokemonPageComponent implements OnInit {

  //Pokemon is going to need an image, front_sprite and back_sprite 
  // Pokemon name 
  // Pokemon id 
  // Pokemon type 

  private pokemon: Poke | null = null;

  public pokemonName: string = '';
  public pokemonId: number = -1;
  public frontSprite: string = '';
  public backSprite: string = '';
  public pokemonType: string = '';

  pokeButtonClick(){
    console.log("button has been clicked!")

    //AJAX call send a IOU letter, where it will send the object once it gets a response
    let pokeObservable: Observable<Poke> = this.ajaxService.ajaxCallToAPI(this.pokemonId);

    //I subscribe to my observable, so that I get updated with information when there's something new
    pokeObservable.subscribe(
      //Once we get a resopnse, that response will be passed into our function
      //the paramenter can be called anything 
      (data)=>{

        console.log(data);
        this.pokemonName = data.name;
        this.pokemonType = data.type;
        this.frontSprite = data.sprites.front_default;
        this.backSprite = data.sprites.back_default;

        console.log(data.sprites);
      }
    )

    

  }


  constructor(private ajaxService: PokeAjaxService) { }

  ngOnInit(): void {

    
  }

}

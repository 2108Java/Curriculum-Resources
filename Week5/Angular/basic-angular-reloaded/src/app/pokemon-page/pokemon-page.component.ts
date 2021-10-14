import { Component, OnInit } from '@angular/core';
import { PokeAjaxService } from '../services/poke-ajax.service';
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

  constructor(private ajaxService: PokeAjaxService) { }

  ngOnInit(): void {

    this.pokemon = this.ajaxService.getPokemon(1);
  }

}

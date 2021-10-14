import { Injectable } from '@angular/core';
import { Poke } from '../pokemon-page/Poke';

@Injectable({
  providedIn: 'root'
})
export class PokeAjaxService {

  pokemon : Poke | null = null;

  constructor() { }

  getPokemon(id: number): Poke| null{
    return null;
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Poke } from '../pokemon-page/Poke';

@Injectable({
  providedIn: 'root'
})
export class PokeAjaxService {

  private baseUrl: string = 'https://pokeapi.co/api/v2/pokemon/';
  private fullUrl: string = '';

  pokemon : Poke | null = null;

  constructor(private httpClient: HttpClient) { }


  //We're going to send of a request to the pokemon url
  ajaxCallToAPI(id: number): Observable<Poke>{

    //create the url
    this.fullUrl = this.baseUrl + id;

    //send of a requesst 
    let pokeObservable: Observable<Poke> = this.httpClient.get<Poke>(this.fullUrl);

    //We're expecting an observable back! 
    //A observable is an entity that will wait until a response is received. 

    return pokeObservable;
  }

  /**
   *  AJAX: 
   *    Asynchronous opertaions: 
   *      don't stop everything until they're finsished, they simply wait in the background until 
   *      the process is done. 
   * 
   *  To send of a request, we need to use HTTP: Hyper text transfer protocol 
   * 
   *  To easily levarage HTTP calls, we use HttpClient Modules. 
   * 
   * 
   *  HttpClientModule: 
   *    This is a service from the common libraries '@angular/common/http'
   *    This allows us to abastract awa our http requests and responses. 
   * 
   * With HttpClientModule we will be using observables to achieve 
   *  the asynchronous aspect of the request. 
   *  
   * 
   * We're going to have to get our asynchronous library of tools from 'rxjs'
   *    Reactive Extension Javascript 
   *    - it contains stuff like, observables, promises and behavriousSubjects
   *    - has tools to make asynchronous and callback functions simpler
   * 
   * 
   * Promise?
   *  Is an asynchronous operation
   *  It is a proxy object - an IOU, that here's a proxy object and in some time I *promise* to get 
   *    the object. 
   *  A promise will only ever expect a single response. 
   * 
   * Observable?
   *  Is used to publish information to a 'stream'
   *  An objsvable follows a publisher-subscriber design pattern. 
   *  Whenever it publishes data, all teh subscribers down stream will get the data. 
   *  WE DONT KNOW HOW MUCH INFORAMTION WE'RE GETTING! WE CAN GET 0 INFROMATION OR INFINITE. 
   * 
   */
}

import { Component, Input, OnChanges, OnInit, Output, EventEmitter } from '@angular/core';
import { Planet } from 'src/app/planet-list/planet';
import { PlanetListComponent } from 'src/app/planet-list/planet-list.component';


@Component({
  selector: 'app-stars',
  templateUrl: './stars.component.html',
  styleUrls: ['./stars.component.css']
})
export class StarsComponent implements OnInit, OnChanges {

  constructor() { }

  //@Input allows us to send information to child components via a attribute [score] = 'something'
  @Input() score: number = 0; 

  //@Output allows us to send information to our parent componetn!
  //We can create a custom event! When that event is triggered we can return a string!
  @Output() childEvent: EventEmitter<string> = new EventEmitter<string>();

  //try sending a number, 42,  from the child to parent so that the parent can print it out
  @Output() numberEvent: EventEmitter<number> = new EventEmitter<number>();

  @Output() sendingPlanet: EventEmitter<Planet> = new EventEmitter<Planet>();

  onStarClick(): void {
    this.childEvent.emit(`The score is ${this.score}. From inside the star component`)
    this.numberEvent.emit(10);
  }

  onStarHover(): void{
    let planet: Planet = {name: "fake", image: "fake", livibility: 0}
    this.sendingPlanet.emit(planet);
  }

  starWidth: number = 0; //what should this correspond to? To the livibility score

  ngOnChanges(): void {
    this.starWidth = this.score*70/5;
  }

  ngOnInit(): void {
  }

}

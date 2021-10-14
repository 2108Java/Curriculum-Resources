import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[app-color-directive]'
})
export class ColorDirectiveDirective {
  //trying to change the color of my planet name depending on if it's equal to earth!
  //when I hover over the name!

   

  @Input('app-color-directive')
  public dummyValue: any = {};

  //check if it's being hoverred over
  @HostListener('mouseenter') onMouseEnter(){

    //changing the color of said element 

    let textStuff: string = this.element.nativeElement.innerText;

    if(textStuff.toLowerCase().indexOf("earth")!= -1){
      this.element.nativeElement.style.color = "ForestGreen";
    }else{
      this.element.nativeElement.style.color = "Crimson";
    }
  }

  //Angular is going to "inject" ElementRef into my attribute! 
  constructor(private element: ElementRef) { 
    //by giving it an access modifier 
    // I associate as an attribute of the class 


    //We are not going to pass in the Element object, Angular is 


  }

}

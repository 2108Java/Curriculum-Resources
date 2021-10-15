import { Component, OnDestroy, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { MessagingService } from '../services/messaging.service';

@Component({
  selector: 'app-trigger',
  templateUrl: './trigger.component.html',
  styleUrls: ['./trigger.component.css']
})
export class TriggerComponent implements OnInit, OnDestroy{

  capturedMessage!: string; //The ! tells the compiler to not worry about it being null
                            //as the developer I know best!

  input!: string;
  mySubscription!: Subscription;
  name!: string;

  constructor(private messagingService: MessagingService) { 

    this.name = 'Bob';
  }
 

    //Using Setter and Getter
  changeMessageWithSetter(): void {
    console.log("inside changing method with setter!")
    this.messagingService.MyMessage = this.input; 
  }

  grabMessageWithGetter(): void {

    console.log("inside getter message")
    this.capturedMessage = this.messagingService.MyMessage;

  }

  bothSetAndGrab(): void {
    this.changeMessageWithSetter();
    this.grabMessageWithGetter();
  }


  //using Observables 
  usingBehaviorToSetMessage(){
    this.messagingService.changeTheMessageUsingBehave(this.input);
  }

  //Lifecycel is triggered just after the class has been made 
  ngOnInit(): void {
    // this.grabMessageWithGetter();
    this.mySubscription = this.messagingService.theObserv.subscribe(

      (data) =>{
          console.log("new data down the stream!")
          this.capturedMessage = data; 
      }
    )
  }

  //After Angular is done with the component, it will destroy the component 
  // A lifecycle hook method will trigger at diffferent points of the component, and in this case
  // will trigger just before it's getting destroyed. 
  ngOnDestroy(): void {
    
    //destroying the subscription once we're done! 

  this.mySubscription.unsubscribe();



  }

  

}

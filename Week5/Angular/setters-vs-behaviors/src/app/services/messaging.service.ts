import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MessagingService {

  //single attribute 
  private myMessage: string = 'My initial message!';

  //using getters and setters!
  get MyMessage(){
    return this.myMessage;
  }

  set MyMessage(newMessage: string){
    this.myMessage = newMessage;
  }


  //using Observables and behavioral subjects 
  private myBehaviorSubject = new BehaviorSubject<string>(this.myMessage);


  private castMyBehavioralSubjectToObservable = this.myBehaviorSubject.asObservable();

  //provide a method to give away our observable - allow other things to subscribe 
  get theObserv(){

    return this.castMyBehavioralSubjectToObservable;
  }

  changeTheMessageUsingBehave(newMessage: string){
    this.myMessage = newMessage;
    this.myBehaviorSubject.next(this.myMessage); //we publish a new message into the stream!
  }


  constructor() { }
}

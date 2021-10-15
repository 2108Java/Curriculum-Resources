import { Component, OnInit } from '@angular/core';
import { MessagingService } from '../services/messaging.service';

@Component({
  selector: 'app-reaction',
  templateUrl: './reaction.component.html',
  styleUrls: ['./reaction.component.css']
})
export class ReactionComponent implements OnInit {

  capturedMessage!: string; //The ! tells the compiler to not worry about it being null
                            //as the developer I know best!

  //constructors are a typescript/javascript concept!
  constructor(private messageService: MessagingService) { 
    this.messageService.theObserv.subscribe(

      (data) => {
        console.log("The reaction component is also getting new data!")
        this.capturedMessage = data;
      }

    )
  }

  //Is a Angular entity, and an example of a Lifecycle hook. 
  ngOnInit(): void {
  }

}

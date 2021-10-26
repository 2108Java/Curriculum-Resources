
import { Component, OnInit } from '@angular/core';
import { Router, RouterPreloader } from '@angular/router';
import { AjaxSessionService } from '../ajax-session.service';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.css']
})
export class LandingPageComponent implements OnInit {

  userDetails: string = "";
  loginMessage: string = "";
  logoutMessage: string = "";

  // firstButton(){
  //   // this.loginMessage += this.loginMessage;

  //   this.router.navigate(['/secret']);

  //   // this.ajaxSession.loginRequest().subscribe(

  //   //     message => {
          
  //   //       this.loginMessage += " " + message.message;
          
  //   //     }      
  //   // )
  // }

  firstButtonWithPost(){
    // this.loginMessage += this.loginMessage;

    

    this.ajaxSession.loginRequestWithPost().subscribe(

        response => { //the message is now the entire response!

          this.router.navigate(['/secret']);
         
          this.loginMessage += " " + response.body?.message;
        }      
    )
  }

  secondButton(){
    
    this.ajaxSession.logoutRequest().subscribe(

      message => {
        this.router.navigate(['']);
        this.logoutMessage += " " + message.message;
      }
    )
  }

  thirdButton(){
    this.ajaxSession.infoRequest().subscribe(

      user => {
        this.userDetails += " " + user.name;
      }

    )
  }

  constructor(private ajaxSession: AjaxSessionService,private router:Router) { }

  ngOnInit(): void {
  }

}

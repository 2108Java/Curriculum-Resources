import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ParentComponent } from './parent/parent.component';
import { ReactionComponent } from './reaction/reaction.component';
import { MessagingService } from './services/messaging.service';
import { TriggerComponent } from './trigger/trigger.component';

@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    ReactionComponent,
    TriggerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule //needed for [(ngModel)]
  ],
  providers: [
    MessagingService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

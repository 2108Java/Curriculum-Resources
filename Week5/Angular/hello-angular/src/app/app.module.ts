import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { BobComponent } from './app.component';

//if your component, service, pipe, custom attributes, external components
// are not declared here, angular will have no idea what you're talking about!

@NgModule({
  declarations: [
    BobComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [BobComponent]
})
export class AppModule { }

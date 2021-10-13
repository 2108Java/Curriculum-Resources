import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';


import { MyClass } from './manual-component/manual-view';
import { AppComponent } from './app.component';
import { FirstComponentComponent } from './first-component/first-component.component';
import { SecondComponentComponent } from './second-component/second-component.component';
import { PlanetListComponent } from './planet-list/planet-list.component';


@NgModule({ //the only diffierence is the decorator (not annotation), that tells it 
    //it is a configuration class

  declarations: [ //used for declaring components, also (custom) directives and pipes
    AppComponent,
    FirstComponentComponent,
    MyClass,
    SecondComponentComponent,
    PlanetListComponent
  ],
  imports: [ //used to import external modules
    BrowserModule,
    FormsModule
  ],
  providers: [ //used to declare services 

  ],
  bootstrap: [AppComponent]
})
export class AppModule { } //also a typescript class file! 


import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MyClass } from './manual-component/manual-view';
import { AppComponent } from './app.component';
import { FirstComponentComponent } from './first-component/first-component.component';
import { SecondComponentComponent } from './second-component/second-component.component';

@NgModule({ //the only diffierence is the decorator (not annotation), that tells it 
    //it is a configuration class

  declarations: [
    AppComponent,
    FirstComponentComponent,
    MyClass,
    SecondComponentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { } //also a typescript class file! 


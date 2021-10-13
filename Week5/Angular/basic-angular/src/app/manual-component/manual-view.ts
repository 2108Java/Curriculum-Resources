

//We first need a class! 

import { Component } from "@angular/core";

//export will mean that my "MyClass" can be used anywhere the project
//We need to use a decorator to turn any of our classes into angular entities: 
// What does my component need: 
//  html, css (optional), typescript file, testing ts file (optional)
@Component({
    selector: 'manual-selector',
    templateUrl: './manual-view.html'
})
export class MyClass{

    
}
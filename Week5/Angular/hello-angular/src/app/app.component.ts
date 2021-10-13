import { Component } from '@angular/core';

//The TS is the brains of our components

@Component({
  selector: 'app-root-something-else', //how to specifiy it in a tag
  templateUrl: './myview.html', //tells us what the view is
  styleUrls: ['./app.component.css'] // tells us the component specific styling.
})
export class BobComponent {
  title = 'hello-angular';
}

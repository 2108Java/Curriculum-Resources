import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { ColorDirectiveDirective } from './shared/attribute-directives/color-directive.directive';
import { PrependPipePipe } from './shared/pipes/prepend-pipe.pipe';
import { StarsComponent } from './shared/stars/stars.component';
import { ProfileComponent } from './profile/profile.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { PlanetServiceService } from './services/planet-service.service';
import { PokemonPageComponent } from './pokemon-page/pokemon-page.component';

@NgModule({
  declarations: [
    AppComponent,
    PlanetListComponent,
    StarsComponent,
    PrependPipePipe,
    ColorDirectiveDirective,
    ProfileComponent,
    WelcomeComponent,
    PokemonPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [ //this is where we can also declare our services 
    PlanetServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

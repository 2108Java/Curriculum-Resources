import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { PokemonPageComponent } from './pokemon-page/pokemon-page.component';
import { ProfileComponent } from './profile/profile.component';
import { RouteGuardGuard } from './route-guard.guard';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {
    path: 'planets', //my browser url localhost:4000/planets
    component: PlanetListComponent
  },
  {
    path: 'welcome',
    component: WelcomeComponent
  },
  {
    path: 'profile/:myPathVariable',
    component: ProfileComponent,
    canActivate : [RouteGuardGuard],
    // canDeactivate:  multiple routing guards can be proviced. 
  },
  {
    path: 'profile',
    component: ProfileComponent,
    canActivate: [RouteGuardGuard]
  },{
    path: 'pokemon',
    component: PokemonPageComponent
  },
  {
    //The order is important!
    path: '**', //will handle any and every endpoint, that hasn't been met by the previous paths
    component: WelcomeComponent

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

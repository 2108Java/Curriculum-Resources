import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class RouteGuardGuard implements CanActivate {

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
   
      //check localStorage for sessions
      //check local storage for cookies
      //checking for JWT 
   
      //A route guard will return a true or a false based on conditions that have been met/

      /**
       * A route guard is there to restrict and manage who has access to what endpoints in 
       *  our SPA. 
       * 
       * We can verify on our front end more easily by setting up route guards and then checking 
       *  for any security measures, JWT, tokens, sessions, cookies. 
       * 
       * Route guard will return a true or a false if a condition has been met. 
       * 
       * CanActivate
       * CanActivateChild
       * CanDeactivate
       * Resolve
       * CanLoad 
       */

      //we granting access if a 'myPathVariable' exists!
      if(route.paramMap.get('myPathVariable') == null){
        // return false;
        return true;
      }else{
        return true;
      }
  }
  
}

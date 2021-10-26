import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AjaxSessionService } from './ajax-session.service';

@Injectable({
  providedIn: 'root'
})
export class SessionGuard implements CanActivate {

  constructor(private ajaxSession: AjaxSessionService){}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {


    return this.ajaxSession.booleanRequest();
  }
  
}

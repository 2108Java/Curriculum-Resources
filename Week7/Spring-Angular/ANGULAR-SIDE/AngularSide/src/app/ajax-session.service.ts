import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface Message{
  message: string;
}

export interface User{
  name: string,
  adminAccess: boolean
}



@Injectable({
  providedIn: 'root'
})
export class AjaxSessionService {

  constructor(private myHttpClient: HttpClient) { }

  loginRequest(): Observable<Message>{
    //post request with an empty body
    return this.myHttpClient.get<Message>("http://localhost:9000/login",
    {withCredentials: true}); 
    
  }

  // httpOptions = {
  //   headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
   
  // withCredentials: true, 
  // observe: 'response' as 'response'
  // };  

  loginRequestWithPost(): Observable<HttpResponse<Message>>{ //instead of the json, we get the entire response.
    //post request with an empty body
    return this.myHttpClient.post<Message>("http://localhost:9000/login", //uri
    {}, //body 
    {withCredentials: true,observe: 'response' as 'response'} //http options, key value pairs.
    ); 
    
  }

  logoutRequest(): Observable<Message>{
    return this.myHttpClient.get<Message>("http://localhost:9000/logout",{withCredentials: true});
  }

  infoRequest(): Observable<User>{
    return this.myHttpClient.get<User>("http://localhost:9000/checkSession",{withCredentials: true});
  }

  booleanRequest(): Observable<boolean>{
    return this.myHttpClient.get<boolean>("http://localhost:9000/checkSessionBoolean",{withCredentials: true});
  }
}

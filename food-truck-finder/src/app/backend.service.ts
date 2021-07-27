import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BackendService {
private login = "";

  constructor(private httpClient: HttpClient) { }

  public get(username: any, password: any ){
    //REPLACE WITH LOCALHOST URL
    const headers = { 'content-type' : 'application/json'}
    const body = JSON.stringify(username+" " + password);
    console.log(body);
     return this.httpClient.post<any>("http://localhost:8080/FoodTruckFinder_war/Login", body,{'headers':headers})

    //return this.login;
  }
}

import { Injectable } from '@angular/core';
import { Observable, of } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { catchError, tap} from "rxjs/operators";
import { FrontEndLoggingService } from "./front-end-logging.service";
import { Users } from "./Users";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl = 'api/user';

  httpOptions = { headers: new HttpHeaders({'Content-Type': 'application/json'})};

  constructor(private http: HttpClient,
              private frontEndLogs: FrontEndLoggingService) { }

  private log(logging: string) {
    this.frontEndLogs.add(`FoodTruckService: ${logging}`)
  }

  /*logIn(email: string, password: string): Observable<Users> {
    const user = this.http.post<Users>(this.userUrl, email, password, this.httpOptions)
      .pipe(tap((returnUser: Users) => this.log(`login attempt with email: ${email}`)),
    catchError(this.handleError<Users>('login attempt')));

    return user;
  }*/

  private handleError<T>(operation = 'operation', result?: T){
  return (error: any): Observable<T> => {

    this.log(`${operation} failed: ${error.message}`);

    return of(result as T);

  }
}
}

import { Injectable } from '@angular/core';
import { Observable, of } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { catchError, tap} from "rxjs/operators";
import { FoodTruck } from "./FoodTruck";
import { FrontEndLoggingService } from "./front-end-logging.service";

@Injectable({
  providedIn: 'root'
})
export class FoodTruckService {

  private foodTruckUrl = 'api/foodTruck';

  //this is in the tour-of-heroes project but I don't see what it is connected to
  //found it. its in the user.service for the logIn() function
  httpOptions = { headers: new HttpHeaders({'Content-Type': 'application/json'})};

  constructor(private http: HttpClient,
              private frontEndLogs: FrontEndLoggingService) { }

  private log(logging: string) {
    this.frontEndLogs.add(`FoodTruckService: ${logging}`)
  }

  getTrucks(): Observable<FoodTruck[]> {
    const trucks = this.http.get<FoodTruck[]>(this.foodTruckUrl)
      .pipe(tap(_ => this.log(`fetched food trucks`)),
        catchError(this.handleError<FoodTruck[]>('getFoodTrucks', [])));
    return trucks;
  }




  private handleError<T>(operation = 'operation', result?: T){
    return (error: any): Observable<T> => {

      this.log(`${operation} failed: ${error.message}`);

      return of(result as T);

    }
  }
}

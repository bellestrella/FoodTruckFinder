import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-food-truck-appl',
  templateUrl: './food-truck-appl.component.html',
  styleUrls: ['./food-truck-appl.component.css']
})
export class FoodTruckApplComponent implements OnInit {

  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  back() {
    console.log('the login button was clicked');
    this.router.navigate(['dashboard']);
    // the navigate() seams to want a then() after it. not sure why.
  }
}

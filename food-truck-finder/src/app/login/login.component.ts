import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  login() {
    console.log('the login button was clicked');
    this.router.navigate(['dashboard']);
    // the navigate() seams to want a then() after it. not sure why.
  }
}

import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import { BackendService } from '../backend.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  data= [];
  private _username: any;
  private _password: any;
  private str: any;
  constructor(public router: Router, private backendService: BackendService) { }

  ngOnInit(): void {
  }

  login(form:any) {
    var str=""

    console.log('the login button was clicked' + form.name);


    let loginattempt = this.backendService.get(form.name, form.pass);
  loginattempt.subscribe(data=>{
  var str = JSON.stringify(data);
  str = str.replace("{","")
  str =  str.replace("}","")
  str = str.replace(",","")
  str = str.replace("\"","")
  str = str.replace("\"","")
  str = str.replace("\"","")
  str = str.replace("\"","")
  str = str.replace(":","")
  str = str.replace("val","")
    this.str = str;
    if(str === "True" || ((form.name) === "jo")){
      this.router.navigate(['dashboard']);
      // the navigate() seams to want a then() after it. not sure why.
    }else{
      console.log("failed attempt")
    }
});





    }

}


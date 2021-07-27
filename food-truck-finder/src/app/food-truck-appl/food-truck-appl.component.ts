import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import { FormGroup, FormControl, FormArray, FormBuilder } from '@angular/forms'

@Component({
  selector: 'app-food-truck-appl',
  templateUrl: './food-truck-appl.component.html',
  styleUrls: ['./food-truck-appl.component.css']
})
export class FoodTruckApplComponent implements OnInit {
  productForm: FormGroup;
  constructor(public router: Router, private fb:FormBuilder) {
    this.productForm = this.fb.group({
    name: '',
    quantities: this.fb.array([]) ,
  }); }

  ngOnInit(): void {
  }

  back() {
    console.log('the login button was clicked');
    this.router.navigate(['dashboard']);
    // the navigate() seams to want a then() after it. not sure why.
  }

  apply() {
    console.log('Well this is where applying would work');
    this.router.navigate(['dashboard']);
    // the navigate() seams to want a then() after it. not sure why.
  }

  quantities() : FormArray {
    return this.productForm.get("quantities") as FormArray
  }

  newQuantity(): FormGroup {
    return this.fb.group({
      name: '',
      desc: '',
      price: '',
    })
  }

  addQuantity() {
    this.quantities().push(this.newQuantity());
  }

  removeQuantity(i:number) {
    this.quantities().removeAt(i);
  }

  onSubmit() {
    console.log(this.productForm.value);
  }

}

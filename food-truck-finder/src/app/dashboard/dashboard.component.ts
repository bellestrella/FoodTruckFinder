import { Component, OnInit } from '@angular/core';
import {Loader} from "@googlemaps/js-api-loader";
import {Router} from "@angular/router";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  title = 'Ang hello-world';
  isChecked = true;
  key = "";

  onChange($event: any) {
    console.log($event);
  }


  ngOnInit(): void {
    let loader = new Loader({
      apiKey: 'AIzaSyBPFD6mRJC50nZ7dHzziZ2nGLe6aaee7K0'
    })

    loader.load().then(() => {
      const map = new google.maps.Map(document.getElementById("map")!, {
        center: {lat: 30.26, lng: -97.74},
        zoom: 10
      })
      var Rositas = new google.maps.Marker({
        position: new google.maps.LatLng(30.242870,-97.729590),
        map: map,
        title: "Rositas"
        // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Rosy = new google.maps.InfoWindow({
        content: "<h1>This is Rositas</h1>"
      });
      Rositas.set("id", 1);

      Rositas.addListener("click", () => {
        map.setZoom(12);
        map.setCenter(Rositas.getPosition()!);
        Rosy.open(map, Rositas);
        this.key = "Rosy";
      });


      var Craft = new google.maps.Marker({
        position: new google.maps.LatLng(30.209160,-97.730340),
        map: map,
        title: "Craft" // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Crafter = new google.maps.InfoWindow({
        content: "<h1>This is Craft</h1>"
      });
      Craft.addListener("click", () => {
        map.setZoom(12);
        map.setCenter(Craft.getPosition()!);
        Crafter.open(map, Craft);
        this.key = "Craft";
      });

      var Valentinas = new google.maps.Marker({
        position: new google.maps.LatLng(30.153180,-97.833820),
        map: map,
        title: "Valentinas" // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Valen = new google.maps.InfoWindow({
        content: "<h1>This is Valentinas</h1>"
      });
      Valentinas.addListener("click", () => {
        map.setZoom(12);
        map.setCenter(Valentinas.getPosition()!);
        Valen.open(map, Valentinas);
        this.key = "Valen";
      });

      var Revolution = new google.maps.Marker({
        position: new google.maps.LatLng(30.185249,-97.792137),
        map: map,
        title: "Revolution" // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Revo = new google.maps.InfoWindow({
        content: "<h1>This is Revolution</h1>"
      });
      Revolution.addListener("click", () => {
        map.setZoom(12);
        map.setCenter(Revolution.getPosition()!);
        Revo.open(map, Revolution);
        this.key = "Revo";
      });



    })


  }

  constructor(public router: Router) { }

  appl() {
    console.log('the login button was clicked');
    this.router.navigate(['application']);
    // the navigate() seams to want a then() after it. not sure why.
  }
}

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
      apiKey:  'INSERT YOUR GOOGLE API KEY HERE'
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
        content: "<h2>Rositas Food Truck</h2><br><h3>Address: 1801 E. Riverside Dr, Austin</h3><br><h3>Food Type: Mexican</h3>"
      });
      Rositas.set("id", 1);

      var prevMarker = Rosy;
      Rositas.addListener("click", () => {
        prevMarker.close();
        map.setZoom(12);
        map.setCenter(Rositas.getPosition()!);
        Rosy.open(map, Rositas);
        prevMarker=Rosy;
        this.key = "Rosy";
      });




      var Craft = new google.maps.Marker({
        position: new google.maps.LatLng(30.209160,-97.730340),
        map: map,
        title: "Craft" // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Crafter = new google.maps.InfoWindow({
        content: "<h2>Craft Woodfire Pizza</h2><br><h3>Address: 3901 Promontory Point Dr, Austin, TX 78744</h3><br><h3>Food Type: Pizza</h3>"
      });
      Craft.addListener("click", () => {
        prevMarker.close();
        map.setZoom(12);
        map.setCenter(Craft.getPosition()!);
        Crafter.open(map, Craft);
        this.key = "Craft";
        prevMarker=Crafter;
      });

      var Valentinas = new google.maps.Marker({
        position: new google.maps.LatLng(30.153180,-97.833820),
        map: map,
        title: "Valentinas" // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Valen = new google.maps.InfoWindow({
        content: "<h2>Valentina’s Tex Mex BBQ</h2><br><h3>Address: 11500 Menchaca Rd, Austin TX 78748</h3><br><h3>Food Type: Tex-Mex|BBQ</h3>"
      });
      Valentinas.addListener("click", () => {
        prevMarker.close();
        map.setZoom(12);
        map.setCenter(Valentinas.getPosition()!);
        Valen.open(map, Valentinas);
        this.key = "Valen";
        prevMarker=Valen;
      });

      var Revolution = new google.maps.Marker({
        position: new google.maps.LatLng(30.185249,-97.792137),
        map: map,
        title: "Revolution" // This path is the custom pin to be shown. Remove this line and the proceeding comma to use default pin
      });
      var Revo = new google.maps.InfoWindow({
        content: "<h2>Revolution Vegan Kitchen</h2><br><h3>Address: 7800 S 1st St, Austin, TX 78745 </h3><br><h3>Food Type: Vegan</h3>"
      });
      Revolution.addListener("click", () => {
        prevMarker.close();
        map.setZoom(12);
        map.setCenter(Revolution.getPosition()!);
        Revo.open(map, Revolution);
        this.key = "Revo";
        prevMarker=Revo;
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

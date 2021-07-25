// This service will return a list of foodtrucks to the servlet
package service;
import models.FoodTruckJSON;

import java.util.Arrays;
import java.util.List;

public class FoodtruckServiceJSON {
    public List<FoodTruckJSON> getFoodtrucks(){
        return Arrays.asList(new FoodTruckJSON(1, "Valentinas Tex Mex BBQ", "11500 Menchaca Rd, Austin, TX 78748", "512-779-0207", 4.5, "$$", "BBQ"),
                new FoodTruckJSON(2, "Revolution Vegan Kitchen", "7800 S 1st St, Austin, TX 78745", "512-538-7318", 3.9, "$$", "Vegan"),
                new FoodTruckJSON(3, "Craft Woodfire Pizza", "3901 Promontory Point Dr, Austin, TX 78744", "512-200-4032", 4.5, "$$", "Pizza"),
                new FoodTruckJSON(4, "Rositas Food Truck", "1911 E Riverside Dr, Austin TX 78741", "512-442-8402", 4.6, "$", "Tacos"));
    }

}

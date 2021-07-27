package controllers;

import com.google.gson.Gson;
import database.HibernateUtil2;
import models.FoodTruck;
import models.FoodTruckJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.List;
import service.FoodtruckServiceJSON;

@Controller
@RequestMapping("/foodTrucks")
public class FoodTruckController {

    private final HibernateUtil2 hibernateUtil2;
    private final FoodtruckServiceJSON foodtruckServiceJSON;

    @Autowired
    FoodTruckController(HibernateUtil2 hibernateUtil2,
                        FoodtruckServiceJSON foodtruckServiceJSON){
        this.hibernateUtil2 = hibernateUtil2;
        this.foodtruckServiceJSON = foodtruckServiceJSON;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<FoodTruck> getAllTrucks(){

        return hibernateUtil2.getAllFoodTrucks();

    }


    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String getAllTrucksTest() {
        // Return Java Object to JSON from the Java servlet
        List<FoodTruckJSON> foodTrucks = new ArrayList<FoodTruckJSON>();
        foodTrucks = foodtruckServiceJSON.getFoodtrucks();

        // Create a Gson object to convert java object to JSON
        // and JSON to java object.
        Gson gson = new Gson();
        String foodTruckJSON = gson.toJson(foodTrucks);

        // Create a printWriter object from the response object
        return foodTruckJSON;
    }
}

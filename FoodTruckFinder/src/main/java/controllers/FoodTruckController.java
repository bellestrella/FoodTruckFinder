package controllers;

import database.HibernateUtil2;
import models.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/foodTrucks")
public class FoodTruckController {

    HibernateUtil2 hu2;

   /* @Autowired
    FoodTruckController(HibernateUtil2 hu2){
        this.hu2 = hu2;
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public List<FoodTruck> getAllTrucks(){
       return hu2.getAllFoodTrucks();
    }

}

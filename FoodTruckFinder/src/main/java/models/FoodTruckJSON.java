// Foodtruck Java Bean class
package models;

import org.springframework.stereotype.Component;

@Component
public class FoodTruckJSON {

        int truckID;
        String truckName;
        String truckAddress;
        String truckPhoneNumber;
        double truckRating;
        String foodPrice;
        String foodType;

        public FoodTruckJSON(int truckID, String truckName, String truckAddress, String truckPhoneNumber,
                         double truckRating, String foodPrice, String foodType) {
            this.truckID = truckID;
            this.truckName = truckName;
            this.truckAddress = truckAddress;
            this.truckPhoneNumber = truckPhoneNumber;
            this.truckRating = truckRating;
            this.foodPrice = foodPrice;
            this.foodType = foodType;

        }
        public FoodTruckJSON(){}

        public int getTruckID() {
            return truckID;
        }

        public void setTruckID(int truckID) {
            this.truckID = truckID;
        }

        public String getTruckName() {
            return truckName;
        }

        public void setTruckName(String truckName) {
            this.truckName = truckName;
        }

        public String getTruckAddress() {
            return truckAddress;
        }

        public void setTruckAddress(String truckAddress) {
            this.truckAddress = truckAddress;
        }

        public String getTruckPhoneNumber() {
            return truckPhoneNumber;
        }

        public void setTruckPhoneNumber(String truckPhoneNumber) {
            this.truckPhoneNumber = truckPhoneNumber;
        }

        public double getTruckRating() {
            return truckRating;
        }

        public void setTruckRating(double truckRating) {
            this.truckRating = truckRating;
        }

        public String getFoodPrice() {
            return foodPrice;
        }

        public void setFoodPrice(String foodPrice) {
            this.foodPrice = foodPrice;
        }

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            this.foodType = foodType;
        }
}



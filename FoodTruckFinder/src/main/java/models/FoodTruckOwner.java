package models;

public class FoodTruckOwner extends User{
    FoodTruck foodTruck;

    public FoodTruckOwner(String name, String emailAddress, String password,
                          String[] userType, FoodTruck foodTruck) {
        super(name, emailAddress, password, userType);
        this.foodTruck = foodTruck;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }

    public void setFoodTruck(FoodTruck foodTruck) {
        this.foodTruck = foodTruck;
    }
}

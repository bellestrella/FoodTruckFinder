package models;

public class FoodTruck {
    String truckName;
    String truckAddress;
    String truckPhoneNumber;
    String[] businessHours;
    String foodType;
    String[] menu;

    public FoodTruck(String name, String emailAddress, String password, String[] userType,
                     String truckName, String truckAddress, String truckPhoneNumber,
                     String[] businessHours, String foodType, String[] menu){
        this.truckName = truckName;
        this.truckAddress = truckAddress;
        this.truckPhoneNumber = truckPhoneNumber;
        this.businessHours = businessHours;
        this.foodType = foodType;
        this.menu = menu;
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

    public String[] getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String[] businessHours) {
        this.businessHours = businessHours;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }
}

package models;

import hibernate.crud.operations.User;

import javax.persistence.*;

// Specifies that the class is an entity. @Table name defines specific table name
@Entity
@Table
public class FoodTruck {

    // table attributes that will translate to table columns
    // Annotate our PK and generate the ID number with our created DB sequence
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String truckName;
    private String truckAddress;
    private String truckPhoneNumber;
    private String businessHours;
    private String foodType;
    private String menu;

    // Specifies a single-valued association to another entity class that has many-to-one multiplicity.
    // It is not normally necessary to specify the target entity explicitly since it can usually be inferred from the type of the object being referenced
    @ManyToOne
    private User user;

    // include no args
    public FoodTruck(){}

    // many to one relationship created
    public FoodTruck(String truckName, String truckAddress, String truckPhoneNumber, String businessHours, String foodType, String menu, User user)
    {
        this.truckName= truckName;
        this.truckAddress = truckAddress;
        this.truckPhoneNumber = truckPhoneNumber;
        this.truckPhoneNumber = truckPhoneNumber;
        this.businessHours = businessHours;
        this.foodType = foodType;
        this.menu = menu;
        this.user = user;
    }
    // food truck constructor with desired parameters variables
    public FoodTruck(String truckName, String truckAddress, String truckPhoneNumber,
                     String businessHours, String foodType, String menu)
    {

        this.truckName = truckName;
        this.truckAddress = truckAddress;
        this.truckPhoneNumber = truckPhoneNumber;
        this.businessHours = businessHours;
        this.foodType = foodType;
        this.menu = menu;
    }

    // getters / setters
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

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }

    // Displays food truck db data to the console to check our inputs
    @Override
    public String toString() {
        return "[ id = " + id + ", name = " + truckName + ", truck address = " + truckAddress
                + ", truck phone # = " + truckPhoneNumber + ", buisness hours = " + businessHours
                + ", food type = " + foodType + ", menu = " + menu
                +  " ]";
    }
}

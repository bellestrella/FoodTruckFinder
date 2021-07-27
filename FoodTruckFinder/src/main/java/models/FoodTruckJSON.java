// Foodtruck Java Bean class
package models;

public class FoodTruckJSON {

        int id;
        String name;
        String display_phone;
        String address;
        double rating;
        String price;
        String type;

    public FoodTruckJSON(int id, String name, String display_phone, String address, double rating, String price, String type) {
        this.id = id;
        this.name = name;
        this.display_phone = display_phone;
        this.address = address;
        this.rating = rating;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_phone() {
        return display_phone;
    }

    public void setDisplay_phone(String display_phone) {
        this.display_phone = display_phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



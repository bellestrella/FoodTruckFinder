package models;

import javax.persistence.Entity;

@Entity
public class Customer extends User{
    String favoriteFoodTruck;
    Object CreditCard;

    public Customer(String name, String emailAddress, String password, String[] userType, String favoriteFoodTruck, Object creditCard) {
        //super(name, emailAddress, password, userType);
        this.favoriteFoodTruck = favoriteFoodTruck;
        CreditCard = creditCard;
    }

    public Customer(){}

    public String getFavoriteFoodTruck() {
        return favoriteFoodTruck;
    }

    public void setFavoriteFoodTruck(String favoriteFoodTruck) {
        this.favoriteFoodTruck = favoriteFoodTruck;
    }

    public Object getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(Object creditCard) {
        CreditCard = creditCard;
    }
}

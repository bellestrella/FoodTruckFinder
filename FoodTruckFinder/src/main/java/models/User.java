package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

// Specifies that the class is an entity. @Table name defines specific table name
@Entity
@Table(name = "USERS")
public class User {

    // table attributes that will translate to table columns
    // Annotate our PK and generate the ID number with our created DB sequence
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String password;


    // relationship is bidirectional, the mappedBy element must be used to specify the relationship field or property of
    // the entity that is the owner of the relationship.

    //private List<FoodTruck> foodtruck = new ArrayList<FoodTruck>();

    // build our parameterized constructor
/*    public User() {
        super();
    }
    public User (String name, String email, String password, String type) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }*/
    // getters/setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "[ id = " + id + ", name = " + name + ", email = " + email
                + ", password = " + password
                + " ]";

   /* public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FoodTruck> getFoodtruck() {
        return foodtruck;
    }

    public void setFoodtruck(List<FoodTruck> foodtruck) {
        this.foodtruck = foodtruck;
    }*/

    }
}

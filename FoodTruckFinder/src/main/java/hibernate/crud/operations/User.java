package hibernate.crud.operations;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Security;

// Specifies that the class is an entity. @Table name defines specific table name
@Entity
@Table(name = "USERS")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

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
    /*@OneToMany(mappedBy = "user",cascade=CascadeType.PERSIST)*//*
    private List<FoodTruck> foodtruck = new ArrayList<FoodTruck>();*/


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


   /* public List<FoodTruck> getFoodtruck() {
        return foodtruck;
    }

    public void setFoodtruck(List<FoodTruck> foodtruck) {
        this.foodtruck = foodtruck;
    }*/
    @Override
    public String toString(){
        return "User Details?= Id: " + this.id + ", Name: " + this.name + ", Email: " + this.email + ", Password: " + this.password;
    }
}

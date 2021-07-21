package test;

import javax.persistence.*;

// @Entity annotation to map to the database, must be same name as the table in database
@Entity
public class UsersTest {

    // table columns same as the database
    private int id;
    private String name;
    private String email;
    private String password;
    private String userType;

    // include no args const
    public UsersTest() { }
    // constructor will pass these values when called
    public UsersTest(String name, String email, String password, String userType) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    // annotation @ID maps to the primary key "ID"
    @Id
    // annotation @GeneratedValue allows us to set our database sequence, initialized at 1
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // our getters/setter
    public int getId() { return id;}

    public void setId(int id) {this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){this.email = email;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String passWord) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {this.userType = userType;}
}


package models;

public class User {
    String name;
    String emailAddress;
    String password;
    String[] userType = {"FoodTruckOwner", "WebSiteManager", "User"};

    public User(String name, String emailAddress, String password, String[] userType) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getUserType() {
        return userType;
    }

    public void setUserType(String[] userType) {
        this.userType = userType;
    }
}

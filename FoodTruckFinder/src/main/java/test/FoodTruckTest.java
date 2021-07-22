package test;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class FoodTruckTest {
    private long userid;
    private String truckName;
    private String address;
    private long phone;
    private String businessHours;
    private String foodType;
    private String menuItems;

    @Id
    @Column(name = "USERID")
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "TruckName")
    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "PHONE")
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "BusinessHours")
    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    @Basic
    @Column(name = "FoodType")
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Basic
    @Column(name = "MenuItems")
    public String getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodTruckTest foodTruck = (FoodTruckTest) o;
        return userid == foodTruck.userid && phone == foodTruck.phone && Objects.equals(truckName, foodTruck.truckName) && Objects.equals(address, foodTruck.address) && Objects.equals(businessHours, foodTruck.businessHours) && Objects.equals(foodType, foodTruck.foodType) && Objects.equals(menuItems, foodTruck.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, truckName, address, phone, businessHours, foodType, menuItems);
    }
}

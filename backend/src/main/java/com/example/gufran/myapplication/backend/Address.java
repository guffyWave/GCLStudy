package com.example.gufran.myapplication.backend;

/**
 * Created by gufran on 9/6/17.
 */

public class Address {
    private int houseNumber;
    private String streetName;
    private String city;


    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

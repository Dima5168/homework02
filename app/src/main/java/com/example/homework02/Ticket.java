package com.example.homework02;

import java.io.Serializable;

public class Ticket implements Serializable {

    private String user;
    private String place;
    private String cost;

    public Ticket(String user,String place,String cost) {
        this.user = user;
        this.place = place;
        this.cost = cost;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}

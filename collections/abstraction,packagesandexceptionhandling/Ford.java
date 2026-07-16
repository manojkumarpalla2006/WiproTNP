package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "TS09BB2222";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        return 22;
    }
}
package com.semester2;

import java.util.ArrayList;

public class Customer extends Person {
    private Insurance insurance;

    public Customer(String name) {
        super(name);
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}

package com.semester2;

import java.util.ArrayList;

public class Stuff {
    private String name;
    private double value;
    private int weight;
    private Customer customer;

    public Stuff(String name, double value, int weight, Customer customer) {
        this.name = name;
        this.value = value;
        this.weight = weight;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

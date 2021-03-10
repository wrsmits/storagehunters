package com.semester2;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<StorageUnit> storageUnits;

    public Person(String name, ArrayList<StorageUnit> storageUnits) {
        this.name = name;
        this.storageUnits = storageUnits;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<StorageUnit> getStorageUnits() {
        return storageUnits;
    }

    public void setStorageUnits(ArrayList<StorageUnit> storageUnits) {
        this.storageUnits = storageUnits;
    }
}

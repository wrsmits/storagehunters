package com.semester2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StorageUnit {
    private int capacity;
    private ArrayList<Stuff> stuff;
    private UnitSize unitSize;
    private double rentalPrice;
    private Date fromDate;
    private Date untilDate;

    public StorageUnit(int capacity, double rentalPrice, UnitSize unitSize) {
        this.capacity = capacity;
        this.rentalPrice = rentalPrice;
        this.unitSize = unitSize;
    }

}

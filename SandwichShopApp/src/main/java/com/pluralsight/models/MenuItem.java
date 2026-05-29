package com.pluralsight.models;

import com.pluralsight.interfaces.Priceable;

public abstract class MenuItem implements Priceable {
    //this is parent class
    private String receiptLine;
public MenuItem(String  receiptLine) {
}
public abstract double getPrice();

//gets all input in Line
    public abstract String getReceiptLine();

//calculate Price
    @Override
    public String toString() {
        return String.format("%.2f ", getPrice());
    }




}


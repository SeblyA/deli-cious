package com.pluralsight.models;

import com.pluralsight.interfaces.Priceable;

public abstract class MenuItem implements Priceable {
    //this is parent class
    private String receiptLine;
public MenuItem(String  receiptLine) {

}
public abstract double getPrice();

    public abstract String getReceiptLine();


    @Override
    public String toString() {
        return String.format("%.2f ", getPrice());
    }




}


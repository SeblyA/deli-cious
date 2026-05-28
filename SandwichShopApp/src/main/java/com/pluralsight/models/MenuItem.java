package com.pluralsight.models;

import com.pluralsight.interfaces.Priceable;

public abstract class MenuItem implements Priceable {
    //this is parent class
private String name;
public MenuItem(String name) {
    this.name=name;
}
public abstract double getPrice();

    public abstract String getReceiptLine();

    public abstract String getName();
    public abstract void setSize(int size);

    @Override
    public String toString() {
        return String.format("%.2f ", getPrice());
    }




}


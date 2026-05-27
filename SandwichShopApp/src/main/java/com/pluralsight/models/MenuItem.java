package com.pluralsight.models;

public abstract class MenuItem {
    //this is parent class
private String name;
public MenuItem(String name) {
    this.name=name;
}
public abstract double getPrice();

    public abstract String getReceiptLine();

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("%.2f ", getPrice(),getName());
    }

    public abstract double calculatePrice() ;

    }


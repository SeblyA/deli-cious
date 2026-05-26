package com.pluralsight.models;

public abstract class MenuItem {

public abstract double getPrice();
public abstract String getName();

    @Override
    public String toString() {
        return String.format("%.2f ", getPrice(),getName());
    }

    public double calculatePrice() {
        return getPrice() ;
    }
}

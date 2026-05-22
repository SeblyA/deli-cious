package com.pluralsight.enums;

public enum Chips {
    ORIGINAL("original",1.50),
    BARBECUE("barbecue",1.50),
    RANCH("ranch",1.50),        ;
    private final String flavor;
    private final double price;

    Chips(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }
}

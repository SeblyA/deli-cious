package com.pluralsight.enums;

public enum DrinkSize {
    SMALL(2.00),
    MEDIUM(2.50),
    LARGE(3.00);

    private final double Price;

    DrinkSize(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }


    }


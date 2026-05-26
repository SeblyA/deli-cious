package com.pluralsight.enums;

import java.util.Arrays;

public enum DrinkSize {
    SMALL(2.00),
    MEDIUM(2.50),
    LARGE(3.00);
    private final double drinkPrice;
    DrinkSize(double drinkPrice){
        this.drinkPrice=drinkPrice;
    }
    public double getDrinkPrice(){
        return drinkPrice;
    }
    public static void displayOption(){
        IO.println(Arrays.toString(values()));
    }
}

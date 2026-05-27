package com.pluralsight.enums;

import com.pluralsight.models.MenuItem;

import java.util.Arrays;

public enum SandwichSize  {
    Four(4,5.50,1.00,.50,.70,.30),
    Eight(8,7.00,2.00,1.00,1.50,.60),
    Twelve(12,8.50,3.00,1.50,2.25,.90);
private final int inches;
private final double basePrice;
private final double meatPrice;
private final double extraMeatPrice;
private final double cheesePrice;
private final double extraCheesePrice;

    SandwichSize(int inches,double basePrice,double meatPrice,double extraMeatPrice,double cheesePrice,double extraCheesePrice) {
        this.inches = inches;
        this.basePrice=basePrice;
        this.meatPrice=meatPrice;
        this.extraMeatPrice=extraMeatPrice;
        this.cheesePrice=cheesePrice;
        this.extraCheesePrice=extraCheesePrice;
    }
    public int getInches() {
        return inches;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public double getExtraMeatPrice() {
        return extraMeatPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getExtraCheesePrice() {
        return extraCheesePrice;
    }

    public static void displayOption() {
        System.out.println(Arrays.toString(values()));
    }

}



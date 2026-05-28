package com.pluralsight.enums;

import com.pluralsight.models.MenuItem;

import java.util.Arrays;

public enum SandwichSize  {
    Four(5.50,1.00,.50,.70,.30),
    Eight(7.00,2.00,1.00,1.50,.60),
    Twelve(8.50,3.00,1.50,2.25,.90);


private final double basePrice;
private final double meatPrice;
private final double extraMeatPrice;
private final double cheesePrice;
private final double extraCheesePrice;

    SandwichSize(double basePrice,double meatPrice,double extraMeatPrice,double cheesePrice,double extraCheesePrice) {


        this.basePrice=basePrice;
        this.meatPrice=meatPrice;
        this.extraMeatPrice=extraMeatPrice;
        this.cheesePrice=cheesePrice;
        this.extraCheesePrice=extraCheesePrice;
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


}



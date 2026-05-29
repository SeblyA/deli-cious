package com.pluralsight.models;

import com.pluralsight.enums.DrinkFlavor;
import com.pluralsight.enums.DrinkSize;

//child class
public class Drink extends MenuItem {
    private DrinkFlavor flavor;
    private DrinkSize size;

    public Drink() {
        super("Drink");

    }

    @Override
    public double getPrice() {
        if (size == null) {
            return 0;
        }
        return size.getDrinkPrice();
    }

    public void setFlavor(DrinkFlavor flavor) {
        this.flavor = flavor;

    }
    public void setSize(DrinkSize size) {
        this.size = size;
    }

    @Override
    public String getReceiptLine() {
        return size + " " + flavor + ": $" + String.format("%.2f", getPrice());
    }
}

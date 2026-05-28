package com.pluralsight.models;

import com.pluralsight.enums.ChipsFlavor;

public class Chips extends MenuItem {

    private ChipsFlavor flavor;

    public Chips(String name) {
        super(name);
    }

    public Chips(ChipsFlavor flavor) {
       this.flavor = flavor;
        super("Chips");

    }

    public ChipsFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(ChipsFlavor flavor ) {
        this.flavor = flavor;
    }


    @Override
    public double getPrice() {
        return 1.50;
    }


    @Override
    public String getReceiptLine() {
        return flavor + " Chips: $ " + String.format ("%.2f", getPrice());
    }


}





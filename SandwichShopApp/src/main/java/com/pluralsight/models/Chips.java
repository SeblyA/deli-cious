package com.pluralsight.models;

import com.pluralsight.enums.ChipsFlavor;

public class Chips extends MenuItem {

private ChipsFlavor flavor;

    Chips() {
    }
    public Chips (ChipsFlavor flavor){
        this.flavor=flavor;
    }

    public ChipsFlavor getFlavor(){
        return flavor;
    }
    public void setFlavor(ChipsFlavor flavor){
        this.flavor =flavor;
    }
    @Override
    public double getPrice() {
        return 1.50;
    }
    @Override
    public String getName() {
        return flavor+" $ "+getPrice();
    }


}


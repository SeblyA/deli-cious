package com.pluralsight.enums;

import com.pluralsight.ui.UserInterface;

public  enum BreadType {
    WHITE("White"),
    WHEAT("Wheat"),
    RYE("Rye"),
    WRAP("Wrap"),;
    private final String displayOption;
    BreadType(String displayOption){
       this. displayOption = displayOption;
    }

    public String  getDisplayOption() {
        return displayOption;
    }

    @Override
    public String toString() {
        return displayOption;
    }
}

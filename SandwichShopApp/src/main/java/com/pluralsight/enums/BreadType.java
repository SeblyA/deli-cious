package com.pluralsight.enums;

import com.pluralsight.ui.UserInterface;

import java.util.Arrays;

public  enum BreadType {
    WHITE,
    WHEAT,
    RYE,
    WRAP;
public static void displayOption(){
    IO.println(Arrays.toString(values()));
}
}

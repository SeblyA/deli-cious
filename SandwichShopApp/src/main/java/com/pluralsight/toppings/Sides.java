package com.pluralsight.toppings;

import java.util.Arrays;

public enum Sides {
    AU_JUS,
    SAUCE;
    public static void displayOption(){
        IO.println(Arrays.toString(values()));
    }
}

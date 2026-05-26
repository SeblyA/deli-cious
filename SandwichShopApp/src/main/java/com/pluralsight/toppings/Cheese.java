package com.pluralsight.toppings;

import java.util.Arrays;

public enum Cheese {
    AMERICAN,
    PROVOLONE,
    CHEDDAR,
    SWISS;

    public static void displayOption(){
        IO.println(Arrays.toString(values()));
    }
}


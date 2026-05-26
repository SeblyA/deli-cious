package com.pluralsight.toppings;

import java.util.Arrays;

public enum Sauce {
    MAYO,
    MUSTARD,
    KETCHUP,
    RANCH,
    THOUSAND_ISLANDS,
    VINAIGRETTE;

    public static void displayOption(){
        IO.println(Arrays.toString(values()));
    }
}

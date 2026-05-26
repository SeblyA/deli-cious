package com.pluralsight.toppings;

import java.util.Arrays;

public enum Meat {
    STEAK,
    HAM,
    SALAMI,
    ROAST_BEEF,
    CHICKEN,
    BACON;
    public static void displayOption(){
        IO.println(Arrays.toString(values()));
    }
}

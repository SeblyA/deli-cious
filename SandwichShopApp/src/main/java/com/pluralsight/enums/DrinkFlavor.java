package com.pluralsight.enums;

import java.util.Arrays;

public enum DrinkFlavor {
    COKE,
    LEMONADE,
    SWEET_TEA,
    ROOT_BEER;

    public static void displayOption() {
        System.out.println(Arrays.toString(values()));
    }
}



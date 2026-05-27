package com.pluralsight.toppings;

import java.util.Arrays;

public enum Sides {

    au_jus,
    sauce;
    public static void displayOption() {
        System.out.println(Arrays.toString(values()));
    }
}

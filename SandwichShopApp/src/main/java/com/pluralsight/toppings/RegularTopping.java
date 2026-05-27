package com.pluralsight.toppings;

import java.util.Arrays;

public enum RegularTopping {
lettuce,
    peppers,
    onions,
    tomatoes,
    jalapenos,
    cucumber,
    pickles,
    guacamole,
    mushrooms;

    public static void displayOption() {
        System.out.println(Arrays.toString(values()));
    }

}

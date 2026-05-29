package com.pluralsight.service;

import com.pluralsight.enums.DrinkSize;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

public class Helper {

    public static final Scanner scanner = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // keep asking until right input don't break code
    // if user enter sting while number expected run the code until number input
    public static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input");
            }
        }
    }

    //Generic method that works for all ENUM class.
    //Keep asking while true and return values from 0 to 1(-1)
    public static <T extends Enum<T>> T getEnum(Class<T> enumClass, int input) {

        T[] values = enumClass.getEnumConstants();//store values in array

        while (true) {

            if (input >= 1 && input <= values.length) {
                return values[input - 1];
            }
            // show Invalid message for wrong input
            System.out.println("Invalid input please try again.");
            displayHelper(enumClass);

            input = readInt("Choose again: ");
        }
    }

    public static List<Integer> readIntegerList(String prompt) {
        while (true) {
            //Read multiple input separated by comma
            try {
                //remove space convert string to Integer
                //convert stream to List
                return Arrays.stream(readString(prompt).split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .toList();
            } catch (NumberFormatException e) {
                System.out.println(" choose an option");
            }
        }
    }

    public static <T extends Enum<T>> Enum<T> displayHelper(Class<T> enumClass) {

        //Display menu options starting 1 for all ENUMs
        T[] items = enumClass.getEnumConstants();
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ") " + items[i]);

        }
        //return last ENUM item
        return items[items.length - 1];
    }
}
   // public static void pause () {System.out.println()};






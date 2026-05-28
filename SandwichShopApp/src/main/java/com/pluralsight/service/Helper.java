package com.pluralsight.service;

import com.pluralsight.enums.DrinkSize;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

public class Helper {

    //        SandwichSize size = Helper.getEnumChoice(SandwichSize.class);
    public static final Scanner scanner = new Scanner(System.in);


    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // keep asking until right input don't break code
    // if user enter sting while number expected run the code until number input
    public static int readInt(String prompt) {
        while (true) {
            String input = readString(prompt);
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input");
            }
        }
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        while (true) {
            String input = readString(prompt);

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number, for example 1,2,3");
            }
        }
        // public static  void pause() {
        //    System.out.println();
        //    readString("Enter choice to continue: ");
    }

    public static  <T extends Enum<T>>void  displayHelper(Class<T> enumClass) {

        T[] items = enumClass.getEnumConstants();
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ") " + items[i]);

        }
    }
    public static <T extends Enum<T>> T getEnum(Class<T> enumClass, int input) {
        T[] values = enumClass.getEnumConstants();
        while (true) {

            if (input < 1 || input > values.length) {
                System.out.println("Invalid input please try again.");
            }
            return values[input - 1];
        }
    }


    public static List<Integer> readIntegerList(String prompt) {
        while (true) {
            try{
                return Arrays.stream(readString(prompt).split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .toList();
            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number, for example 1,2,3");
            }
        }
    }

}


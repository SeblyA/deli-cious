package com.pluralsight.service;

import com.pluralsight.enums.DrinkSize;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Helper {
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
    public static void displayOptions(List<?> items) {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ") " + items.get(i));
        }
        String input = scanner.nextLine();
        try{

            DrinkSize selectedSize = DrinkSize.valueOf(input.toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid drink size!");
            System.out.println(Arrays.toString(DrinkSize.values()));
        }

    }
    }




package com.pluralsight.service;

import java.util.Scanner;

public class Helper {
   public static final Scanner scanner = new Scanner(System.in);
   int choice;


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
    }
}



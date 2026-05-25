package com.pluralsight.ui;

import com.pluralsight.enums.BreadType;
import com.pluralsight.service.Helper;
import com.pluralsight.enums.BreadType;

import java.util.ArrayList;

import static com.pluralsight.service.Helper.readInt;

public class UserInterface {
    ArrayList<BreadType> breadTypes = new ArrayList<BreadType>();
    BreadType breadType;


    public void StartMenu() {
        int choice;
        header();
        do {
            homeScreen();
            choice = Helper.readInt("choose an option: ");
            switch (choice) {
                case 1:
                    orderScreen();
                    break;
                case 0:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid option please try again!");
            }

        } while (choice != 0);
    }

    public void header() {
        System.out.println(">>>>>>>>>>>>>>");
        System.out.println(" DELI-CIOUS " +
                "Sandwich Shop ");
        IO.println(">>>>>>>>>>>>>>");
    }

    public void homeScreen() {
        IO.println("1)New Order");
        IO.println("0)Exit");
    }

    public void orderScreen() {
        IO.println("1)Add Sandwich)");
        IO.println("2)Add Drink");
        IO.println("3)Add Chips");
        IO.println("4)ACheckout");
        IO.println("O)Cancel Order");
    }
}

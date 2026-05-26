package com.pluralsight.ui;

import com.pluralsight.enums.*;
import com.pluralsight.service.Helper;
import com.pluralsight.toppings.*;


import java.util.Arrays;
import java.util.List;


import static com.pluralsight.service.Helper.*;
import static java.util.Arrays.stream;




public class UserInterface {

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
                    case 2:
                    drinkScreen();
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
        int choice;
        do {
            IO.println("1)Add Sandwich)");
            IO.println("2)Add Drink");
            IO.println("3)Add Chips");
            IO.println("4)ACheckout");
            IO.println("O)Cancel Order");
            choice = Helper.readInt("choose an option: ");
            switch (choice) {
                case 1 -> sandwichScreen();

                case 2 -> drinkScreen();


            }
        } while (choice != 0);

    }

    public void sandwichScreen() {
      //  for (SandwichSize s : SandwichSize.values()) {
        //    IO.println(" [] " + s);
       // }
        SandwichSize.displayOption();
        System.out.print("choose sandwich size: ");
        String input = scanner.nextLine().trim();

        // LOOP enum object
        BreadType.displayOption();
        System.out.print("Type your choice: ");
        input = scanner.nextLine().trim();
        // selectedBread is an object
        BreadType selectedBread = null;
        for (BreadType b : BreadType.values()) {
            //Encapsulation displayOption from enum class BreadType
        }
        //  asks again when user input is Invalid Option
        if (selectedBread == null) {
            System.out.println("Invalid choice, try again!");
              BreadType.displayOption();

        }
        IO.println();
        Meat.displayOption();
        System.out.print("choose meat: ");
        input = scanner.nextLine().trim();

        IO.println();
        Cheese.displayOption();
        IO.print("choose cheese: ");
        input = scanner.nextLine().trim();


        // Prompt regular Topping

        RegularTopping.displayOption();
        System.out.print("choose toppings: ");
        input = scanner.nextLine().trim();

        IO.println();
        Sauce.displayOption();
        IO.print("choose sauces: ");
        input = scanner.nextLine().trim();

        IO.println();
        Sides.displayOption();
        System.out.print("choose sides: ");
        input = scanner.nextLine().trim();

    }

    public void drinkScreen() {
        DrinkSize.displayOption();
        IO.println("choose drink size: ");
        String input = scanner.nextLine().trim();
        IO.println();
        DrinkFlavor.displayOption();
        IO.print("choose drink flavor: ");
        input = scanner.nextLine().trim();

    }






    }




package com.pluralsight.ui;

import com.pluralsight.enums.*;
import com.pluralsight.models.*;
import com.pluralsight.service.Helper;
import com.pluralsight.service.ReceiptFileManager;
import com.pluralsight.toppings.*;


import java.util.List;
import java.util.Scanner;


import static com.pluralsight.service.Helper.*;
import static java.util.Arrays.stream;

public class UserInterface {
    Order order = new Order();


    public void StartMenu() {
        int choice;
        header();
        do {
            homeScreen();
            choice = readInt("choose an option: ");
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
        System.out.println(">===================<");
        System.out.println("    DELI-CIOUS " + "\n" +
                "    Sandwich Shop ");
        IO.println(">===================<");
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
            IO.println("4)Checkout");
            IO.println("0)Cancel Order");
             choice = readInt("choose an option: ");
            switch (choice) {
                case 1 -> sandwichScreen();
                case 2 -> drinkScreen();
                case 3 -> chipsScreen();
                case 4 ->checkoutScreen();
                case 0 ->homeScreen();

                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (choice != 0 && choice != 4);

    }

    public void sandwichScreen() {
        Sandwich sandwich = new Sandwich();

        // LOOP enum object
        //customize sandwich
        System.out.println("==Bread Options==");
        Helper.displayHelper(BreadType.class);
        System.out.println("-------------------");
        int breadInput=Helper.readInt("Select your bread:  ");

        BreadType bread = Helper.getEnum(BreadType.class,breadInput );;
        sandwich.setBread(bread);

        IO.println("==Sandwich Size(4\",8\",12\") ");
        Helper.displayHelper(SandwichSize.class);
        System.out.println("-------------------");
        System.out.println("choose sandwich size: ");
        int input = scanner.nextInt();
        SandwichSize size= Helper.getEnum(SandwichSize.class,input );
        sandwich.setSize(size);

        // selectedBread is an object
        //meat
        IO.println("==Meat== ");
        Helper.displayHelper(Meat.class);
        System.out.println("-------------------");
        List<Integer> meatInputs = Helper.readIntegerList ("choose meat: ");
        for (int mInput :meatInputs) {
            Meat meat = Helper.getEnum(Meat.class, mInput);
            sandwich.addMeat(meat);
        }
        //cheese
        IO.println("==Cheese== ");
        Helper.displayHelper(Cheese.class);
        System.out.println("-------------------");
        List<Integer> cheeseInputs = Helper.readIntegerList ("choose Cheese: ");
        for(int cInput :cheeseInputs) {
            Cheese cheese = Helper.getEnum(Cheese.class, cInput);
            sandwich.addCheese(cheese);
        }

        // Prompt regular Topping
        IO.println("==Toppings==");
        Helper.displayHelper(RegularTopping.class);
        System.out.println("-------------------");
        List<Integer> toppingInputs = Helper.readIntegerList ("choose other toppings: ");
        for(int tInput :toppingInputs) {
            RegularTopping topping = Helper.getEnum(RegularTopping.class, tInput);
            sandwich.addRegularTopping(topping);
        }
        //sauce
        IO.println("==Sauce==");
        Helper.displayHelper(Sauce.class);
        System.out.println("-------------------");
        List<Integer> sauceInputs = Helper.readIntegerList ("choose sauce: ");
        for(int sInput :sauceInputs) {
            Sauce sauce = Helper.getEnum(Sauce.class, sInput);
            sandwich.addSauce(sauce);
        }
        IO.println("==Sides==");
        Helper.displayHelper(Sides.class);
        System.out.println("-------------------");
        List<Integer> sidesInputs = Helper.readIntegerList ("choose side: ");
        for(int sInput :sidesInputs) {
            Sides sides = Helper.getEnum(Sides.class, sInput);
            sandwich.addSides(sides);
        }


        String choice=Helper.readString("Would you like the sandwich toasted? Yes/No ");
        order.addItem(sandwich);
        IO.println(" Sandwich added!");
    }

    public void drinkScreen() {
        Drink drink = new Drink();
        IO.println("==Drink Size==");
        Helper.displayHelper(DrinkSize.class);
        System.out.println("-------------------");
        int input= Helper.readInt("choose drink size: ");
        DrinkSize size =Helper.getEnum(DrinkSize.class,input );
        drink.setSize(size);

        IO.println("==Drink Flavor==");
        Helper.displayHelper(DrinkFlavor.class);
        System.out.println("-------------------");
        int dInput =Helper.readInt ("choose drink flavor: ");
        DrinkFlavor flavor= Helper.getEnum(DrinkFlavor.class, dInput);
        drink.setFlavor(flavor);
        order.addItem(drink);
    }
    public void chipsScreen() {
        Chips chip = new Chips("chips");
        Helper.displayHelper(ChipsFlavor.class);
        System.out.println("-------------------");
       int input= Helper.readInt("choose chips flavor: ");
       ChipsFlavor flavor =Helper.getEnum(ChipsFlavor.class ,input);
       chip.setFlavor(flavor);
        order.addItem(chip);

    }

    public void checkoutScreen() {
        System.out.println(order.getReceiptText());
        String answer = readString("Confirm order? yes/no: ");
        if (answer.equalsIgnoreCase("yes")) {
            ReceiptFileManager.saveReceipt(order);
            System.out.println(" Order completed!");
        } else {
            System.out.println("Order canceled.");
        }
    }
}








package com.pluralsight.ui;

import com.pluralsight.enums.*;
import com.pluralsight.models.*;
import com.pluralsight.service.Helper;
import com.pluralsight.service.ReceiptFileManager;
import com.pluralsight.toppings.*;


import static com.pluralsight.service.Helper.*;
import static com.pluralsight.service.ReceiptFileManager.saveReceipt;
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
        System.out.println(">>>>>>>>>>>>>>");
        System.out.println(" DELI-CIOUS " + "\n" +
                "Sandwich Shop ");
        IO.println(">>>>>>>>>>>>>>");
    }

    public void homeScreen() {
        IO.println("1)New Order");
        IO.println("0)Exit");
    }

    public void orderScreen() {
        Order order = new Order();
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
                case 4 -> checkoutScreen();
            }
        } while (choice != 0 && choice != 4);

    }

    public void sandwichScreen() {
        // LOOP enum object
        //customize sandwich
//        SandwichSize size = Helper.getEnumChoice(SandwichSize.class);
        SandwichSize size = null;
        int choice = readInt("choose an option: ");

        if (choice >= 1 && choice <= SandwichSize.values().length) { size= SandwichSize.values()[choice - 1]; }

        Sandwich sand = new Sandwich();
        sand.addSize(size);
        BreadType bread = getEnumChoice(BreadType.class);
        sand.addBread(bread);
        Meat meat = getEnumChoice(Meat.class);
        sand.addMeat(meat);
        Cheese cheese = getEnumChoice(Cheese.class);
        sand.addCheese(cheese);
        RegularTopping regularTopping = getEnumChoice(RegularTopping.class);
        sand.addRegularTopping(regularTopping);
        Sauce sauce = getEnumChoice(Sauce.class);
        sand.addSauce(sauce);
        order .addItem(sand);
    }

    public void drinkScreen() {
        DrinkSize.displayOption();
        IO.println("choose drink size: ");
        String input = scanner.nextLine().trim();
        IO.println();

        DrinkFlavor.displayOption();
        IO.print("choose drink flavor: ");
        input = scanner.nextLine().trim();
        Drink drink = new Drink();
        order.addItem(drink);

    }

    public void chipsScreen() {
        ChipsFlavor.displayOption();
        IO.println("choose chips flavor: ");
        String input = scanner.nextLine().trim();
        Chips chip = new Chips("name");
        order.addItem(chip);

    }

    public void checkoutScreen() {
        System.out.println(order.getReceiptText());
        String answer = readString("Confirm order? yes/no: ");
        if (answer.equalsIgnoreCase("yes")) {
            saveReceipt(order);
            System.out.println("Order completed!");
        } else {
            System.out.println("Order canceled.");
        }
    }
}





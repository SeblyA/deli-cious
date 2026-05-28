package com.pluralsight.models;

import com.pluralsight.enums.DrinkFlavor;
import com.pluralsight.enums.DrinkSize;
import com.pluralsight.interfaces.Priceable;

//child class
public class Drink extends MenuItem {
    private DrinkFlavor flavor;
    private DrinkSize size;
public Drink() {
    super("");

    this.flavor = flavor;
    this.size = size;
}

    @Override
    public double getPrice() {
        return size.getDrinkPrice();
    }

    @Override
    public String getReceiptLine() {
        return "";
    }


    public String getName(){
        return this.size + " " + flavor ;
        }

    @Override
    public double calculatePrice() {
        return size.getDrinkPrice();
    }


    public void setFlavor(int selection){
        switch (selection) {
            case 1 -> this.flavor = DrinkFlavor.COKE;
            case 2-> this.flavor=DrinkFlavor.LEMONADE;
            case 3->this.flavor=DrinkFlavor.SWEET_TEA;
            case 4->this.flavor=DrinkFlavor.ROOT_BEER;
            default -> IO.println("Invalid Flavor Selection");
        }
        }
        public void setSize(int selection) {
            switch (selection) {
                case 1 -> this.size = DrinkSize.SMALL;
                case 2 -> this.size = DrinkSize.MEDIUM;
                case 3 -> this.size = DrinkSize.LARGE;
                default -> IO.println("Invalid Size Selection");
            }
        }
    @Override
    public String toString() {
        return "Drink " +
                "flavor=" + flavor +
                ", size=" + size ;
    }



}








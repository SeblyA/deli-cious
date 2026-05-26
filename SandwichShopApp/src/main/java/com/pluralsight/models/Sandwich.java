package com.pluralsight.models;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.interfaces.Priceable;
import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;


import java.util.ArrayList;
import java.util.List;

public class Sandwich extends MenuItem {
   private SandwichSize size;
    private BreadType bread;

    private List<Meat> meats=new ArrayList<>();
    private List<Cheese>cheeses=new ArrayList<>();
    private List<RegularTopping>regularToppings = new ArrayList<>();
    private List<Sauce>sauces=new ArrayList<>();

private boolean extraMeat;
private boolean extraCheese;

    public Sandwich(SandwichSize size, BreadType bread) {
        this.size = size;
        this.bread = bread;
    }
    public void addMeat(Meat meat) {
        meats.add(meat);
    }
    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }
    public void addRegularTopping(RegularTopping regularTopping) {
        regularToppings.add(regularTopping);
    }
    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    @Override
    public double getPrice() {
        double total=size.getBasePrice();
        total +=meats.size()*size.getMeatPrice();
        total +=cheeses.size()*size.getCheesePrice();
     if(extraMeat){
         total +=size.getExtraMeatPrice();
     }
     if(extraCheese){
         total +=size.getExtraCheesePrice();
     }
        return total;
    }


    public String  getName() {return size + " " +
            bread + " Sandwich " +
            regularToppings +
            " $" + getPrice();

    }


}

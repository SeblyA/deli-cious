package com.pluralsight.models;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.toppings.*;
import java.util.ArrayList;
import java.util.List;

public class Sandwich extends MenuItem  {
    private SandwichSize size;
    private BreadType bread;

public Sandwich() {
    super ("Sandwich");

}

    private List<Meat> meats=new ArrayList<>();
    private List<Cheese>cheeses=new ArrayList<>();
    private List<RegularTopping>regularToppings = new ArrayList<>();
    private List<Sauce>sauces=new ArrayList<>();
    private List <Sides> sides=new ArrayList<>();

private boolean extraMeat;
private boolean extraCheese;



    public void setSize(SandwichSize size){this.size=size;}
    public void setBread(BreadType bread){
        this.bread=bread;
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
    public void addSides(Sides sides) {
        this.sides.add(sides);
    }

    @Override
    public double getPrice() {
        if (size ==null){
            return 0;
        }
        //calculates price for each size and extra meat
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

    @Override
    public String getReceiptLine() {
        return "\nSize:" +  size +
                "\nBreadType:"+bread
                + "\nMeat: " + meats
                + "\nCheese: " + cheeses
                + "\nToppings: " + regularToppings
                + "\nSauces: " + sauces
                + "\nPrice: $" + String.format("%.2f", getPrice());
    }

}

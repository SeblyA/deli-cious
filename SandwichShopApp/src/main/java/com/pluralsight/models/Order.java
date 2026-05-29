package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Order {
//Stores all menu items to order
    private List<MenuItem> items;

//Constructor     new object Order is created
    public Order() {
        this.items = new ArrayList<>();
    }
//Add menu Item to the order
    public void addItem(MenuItem item) {
        items.add(item);
    }
//calculate Total Price

    //This convert Items to stream and price for each
    public double getPrice() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public String getReceiptText() {
//Builder builds Long String and loop each item to Order
        StringBuilder details = new StringBuilder("\n====Receipt===\n");
        for (MenuItem item : items) {
            details.append(item.getReceiptLine()).append("\n");
        }
        details.append("---------------------\n");
        details.append("Total Price: $")
                .append(String.format("%.2f", getPrice()))
                .append("\n===================\n");
        return details.toString();
    }

}





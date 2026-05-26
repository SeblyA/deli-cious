package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::calculatePrice).sum();
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Order Details:\n");
        for (MenuItem item : items) {
            details.append(item).append("\n");
        }
        details.append("Total Price: $").append(calculateTotal());
        return details.toString();
    }

  //  public void removeItem(int i) {
      //  IO.println(this.menuItems. (i - 1).getName() + "Removed");
   //     this.menuItems.remove(i - 1);
    }





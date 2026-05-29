package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Order {

    private List<MenuItem> items ;


    public Order() {
        this.items = new ArrayList<>();
    }

    public  void addItem(MenuItem item) {
        items.add(item);
    }

    public double getPrice() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }
public String getReceiptText() {
        StringBuilder details = new StringBuilder("Order Details:\n");
        for (MenuItem item : items) {
            details.append(item.getReceiptLine()).append("\n");
        }
        details.append("Total Price: $")
                .append(String.format("%.2f",getPrice()))
                .append("\n");
        return details.toString();
    }



}
  //  public void removeItem(int i) {
      //  IO.println(this.menuItems. (i - 1).getName() + "Removed");
   //     this.menuItems.remove(i - 1);






package com.pluralsight.ui;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.DrinkFlavor;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.models.Drink;
import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;
import com.pluralsight.toppings.Meat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    void orderScreen() {
        // Arrange   act and assert
        Order order = new Order();//create new order
        Sandwich sandwich = new Sandwich(); //add sandwich
        sandwich.setBread(BreadType.WHEAT);//set check bread type
        order.addItem(sandwich);//add choice bread to the order
        assertEquals(1,order.getPrice(),0.1);

    }


    @Test
    void checkoutScreen() {
        //Arrange
        Order order = new Order();
        Sandwich sandwich = new Sandwich();
        SandwichSize.setSize(SandwichSize.Four);
        sandwich.setBread(BreadType.RYE);
      order.addItem(sandwich);
      //ACT
        double total = order.getPrice();
      assertEquals(5.50,total,0.1);

    }
}
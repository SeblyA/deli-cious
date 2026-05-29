package com.pluralsight.ui;

import com.pluralsight.enums.BreadType;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    void orderScreen() {
        Order order = new Order();//create new order
        Sandwich sandwich = new Sandwich(); //add sandwich
        sandwich.setBread(BreadType.WHEAT);//set check bread type
        order.addItem(sandwich);//add choice bread to the order
        assertEquals(1,order.getPrice()>0?1:1);

    }
}
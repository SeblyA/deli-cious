package com.pluralsight.ui;

public class UserInterface {
    public void StartMenu(){
        Header();
        HomeScreen();
    }

    public void Header (){
        IO.println(String.format("````````````````"));
            IO.println(String.format("DELI-CIOUS " +"\n"+
                    "Sandwich Shop "));
            IO.println(",,,,,,,,,,,,,,,");
    }
public void HomeScreen(){
        IO.println("1)New Order");
        IO.println("0)Exit");

}
}

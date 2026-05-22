package com.pluralsight.enums;

public enum SandwichSize {
    FOUR_INCH(4,5.50,1.00,.50,.70,.30),
    EIGHT_INCH(8,7.00,2.00,1.00,1.50,.60),
    TWELVE_INCH(12,8.50,3.00,1.50,2.25,.90);
private final int inches;
private final double price;
private final double meat;
private final double extraMeat;
private final double cheese;
private final double extraCheese;

    SandwichSize(int inches,double price,double meat,double extraMeat,double cheese,double extraCheese) {
        this.inches = inches;
        this.price=price;
        this.meat=meat;
        this.extraMeat=extraMeat;
        this.cheese=cheese;
        this.extraCheese=extraCheese;
    }
    public int getInches() {
        return inches;
    }

    public double getPrice() {
        return price;
    }

    public double getMeat() {
        return meat;
    }

    public double getCheese() {
        return cheese;
    }

    public double getExtraMeat() {
        return extraMeat;
    }

    public double getExtraCheese() {
        return extraCheese;
    }
}



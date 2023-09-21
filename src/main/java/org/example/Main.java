package org.example;

import org.example.enums.Flavour;

public class Main {
    public static void main(String[] args) {
        CakeShop cakeShop = new CakeShop();

        cakeShop.sellCakes("chimneycake", Flavour.VANILLA);
        cakeShop.sellCakes("chimneycake", Flavour.CHOCOLATE);
        cakeShop.sellCakes("chimneycake", Flavour.STRAWBERRY);

        cakeShop.sellCakes("pancake", Flavour.STRAWBERRY);
        cakeShop.sellCakes("pancake", Flavour.VANILLA);
        cakeShop.sellCakes("pancake", Flavour.CHOCOLATE);

        System.out.println("Total income: " + cakeShop.totalIncome() + "$");
    }
}
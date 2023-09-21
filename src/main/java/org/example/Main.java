package org.example;

import org.example.enums.Flavour;
import org.example.model.cake.ChimneyCake;
import org.example.model.cake.Pancake;
import org.example.model.oven.ChimneyCakeOven;
import org.example.model.oven.PancakeOven;

public class Main {
    public static void main(String[] args) {
        CakeShop cakeShop = new CakeShop();

        Pancake pancake1 = new Pancake(Flavour.VANILLA);
        Pancake pancake2 = new Pancake(Flavour.CHOCOLATE);
        Pancake pancake3 = new Pancake(Flavour.STRAWBERRY);

        ChimneyCake chimneyCake1 = new ChimneyCake(Flavour.VANILLA);
        ChimneyCake chimneyCake2 = new ChimneyCake(Flavour.CHOCOLATE);
        ChimneyCake chimneyCake3 = new ChimneyCake(Flavour.STRAWBERRY);

        PancakeOven pancakeOven = new PancakeOven();
        ChimneyCakeOven chimneyCakeOven = new ChimneyCakeOven();

        pancakeOven.bake(pancake1);
        pancakeOven.refillOil();
        pancakeOven.bake(pancake1);
        System.out.println("------------");
        pancakeOven.bake(chimneyCake2);
        System.out.println("------------");

        chimneyCakeOven.bake(chimneyCake1);
        System.out.println("------------");
        chimneyCakeOven.bake(pancake2);
        System.out.println("------------");

        cakeShop.addOven(pancakeOven);
        cakeShop.addOven(chimneyCakeOven);

        cakeShop.sellCakes(pancake1);
        cakeShop.sellCakes(chimneyCake1);
        cakeShop.sellCakes(chimneyCake1);

        System.out.println("Total income: " + cakeShop.totalIncome() + "$");
    }
}
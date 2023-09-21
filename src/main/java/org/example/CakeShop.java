package org.example;

import org.example.model.cake.Cake;
import org.example.model.oven.Oven;

import java.util.ArrayList;
import java.util.List;

public class CakeShop {
    private List<Oven> ovens;
    private List<Cake> soldCakes;
    private double income;

    public CakeShop() {
        this.ovens = new ArrayList<>();
        this.soldCakes = new ArrayList<>();
        this.income = 0;
    }

    public void addOven(Oven oven) {
        ovens.add(oven);
    }

    public void sellCakes(Cake cake) {
        if (cake.isBaked()) {
            if (!soldCakes.contains(cake)) {
                soldCakes.add(cake);
                System.out.println("Sold a cake for " + cake.calculatePrice() + "$");
            }
        } else System.out.println("The cake must be baked.");
    }

    public double totalIncome() {
        return (soldCakes.stream()
                .mapToDouble(Cake::calculatePrice)
                .sum());
    }
}
package org.example;

import org.example.enums.Flavour;
import org.example.model.cake.Cake;
import org.example.model.oven.ChimneyCakeOven;
import org.example.model.oven.Oven;
import org.example.model.oven.PancakeOven;

import java.util.List;

public class CakeShop {
    private List<Oven> ovens;
    private double income;

    public CakeShop() {
        this.ovens = List.of(new PancakeOven(), new ChimneyCakeOven());
        this.income = 0.0;
    }

    public List<Oven> getOvens() {
        return ovens;
    }

    public void sellCakes(String cakeType, Flavour flavour) {
        Oven oven = ovens.stream()
                .filter(o -> o.getCakeType().equals(cakeType.toLowerCase()))
                .findFirst()
                .orElse(null);

        if (oven instanceof PancakeOven)
            ((PancakeOven) oven).refillOil();

        Cake cake = oven.bake(flavour);
        income += cake.calculatePrice();
        System.out.println("Sold a " + cake);
    }

    public double totalIncome() {
        return income;
    }
}
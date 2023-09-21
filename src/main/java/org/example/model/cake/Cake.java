package org.example.model.cake;

import org.example.enums.Flavour;

public abstract class Cake {
    private Flavour flavour;
    private final double basePrice;

    public Cake(Flavour flavour, double basePrice) {
        this.flavour = flavour;
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        return this.getBasePrice() + this.flavour.getCost();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Flavour getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "flavour=" + flavour +
                ", basePrice=" + basePrice +
                '}';
    }
}
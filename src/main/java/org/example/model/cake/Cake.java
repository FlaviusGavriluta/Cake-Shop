package org.example.model.cake;

import org.example.enums.Flavour;

public abstract class Cake {
    private Flavour flavour;
    private final double basePrice;
    private boolean isBaked;

    public Cake(Flavour flavour, double basePrice) {
        this.flavour = flavour;
        this.basePrice = basePrice;
        this.isBaked = false;
    }

    public double calculatePrice() {
        return this.getBasePrice() + this.getFlavour().getCost();
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

    public boolean isBaked() {
        return isBaked;
    }

    public void setBaked(boolean baked) {
        isBaked = baked;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "flavour=" + flavour +
                ", basePrice=" + basePrice +
                '}';
    }
}
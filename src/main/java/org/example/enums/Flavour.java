package org.example.enums;

public enum Flavour {
    VANILLA(0.3),
    CHOCOLATE(0.4),
    STRAWBERRY(0.55);
    private final double cost;

    Flavour(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Flavour{" +
                "price=" + cost +
                '}';
    }
}
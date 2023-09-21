package org.example.model.oven;

import org.example.enums.Flavour;
import org.example.model.cake.Cake;
import org.example.model.cake.Pancake;

public class PancakeOven extends Oven {
    private boolean hasOil;

    public PancakeOven() {
        super("pancake");
        this.hasOil = false;
    }

    public void refillOil() {
        hasOil = true;
    }

    @Override
    public boolean canBake() {
        return hasOil;
    }

    @Override
    public Cake bake(Flavour flavour) {
        if (!canBake()) {
            return null;
        }
        hasOil = false;
        return new Pancake(flavour);
    }
}
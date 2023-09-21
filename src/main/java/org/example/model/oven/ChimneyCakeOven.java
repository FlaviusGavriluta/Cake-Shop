package org.example.model.oven;

import org.example.enums.Flavour;
import org.example.model.cake.Cake;
import org.example.model.cake.ChimneyCake;

public class ChimneyCakeOven extends Oven {
    public ChimneyCakeOven() {
        super("chimneycake");
    }
    @Override
    public boolean canBake() {
        return true;
    }
    @Override
    public Cake bake(Flavour flavour) {
        if (!canBake()) {
            return null;
        }
        return new ChimneyCake(flavour);
    }
}
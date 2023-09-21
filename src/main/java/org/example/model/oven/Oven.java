package org.example.model.oven;

import org.example.enums.Flavour;
import org.example.model.cake.Cake;

public abstract class Oven {
    private final String cakeType;

    public Oven(String cakeType) {
        this.cakeType = cakeType;
    }

    public String getCakeType() {
        return cakeType;
    }

    public boolean canBake() {
        return false;
    }

    public Cake bake(Flavour flavour) {
        return null;
    }
}
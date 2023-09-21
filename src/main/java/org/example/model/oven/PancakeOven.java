package org.example.model.oven;

import org.example.model.cake.Cake;
import org.example.model.cake.ChimneyCake;
import org.example.model.cake.Pancake;

public class PancakeOven implements Oven {
    private boolean hasOil;

    public PancakeOven() {
        this.hasOil = false;
    }

    public void refillOil() {
        hasOil = true;
        System.out.println("Added oil to pancake's Oven");
    }

    @Override
    public boolean canBake(Cake cake) {
        return hasOil && !cake.isBaked();
    }

    @Override
    public Pancake bake(Cake cake) {
        if (!canBake(cake) || !(cake instanceof Pancake)) {
            System.out.println("This oven can bake only pancakes if the oven has oil available!");
            return null;
        }

        hasOil = false;
        cake.setBaked(true);
        System.out.println("A pancake was baked.");
        return (Pancake) cake;
    }
}
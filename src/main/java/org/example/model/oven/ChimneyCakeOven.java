package org.example.model.oven;

import org.example.model.cake.Cake;
import org.example.model.cake.ChimneyCake;

public class ChimneyCakeOven implements Oven {

    @Override
    public boolean canBake(Cake cake) {
        return !cake.isBaked();
    }

    @Override
    public ChimneyCake bake(Cake cake) {
        if (!canBake(cake) || !(cake instanceof ChimneyCake)) {
            System.out.println("This oven can bake only chemney cakes!");
            return null;
        }
        cake.setBaked(true);
        System.out.println("A chimneyCake was baked.");
        return (ChimneyCake) cake;
    }
}
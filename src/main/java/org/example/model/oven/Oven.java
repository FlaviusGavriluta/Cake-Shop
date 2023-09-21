package org.example.model.oven;

import org.example.model.cake.Cake;

public interface Oven {
   boolean canBake(Cake cake);

    Cake bake(Cake cake);
}
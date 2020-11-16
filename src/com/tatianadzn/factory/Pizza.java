package com.tatianadzn.factory;

public abstract class Pizza {
    public void prepareDough(){
        // preparing basic dough
    }

    // individual process
    public abstract void prepareToppings();

    public void bakePizza(){
        // basic baking process
    }
}

package com.tatianadzn.factory;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;
        switch (type) {
            case MARGARITA :
                pizza = new Margarita();
                break;
            case NAPOLETANA:
                pizza = new Napoletana();
        }
        return pizza;
    }
}

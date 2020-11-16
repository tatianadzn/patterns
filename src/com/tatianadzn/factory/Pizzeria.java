package com.tatianadzn.factory;

public class Pizzeria {
    private final PizzaFactory pizzaFactory;

    public Pizzeria(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(PizzaType type){
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepareDough();
        pizza.prepareToppings();
        pizza.bakePizza();
    }
}

package FactoryMethodPattern.pizza.factory;

import FactoryMethodPattern.pizza.DeluxePizza;
import FactoryMethodPattern.pizza.Pizza;

public class DeluxePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new DeluxePizza();
    }
}

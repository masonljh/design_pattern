package FactoryMethodPattern.pizza.factory;

import FactoryMethodPattern.pizza.Pizza;
import FactoryMethodPattern.pizza.SeafoodPizza;

public class SeafoodPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new SeafoodPizza();
    }
}

package FactoryMethodPattern.pizza.factory;

import FactoryMethodPattern.pizza.HamMushroomPizza;
import FactoryMethodPattern.pizza.Pizza;

public class HamMushroomPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new HamMushroomPizza();
    }
}

package FactoryMethodPattern;

import FactoryMethodPattern.pizza.Pizza;
import FactoryMethodPattern.pizza.factory.DeluxePizzaFactory;
import FactoryMethodPattern.pizza.factory.HamMushroomPizzaFactory;
import FactoryMethodPattern.pizza.factory.PizzaFactory;
import FactoryMethodPattern.pizza.factory.SeafoodPizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new DeluxePizzaFactory();
        Pizza deluxePizza = factory.createPizza();
        System.out.println(deluxePizza.getType().name());

        factory = new SeafoodPizzaFactory();
        Pizza seafoodPizza = factory.createPizza();
        System.out.println(seafoodPizza.getType().name());

        factory = new HamMushroomPizzaFactory();
        Pizza hamMushroomPizza = factory.createPizza();
        System.out.println(hamMushroomPizza.getType().name());
    }
}

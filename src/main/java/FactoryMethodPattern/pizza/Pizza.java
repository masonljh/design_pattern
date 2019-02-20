package FactoryMethodPattern.pizza;

public abstract class Pizza {
    PizzaType type;
    boolean hasCheeseTopping;

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    public boolean hasCheeseTopping() {
        return hasCheeseTopping;
    }

    public void setHasCheeseTopping(boolean hasCheeseTopping) {
        this.hasCheeseTopping = hasCheeseTopping;
    }
}

package StrategyPattern;

import StrategyPattern.food.Food;
import StrategyPattern.weapon.Weapon;

public class Player {

    private Food food;
    private Weapon weapon;

    public void setFood(Food food) {
        this.food = food;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void eat() {
        if (food == null) {
            return;
        }

        food.eat();
    }

    public void attack() {
        if (weapon == null) {
            return;
        }

        weapon.attack();
    }
}

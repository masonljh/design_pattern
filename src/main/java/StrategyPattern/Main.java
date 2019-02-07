package StrategyPattern;

import StrategyPattern.food.Apple;
import StrategyPattern.food.ArrowRoot;
import StrategyPattern.food.Meat;
import StrategyPattern.weapon.Bomb;
import StrategyPattern.weapon.IcedTuna;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.setFood(new Apple());
        player.eat();

        player.setFood(new Meat());
        player.eat();

        player.setFood(new ArrowRoot());
        player.eat();

        player.setWeapon(new IcedTuna());
        player.attack();

        player.setWeapon(new Bomb());
        player.attack();
    }

}

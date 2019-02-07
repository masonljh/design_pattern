package StrategyPattern.weapon;

public class Bomb implements Weapon {
    @Override
    public void attack() {
        System.out.println("폭탄으로 공격!!!");
    }
}

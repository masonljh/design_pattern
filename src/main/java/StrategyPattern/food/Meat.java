package StrategyPattern.food;

public class Meat implements Food {
    @Override
    public void eat() {
        System.out.println("육즙이 흐르는 고기를 먹었습니다.");
    }
}

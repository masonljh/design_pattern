package StrategyPattern.food;

public class Apple implements Food {
    @Override
    public void eat() {
        System.out.println("상큼한 맛이 도는 사과를 먹었습니다.");
    }
}

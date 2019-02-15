package TemplateMethodPattern;

public class Tico extends Car {

    public Tico() {
        velocity = 0;
        gear = 0;
        accelation = 20;
    }

    @Override
    void accelate() {
        velocity += accelation;
        gear++;
        System.out.println("기어 " + gear + "단!!! 가즈아");
    }

    @Override
    void slowDown() {
        velocity -= accelation;
        gear--;
        System.out.println("기어 " + gear + "단!!! 멈추즈아");
    }

    @Override
    void prepareForStarting() {
        System.out.println("백미러 조정하기");
        System.out.println("기어 중립으로 놓기");
    }

    @Override
    void prepareForParking() {
        System.out.println("기어 중립으로 놓기");
        System.out.println("백미러 안 접기");
    }
}

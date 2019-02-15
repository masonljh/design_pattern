package TemplateMethodPattern;

public class Spark extends Car {

    public Spark() {
        velocity = 0;
        gear = 0;
        accelation = 30;
    }

    @Override
    void accelate() {
        velocity += accelation;
        gear++;
        System.out.println("자동으로 서서히 가속하기");
    }

    @Override
    void slowDown() {
        velocity -= accelation;
        gear--;
        System.out.println("자동으로 서서히 감속하기");
    }

    @Override
    void prepareForStarting() {
        System.out.println("백미러 펴기");
        System.out.println("기어 D로 놓기");
    }

    @Override
    void prepareForParking() {
        System.out.println("기어 P로 놓기");
        System.out.println("백미러 접기");
    }
}

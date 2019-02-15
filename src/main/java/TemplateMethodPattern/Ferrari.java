package TemplateMethodPattern;

public class Ferrari extends Car {

    private boolean isRoofOpened;

    public Ferrari() {
        velocity = 0;
        gear = 0;
        accelation = 50;
        isRoofOpened = false;
    }

    @Override
    void accelate() {
        velocity += accelation;
        gear++;
        System.out.println("야생마 같이 가속하기");
    }

    @Override
    void slowDown() {
        velocity -= accelation;
        gear--;
        System.out.println("부드럽게 감속하기");
    }

    public boolean isRoofOpened() {
        return isRoofOpened;
    }

    public void toggleRoof() {
        isRoofOpened = !isRoofOpened;
        System.out.println(isRoofOpened ? "지붕 열기" : "지붕 닫기");
    }

    @Override
    void prepareForStarting() {
        System.out.println("백미러 펴기");
        System.out.println("기어 D로 놓기");
    }

    @Override
    void prepareForParking() {
        if (isRoofOpened) {
            toggleRoof();
        }

        System.out.println("기어 P로 놓기");
        System.out.println("백미러 접기");
    }
}

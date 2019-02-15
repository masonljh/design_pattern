package TemplateMethodPattern;

public abstract class Car {

    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 5;

    boolean isParking;
    int velocity;
    int accelation;
    int gear;

    public void start() {
        System.out.println("시동 켜기~ 부릉부릉~");
        System.out.println("사이드 브레이크 해제");
        isParking = false;
        gear = 0;
        velocity = 0;
        prepareForStarting();
    }

    abstract void accelate();
    abstract void slowDown();

    public boolean canAccelate() {
        return gear < MAX_GEAR;
    }

    public boolean canSlowDown() {
        return gear > 0;
    }

    public boolean isParking() {
        return isParking;
    }

    public void park() {
        prepareForParking();
        System.out.println("사이드 브레이크 작동");
        System.out.println("시동 끄기");
        isParking = true;
    }

    void prepareForStarting() {
        System.out.println("시트 조정하기");
        System.out.println("백미러 조정하기");
    }

    void prepareForParking() {
        System.out.println("백미러 접기");
    }
}

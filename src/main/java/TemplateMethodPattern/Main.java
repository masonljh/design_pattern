package TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Ferrari Time =========");
        Car ferrari = new Ferrari();
        ferrari.start();
        ((Ferrari) ferrari).toggleRoof();
        drive(ferrari);

        System.out.println();
        System.out.println("========= Spark Time =========");

        Car spark = new Spark();
        spark.start();
        drive(spark);

        System.out.println();
        System.out.println("========= Tico Time =========");

        Car tico = new Tico();
        tico.start();
        drive(tico);
    }

    private static void drive(Car ferrari) {
        boolean isAccelated;
        isAccelated = true;
        while (!ferrari.isParking()) {
            if (ferrari.canAccelate() && isAccelated) {
                ferrari.accelate();
            } else if (ferrari.canSlowDown() && !isAccelated) {
                ferrari.slowDown();
            }

            if (!ferrari.canAccelate()) {
                isAccelated = false;
            }

            if (!ferrari.canSlowDown()) {
                ferrari.park();
            }
        }
    }
}

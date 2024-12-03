package chap1_9.static_practice.q1;

public class Car {

    private String model;
    private int year;
    private static int count = 0;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        count++;
    }

    public void getCarInfo () {
        System.out.println("모델명: " + model + ", 제조년도: " + year);
    }

    public static void getTotalCars() {
        System.out.println("현재까지 생상된 자동차의 총 개수: " + count);
    }
}

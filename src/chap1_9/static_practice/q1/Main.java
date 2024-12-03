package chap1_9.static_practice.q1;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("아반떼", 2020);
        Car car2 = new Car("소나타", 2021);
        Car car3 = new Car("그랜저", 2022);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();

        Car.getTotalCars();
    }
}

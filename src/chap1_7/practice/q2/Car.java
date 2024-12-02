package chap1_7.practice.q2;

public class Car {

    // 속성
    public String make;
    public String model;
    public int year;

    // 메서드 생성

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start () {
        System.out.println(model+" 이(가) 시동을 겁니다." + make);
    }
}

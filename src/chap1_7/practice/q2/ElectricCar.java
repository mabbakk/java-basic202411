package chap1_7.practice.q2;

public class ElectricCar extends Car{

    // 추가 속성
    public double batteryCapacity;
    
    // 부모 메소드 호출 생성자
    public ElectricCar(String make, String model, int year, double batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void start() {
        System.out.println("전기차가 조용히 시동을 겁니다.");
    }

    public void displayRange() {

    }
}

package chap1_8.poly.drive;

public class CarShop {

    // 돈을 주면 자동차를 출고하는 기능
    public Car exportCar(int money) {   // 공통으로 Car 타입을 선정!
        if (money == 6000) {
            return new Tesla();
        } else if (money == 4000) {
            return new Tucson();
        } else if (money == 3000) {
            return new Sonata();
        } else {
            return null;
        }
    }
}

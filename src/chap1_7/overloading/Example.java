package chap1_7.overloading;

public class Example {

    // 오버로딩 : 같은 클래스 안에서 이름이 같은 메소드를 여러 개 선언하는 것.
    // 룰:
    // 1. 메소드 이름만 같고 파라미터의 타입이 달라야 한다.
    // 2. 리턴 타입은 영향을 미치지 않는다.


    // 정수 2개를 더하는 메서드
    // add(int, int)
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // add(double, double)
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    // add(String, String)
    public String add(String n1, String n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {

        Example ex = new Example();
        ex.add(10.5, 20);
    }
}

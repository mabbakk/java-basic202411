package chap1_8.practice.q1;

public class Circle extends Shape {

    private double radius;  // 반지름

    public Circle(double radius) {  // alt + insert + radius 선택!!
        this.radius = radius;
    }


    // 원의 넓이를 구하는 메서드
    @Override
    public double area() {
        return Math.PI * radius * radius;
        // public static final double PI = 3.14159265358979323846; 라고 되어있다!
        // 즉 PI는 원주율 3.14_____를 정의해둔 것!
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

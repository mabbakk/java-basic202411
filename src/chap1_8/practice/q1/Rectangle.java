package chap1_8.practice.q1;

// 자동완성 시 아래에 뜨는 확장자 중.awt는 라이브러리 파일이므로 잘못 선택하면 import되기 때문에 에러가 발생한다!!

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {   // Shape에서 정의된 area 메서드를 그대로 가져오되, 각 도형별 공식에 맞게 바꿈!! -->오버라이딩
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

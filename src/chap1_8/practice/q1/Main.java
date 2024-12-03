package chap1_8.practice.q1;

public class Main{

    public static void main(String[] args) {

        ShapeManager shapeManager = new ShapeManager();

        Circle circle = new Circle(5);
        Rectangle recrangle = new Rectangle(4,5);

        shapeManager.printShapeInfo(circle);
        shapeManager.printShapeInfo(recrangle);
    }
}

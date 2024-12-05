package chap2_2.lang;

public class Wrapper {

    public static void main(String[] args) {

        // 자바는 객체지향 언어다.

        int a = 10;
        String s = new String(new char[]{'a', 'b', 'c'});

        //박싱: 빈번하게 쓰이는 객체들을 쉽게 쓸 수 있게 문법적으로 처리

        Integer b = new Integer(10);
        System.out.println("b = " + b);
    }
}

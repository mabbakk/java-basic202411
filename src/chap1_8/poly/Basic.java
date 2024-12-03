package chap1_8.poly;

//  class 밖에 class를 만드는 것이 가능. 많이 쓰지는 않음. public은 붙이면 안 됨.
class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

/*
 형제는 상속관계가 아니다!
 */

public class Basic {
    public static void main(String[] args) {

        // 다형성 : 객체가 다양한 형태를 가지고 있는 성질
        //               다양한 타입을 사용할 수 있다
        //               (부모의 타입)
        // 전제: 상속관계에서만 가능함.

     // Type     // 생성자(constructor)
//        A x1 = new A();   // 메서드(함수)안에 있으므로 지역변수임 (public 붙일 수 없음), 메서드 밖에 있으면 필드.+public 붙일 수 있음
//        B x2 = new B();
//        C x3 = new C();
//        D x4 = new D();
//        E x5 = new E();

        //위에 코드를 아래와 같이 바꿀 수 있음( 부모의 타입 사용 )
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();
        B x4 = new D();
//        C x5 = new E();
        Object x5 = new E();
    }
}

package chap1_6.modi.pac1;

public class B {

    // 생성자
    B() {
        A a = new A();  // public 호출
        new A(50);   // default 호출
//        new A(9.9);  //private 호출

        a.f1 = 10;  // public 호출
        a.f2 = 11;  // default 호출
//        a.f3 = 20;  //private 호출

        a.m1();
        a.m2();
//        a.m3();  // private 호출
    }
}

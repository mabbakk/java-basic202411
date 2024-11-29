package chap1_6.modi.pac1;

// 필드 확장 생성자에만 public을 붙일 수 있음!


// class에는 접근 제한을 public과 default만 적용할 수 있음.
public class A {

    // 필드
    public int f1;
    int f2;   // default
    private int f3;

    // 생성자
    public A() {
        this(10.99);
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();
    }
    A(int a) {}   // default
    private A(double b) {}

    // 메소드
    public void m1() {}
    void m2() {}   // default
    private void m3() {}
}

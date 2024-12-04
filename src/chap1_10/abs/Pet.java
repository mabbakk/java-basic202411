package chap1_10.abs;


// 추상 클래스: 상속 하위 클래스의 타입 일치를 위한 껍데기에 불과함!
// 추상적인 객체의 객체 생성을 막는다!

// class가 추상 클래스여야 자식 클래스들에게도 추상을 강요할 수 있다.
// 일반 클래스와 별다를 바가 없지만 overriding을 강제로 실행할 수 있도록 한다.
public abstract class Pet {


    // 추상 메서드: 오버라이딩을 위한 시그니처만 적어두는 메서드
    // 자식 클래스들에게 오버라이딩을 강요한다.
    public abstract void eat();

    // 이 설계도를 사용할 때 반드시 있어야 할 기능들을 강요할 수 있다.
    public abstract void sleep();


    // 평소처럼 이런 메서드들을 생성해도 문제가 없다.
    // 다만, 부모 클래스의 역할을 충실히 수행할 뿐이다! (overriding 하라고 강요!!)
    public static void foo() {}
    public void bar() {}
    public final void far() {}

}

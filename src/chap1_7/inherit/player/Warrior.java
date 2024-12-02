package chap1_7.inherit.player;


// 하위(자식) 클래스 - sub class
// 상위(부모) 클래스로부터 필드와 메서드를 상속받는 클래스
public class Warrior extends Player{
    
    // 직업 개별 속성
    int rage; // 분노게이지  -->> 전사만 가지고 있는 속성!

    // 기본 생성자
//    public Warrior() {
        //  상속에서는 자식 객체를 생성하게 되면
        // 부모의 객체도 함께 만들어야 한다.
        // 자바는 자동으로 상속 메모리 구조를 구현하기 위해
        // 자식 생성자의 맨 첫 줄에 super()를 삽입하여 부모를 강제호출한다.
//        super();  부모의 기본 생성자가 없으므로 에러가 남.
//    }

    // 생성자
    public Warrior(String nickname) {
//        this(nickname); // 본인의 생성자
//        super() //부모의 생성자 호출!
        super(nickname);  // 부모의 생성자를 부름!  , 이때 자신의 생성자 아래에 호출된 부모의 생성자가 들어가면 안 됨! 부모의 메소드 생성자 호출은 첫 줄에!
        this.rage = 100;  // 분노 게이지
    }
    
    // 오버라이딩: 부모가 물려준 메소드가 자식에게 적합하지 않아 자식이 고쳐서 쓰는 행위
    // 오버라이딩의 중요한 룰!! => 부모가 물려준 모양(리턴타입, 이름, 파라미터)은 유지해야한다!!

    @Override  //안전하게 오버라이딩 할 수 있게 룰을 체크해준다!
    public void showStatus() {
        super.showStatus(); // 부모인 Player의 showStatus 호출!
        System.out.println("#분노 = " + rage);
    }

    // 개별 직업 기능
    // 전사 스킬
    public void dash() {
    }
}

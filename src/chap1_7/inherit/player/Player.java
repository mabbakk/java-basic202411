package chap1_7.inherit.player;

// 상속을 위한 공통 속성과 기능을 가진 부모 클래스 (super class, 상위 클래스)
public class Player extends Object{

    String nickname;
    int level;
    int hp;

    // 생성자
    public Player(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp =50;
    }

    // 모든 직업 공통 기능
    // 상태정보를 확인하는 메서드
    public void showStatus () {  // 여기 첫 줄을 '시그니처' 라고 부름!!
        System.out.println("====Player's Info====");
        System.out.println("#닉네임 = " + nickname);
        System.out.println("#레벨 = " + level);
        System.out.println("#체력 = " + hp);
    }
}

package chap1_7.inherit.player;

public class HighMage extends Mage{
    // Mage 에 ()가 비어있는 기본 생성자가 없기 때문에 오류가 난 것.

    public HighMage(String nickname) {
        super(nickname);
    }
}

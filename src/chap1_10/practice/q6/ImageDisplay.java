package chap1_10.practice.q6;

public class ImageDisplay implements MediaPlayable {

    // 같은 기능이지만 동작이 다르다!

    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 일시정지됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지가 중지됩니다.");
    }


}

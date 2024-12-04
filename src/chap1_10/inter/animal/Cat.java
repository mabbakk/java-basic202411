package chap1_10.inter.animal;

public class Cat implements Wild, Pet {

    // 난폭한 행동
    @Override
    public void handle() {

    }

    // 애완동물로 키울 수 있음
    @Override
    public boolean inject() {
        return false;
    }

    // 사냥 불가
    @Override
    public void violent() {


    }
}

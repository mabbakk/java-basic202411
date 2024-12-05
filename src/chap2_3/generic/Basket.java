package chap2_3.generic;


// 뭘 담을지는 모르겠지만 아무튼 바구니다..!
// F를 담을 건데 F는 언제 결정되느냐? --> 바구니가 만들어질 때 결정
public class Basket <F extends Fruit> {

    // F(의미로 그냥 아무거나 적은 겨) : generic 타입 - 아직 설계 당시에는 정확한 타입이 없는 상태 
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }

}

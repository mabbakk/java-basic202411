package chap2_3.generic;

import chap1_7.protected_.pac1.A;
import chap1_7.protected_.pac1.B;

public class Main {

    public static void main(String[] args) {

        // === generic을 사용하지 않았을 때 === //
        // 과일 전용 바구니를 일일히 하나씩 설계해야 한다!! //

        // 사과 바구니 생성
        AppleBasket appleBasket = new AppleBasket();
        appleBasket.setApple(new Apple(10));


        // 바나나 바구니 생성
        BananaBasket bananaBasket = new BananaBasket();
        bananaBasket.setBanana(new Banana(7));
        Banana banana = bananaBasket.getBanana();
        System.out.println("banana = " + banana);


        // === generic을 사용했을 때 === //
        // 바구니 설계도는 딱 한 개만 만들고 바구니 생성 시 전용 과일을 지정 //

        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple(33));
        Apple apple2 = ab.getFruit();

        Basket<Banana> bb = new Basket<>();
        bb.setFruit(new Banana(1));
        Banana banana2 = bb.getFruit();

        Basket<Peach> peachBasket = new Basket<>();
        peachBasket.setFruit(new Peach());

//        Basket<Object> catBasket = new Basket<>();
        // Basket에서 F는 Fruit에서만 상속받는다고 하므로 고양이는 상속받지 못함!

    }
}

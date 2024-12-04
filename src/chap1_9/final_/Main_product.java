package chap1_9.final_;

public class Main_product {

    public static void main(String[] args) {
        Product product = new Product("노트북", 1000000);

        product.getProductInfo(); // 상품명: 노트북, 가격: 1000000원
        product.getDiscountedPrice(); // 할인가: 900000.0원
    }
}

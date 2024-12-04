package chap1_9.final_;

import chap1_7.protected_.pac2.D;

import java.io.DataInput;

public class Product {

    private String productName;
    private double price;
    private static final double DISCOUNT_RATE = 0.1;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void getProductInfo() {
        System.out.printf("상품명: " + productName, "가격: " + price + "원");
    };

    public void getDiscountedPrice() {
        double discountedPrice = price - (price * DISCOUNT_RATE);
        System.out.println("할인가: " + discountedPrice + "원");
    }
}
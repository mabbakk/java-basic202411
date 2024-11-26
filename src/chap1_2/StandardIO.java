package chap1_2;

import java.util.Scanner;

public class StandardIO {

  public static void main(String[] args) {

//    // 자바의 출력
//    System.out.print(123);
//    System.out.print(456);

      // 자바의 입력
    Scanner sc = new Scanner(System.in);

      // 입력 처리
    System.out.print("이름: ");
    String data =  sc.nextLine();
    System.out.println("data = " + data);

    // 정수 입력 처리
    System.out.print("나이: ");
    int age = Integer.parseInt(sc.nextLine());
    System.out.println("age = " + age);
  }
}

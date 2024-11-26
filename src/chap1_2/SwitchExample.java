package chap1_2;

public class SwitchExample {
  public static void main(String[] args) {

    int a = 10;
    double b =  5.5;
    String season = "여름";
    String spring = "봄";

    // switch에 들어가는 변수의 타입은 정수형 또는 문자형
    switch (season) {
      // case에는 변수 지정 불가능, 상수나 리터럴만 가능
//      case spring:
      case "봄" :
        System.out.println("봄에는 산책을 합시다.");
        break;
      case "여름" :
        System.out.println("봄에는 산책을 합시다.");
        break;
      case "가을" :
      case "겨울" :
      default:   // 기타 등등, 이하동문
    }


//    while (true) {
//
//    }  while문에는 꼭 true 적어줄 것
  } // end main
}

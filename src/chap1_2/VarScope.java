package chap1_2;

public class VarScope {
  public static void main(String[] args) {

    // java는 변수가 선언딘 중괄호(블록)에서 태어나고
    // 블록이 끝나는 부분에서 소멸한다.
    int x1 = 10;
    if (true) {
      int x2 = 20;
    }
    int x2 = 50;  //  가능. 왜? 위에 블록{}을 지나고 죽었으니까 가능!
    System.out.println("x1 =" + x1);
    System.out.println("x2 =" + x2);

    for(int i = 0; i < 3; i++) {

    }
  }

}

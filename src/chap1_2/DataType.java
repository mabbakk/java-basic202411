package chap1_2;  //상단에 자기가 속한 파일 이름을 적어줘야 함

public class DataType {  // public 후 파일 명을 한 번 더 적어줘야 함.

  //  메인 메서드(스레드): 프로그램의 실행 기점
  public static void main(String[] args) {

    int age = 20;     // 정수 타입은 int
    double v = 3.14;  // 실수 타입은 double
    char c = '가';    // char 은 단 한글자만 수용!!
    String greeting = "안뇽?";
    boolean flag = true;
    System.out.println(123);

    // 정수 타입 (byte: 1byte, short, int, long)
    // 1yte == 8 bit => 0  1111111
    byte x1 = 127;
    // 16bit => 0 1111111 1111111
    short x2 = 32767;
    int x3 = 21474647;
    //10; //리터럴: 변수에 저장되기 전 데이터
    // 정수 리터럴의 기본 타입 int
    long x4 = 2145646565L;
    System.out.println(x4);

    // 실수 타입
    float f1 = 3.14261516515F;   // 4 byte
    double f2 = 3.141356455;   // 8 byte
    System.out.println();
    System.out.println();

    // 논리 타입
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = 10 < 5;
    boolean b4 = (10 + 3 == 13) && (9 * 1 == 8);

    // 문자와 문자열 타입
    char c1 = 'A';  // 2byte
    char c2 = 67;
    System.out.println("c2=" + c2);

    // hello
    char[] cArr = {'h', 'e', 'l', 'l', 'o'};
    String str = new String(cArr);
    System.out.println("str =" + str);

    String str2 = "안녕하세요";
    System.out.println("str2 =" + str2);

    // 자바 17부터 지원
    String str3 = """
                    안녕" 
                    ㅁㅇㅁㅁㅇ
                    ㅁㄹㅈㅂ
                    ㅁㄴㄹㄷㅂㅈ
                    """;

    // 동적 타이핑 (java 9) ->일단 알아만 두고 쓰지는 마셔
    var z = 100;  // 타입 추론
    var h = "fadsfa";


  }
}
  
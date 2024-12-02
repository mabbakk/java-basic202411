package chap1_6.practice.q1;

public class LibraryMember {

   public String memberId;  // 요즘에는 숫자로 잘 하지 않으므로 문자열 String
   private String name;
   private int borrowedBooks;   // int 값은 초기값을 설정하지 않았을 때 기본값인 0이 적용된다.
   
   
   // 기본 생성자: 파라미터가 없는 생성자
   // 클래스 안에 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어짐
   // alt + insert -> 생성자 클릭 -> 선택 안함 -> 기본 생성자 만들어짐!!
    LibraryMember() {

    }

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = 0; // 처음 생성되었을 때 빌린 책이 없을 것이므로 0으로 초기화 설정
    }

    public void borrowBook() {
        if (borrowedBooks < 5) {
            borrowedBooks++;
            System.out.printf("%s님이 책을 한 권 빌렸습니다. 현재 빌린 책의 수: %d개\n", name, borrowedBooks);
        } else {
            System.out.printf("%s님은 이미 5권의 책을 빌리셨습니다. 더 이상 빌릴 수 없습니다.\n", name);
        }
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.printf("%s님이 책을 한 권 반납했습니다. 현재 빌린 책의 수: %d개\n", name, borrowedBooks);
        } else {
            System.out.printf("%s님은 반납할 책이 없습니다.\n", name);
        }
    }


}


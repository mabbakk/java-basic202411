package chap1_10.practice;

public class PrintedBook extends Book {

    private int pageCount;

    // 생성자
    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    // 메서드
    public void displayInfo() {
        System.out.println("PrintedBook 제목: " + title + ", 저자: " + author + ", 페이지 수: " + pageCount + "쪽");
    }
}

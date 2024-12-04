package chap1_10.practice;

public class Ebook extends Book {

    private double fileSize;


    public Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public Ebook(String title, String author) {
        super(title, author);
    }

    // 메서드
    public void displayInfo() {
        System.out.println("Ebook 제목: " + title + ", 저자: " + author + ", 파일 크기: " + fileSize + "MB");
    }
}

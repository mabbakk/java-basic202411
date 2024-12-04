package chap1_10.practice;

public abstract class Book {

    protected String title;
    protected String author;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayInfo();
}

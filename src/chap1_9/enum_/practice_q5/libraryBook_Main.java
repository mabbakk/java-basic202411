package chap1_9.enum_.practice_q5;

import static chap1_9.enum_.practice_q5.Genre.FICTION;
import static chap1_9.enum_.practice_q5.Genre.SCIENCE;

public class libraryBook_Main {

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("뽀로로","뽀로로 저자", SCIENCE);
        LibraryBook book2 = new LibraryBook("해리포터", "줴케롤링", FICTION);
    }


}

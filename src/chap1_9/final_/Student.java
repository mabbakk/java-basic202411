package chap1_9.final_;

public class Student {

    public String name; // 학생명
    public final String ssn; // 주민번호

    // 상수는 불변성과 유일성을 만족해야 한다.
    // 따라서 final 키워드는 불변성은 만족하나 유일성을 만족하지 못함.

    public final String nation = "한국";

    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

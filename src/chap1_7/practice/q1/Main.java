package chap1_7.practice.q1;

public class Main {
    public static void main(String[] args) {

        Employee park = new Employee("박영희", 3000000);
        Manager ko = new Manager("고길동", 5000000, 1000000);

        park.work();
        System.out.printf("%s님의 급여: $.0f원\n", park.name, park.getSalary());
        ko.work();
        System.out.printf("%s님의 급여: $.0f원\n", ko.name, park.getSalary());
    }
}

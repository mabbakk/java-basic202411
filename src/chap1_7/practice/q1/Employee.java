package chap1_7.practice.q1;

public class Employee {

    public String name;  // 직원 이름
    public double salary; // 급여

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("%d님이 일반 직원으로 일합니다." + name);
    }

    public double getSalary() {
        return salary;
    }

}

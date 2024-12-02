package chap1_7.practice.q1;

public class Manager extends Employee {

    // 추가 생성자
    public double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);  // 부모 클래스 생성자 호출
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("%d님이 관리자로 팀을 관리합니다." + name);
    }

    public double getTotalCompensation() {
        return salary + bonus;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("홍길동", 3000000);
        Manager mgr = new Manager("김철수", 5000000, 1000000);

        emp.work();
        System.out.println(emp.name + "님의 급여: " + emp.getSalary() + "원");

        mgr.work();
        System.out.println(mgr.name + "님의 총 보상: " + mgr.getTotalCompensation() + "원");
    }
}

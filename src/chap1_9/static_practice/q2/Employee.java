package chap1_9.static_practice.q2;

public class Employee {

    private static int idCounter = 1;
    private static int employeeId;
    private String name;

    public Employee(String name) {
        this.name = name;

    }

    public void getEmployeeInfo() {
        System.out.println("직원의 ID: " + employeeId + "이름: " + name);
    }
}

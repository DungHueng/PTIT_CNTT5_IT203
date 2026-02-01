package Bai_04;

public class Employee {
    private String ID;
    private String name;
    private double salary;

    public Employee() {
        this.ID = "Chưa có";
        this.name = "Chưa có";
        this.salary = 0;
    }
    public Employee(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.salary = 0;
    }
    public Employee(String ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("------------------------");
        System.out.println("Mã nhân viên: " + ID);
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("------------------------");
    }
}

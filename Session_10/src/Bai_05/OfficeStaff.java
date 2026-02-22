package Bai_05;

public class OfficeStaff extends Employee {
    public OfficeStaff() {
    }

    public OfficeStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

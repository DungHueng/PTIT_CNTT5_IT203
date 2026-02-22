package Bai_05;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new OfficeStaff("A", 5000);
        Employee emp2 = new Manager("B", 20000, 9000);

        emp1.display();
        emp2.display();
    }
}

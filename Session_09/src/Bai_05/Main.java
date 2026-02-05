package Bai_05;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("nguyễn Văn A", 10000000);
        employees[1] = new ProductionEmployee("Trần Thị B", 300, 20000);
        employees[2] = new ProductionEmployee("Lò Văn C", 150, 30000);

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i]);
            totalSalary += employees[i].calculateSalary();
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: "
                + String.format("%,.0f", totalSalary));
    }

}

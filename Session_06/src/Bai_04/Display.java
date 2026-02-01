package Bai_04;

public class Display {
    public static void main(String[] args) {
        Employee user1 = new Employee();
        Employee user2 = new Employee("NV01", "Nguyễn Văn A");
        Employee user3 = new Employee("NV02", "Trần Thị B", 15000000);

        user1.display();
        user2.display();
        user3.display();
    }
}

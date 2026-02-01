package Bai_03;

public class Display {
    static void main(String[] args) {
        Product user1 = new Product("SP01",200000,"Tivi");
        Product user2 = new Product("SP02",10000,"Điện thoại");

        user2.display();

        // Thử set giá không hợp lệ
        user1.setSelling(-5000);
    }
}

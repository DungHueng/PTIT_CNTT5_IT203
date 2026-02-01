package BTTH;

public class Main {
    public static void main(String[] args) {
        BTTH NguyenA = new BTTH("12345678900", "A", 100000);
        BTTH NguyenB = new BTTH("12345678901", "B", 900000);

        System.out.println("Thông tin của A trước: ");
        NguyenA.display();
        System.out.println("Thông tin của B trước: ");
        NguyenB.display();

        NguyenB.deposit(300000);
        NguyenA.withdraw(200000);

        System.out.println("Thông tin của A sau: ");
        NguyenA.display();
        System.out.println("Thông tin của B sau: ");
        NguyenB.display();
    }
}
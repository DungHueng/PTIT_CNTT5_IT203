import java.util.Scanner;

public class Bai_03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moneyPayback = 5000;
        int total = 0;

        System.out.printf("Nhập số sách trả muộn: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Nhập số ngày trễ của cuốn sách thứ " + i + ":");
            int slowPay = scanner.nextInt();
            total += slowPay * moneyPayback;
        }
        System.out.printf("Tổng số tiền phạt là: " + total + "VND");
    }
}

import java.util.Scanner;

public class Bai_02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số ngày chậm trễ");
        int n = scanner.nextInt();

        System.out.printf("Nhập số lượng sách mượn");
        int m = scanner.nextInt();

        double total = n*m*5000;

        if(n>7 && m>=3){
            total *= 1.2;
        }
        boolean card = total > 50000;

        System.out.printf("Tiền phạt gốc: %.1f VNĐ\n", n*m*5000.0);
        System.out.printf("Tiền phạt sau điều chỉnh: %.1f VNĐ\n", total);
        System.out.println("Yêu cầu khóa thẻ: " + card);
    }
}

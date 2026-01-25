import java.util.Scanner;

public class Bai_04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập giá sách (USD - kiểu double): ");
        double price = scanner.nextDouble();

        System.out.print("Nhập tỷ giá (VNĐ/USD - kiểu float): ");
        float exchangeRate = scanner.nextFloat();

        double priceVND = price * exchangeRate;

        long roundedPrice = (long) priceVND;

        System.out.println("Giá chính xác (số thực): " + priceVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedPrice);

    }
}

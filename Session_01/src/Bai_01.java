import java.util.Scanner;

public class Bai_01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã sách: ");
        String bookID = scanner.nextLine();

        System.out.printf("Nhập tên sách: ");
        String bookName = scanner.nextLine();

        System.out.printf("Nhập năm xuất bản: ");
        int publishYear = scanner.nextInt();

        System.out.printf("Nhập giá bìa: ");
        double price = scanner.nextDouble();

        System.out.printf("Sách còn trong kho (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        int bookAge = 2026 - publishYear;

        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + bookAge + " năm");
        System.out.printf("Giá bán: %.2f VNĐ\n", price);
        System.out.println("Tình trạng: " + (isAvailable ? "Còn sách" : "Đã mượn"));
    }
}

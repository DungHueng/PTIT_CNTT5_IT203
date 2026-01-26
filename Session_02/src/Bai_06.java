import java.util.Scanner;

public class Bai_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0, min = 0;
        int total = 0;
        int day = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhập lượt muộn ngày " + i + ": ");
            int late = scanner.nextInt();

            if (late == 0) {
                continue;
            }

            if (day == 0) {
                max = min = late;
            } else {
                if (late > max) max = late;
                if (late < min) min = late;
            }
            total += late;
            day++;
        }
        double avg = (day > 0) ? (double) total / day : 0;

        System.out.println("\n--- KẾT QUẢ THỐNG KÊ ---");
        System.out.println("Lượt muộn cao nhất: " + max);
        System.out.println("Lượt muộn thấp nhất: " + min);
        System.out.println("Trung bình lượt muộn/ngày: " + avg);
    }
}

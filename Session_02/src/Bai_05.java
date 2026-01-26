import java.util.Scanner;

public class Bai_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reputationPoint = 100;
        int dayLate;

        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("(Nhập số ngày trễ. Nhập 999 thì kết thúc)");

        while (true) {
            System.out.print("\nSố ngày trễ của lần này: ");
            dayLate = scanner.nextInt();

            if (dayLate == 999) {
                break;
            }

            if (dayLate <= 0) {
                reputationPoint += 5;
                System.out.println("-> Trả đúng hạn: +5 điểm.");
            } else {
                int diemTru = dayLate * 2;
                reputationPoint -= diemTru;
                System.out.println("-> Trả trễ " + dayLate + " ngày: -" + diemTru + " điểm.");
            }
        }

        System.out.println("\nTổng điểm uy tín: " + reputationPoint);

        if (reputationPoint > 120) {
            System.out.println("Xếp loai: ĐỘC GIẢ THÂN THIẾT");
        } else if (reputationPoint >= 80) {
            System.out.println("Xếp loại: ĐỘC GIẢ TIÊU CHUẨN");
        } else {
            System.out.println("Xếp loại: ĐỘC GIẢ CẦN LƯU Ý");
        }
    }
}

import java.util.Scanner;

public class Bai_02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập mã thể loại sách: ");
        String code = scanner.nextLine();

        switch (code){
            case "A":
                System.out.printf("Tầng 1: Sách Văn học");
                break;
            case "B":
                System.out.printf("Tầng 2: Sách Khoa học");
                break;
            case "C":
                System.out.printf("Tầng 3: Sách Ngoại ngữ");
                break;
            case "D":
                System.out.printf("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.printf("Lỗi: Mã khu vực không hợp lệ");
                break;
        }
    }
}

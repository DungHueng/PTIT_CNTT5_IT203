import java.util.Scanner;

public class Bai_01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.printf("Nhập số sách đang muốn: ");
        int bookQuantity = scanner.nextInt();

        if (age >= 18 && bookQuantity <= 3){
            System.out.println("Kết quả: bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm");
        }else{
            System.out.println("Không đủ điều kiện");
        }
        if (age < 18){
            System.out.printf("- Lý do: Bạn phải từ 18 tuổi trở lên");
        } else if (bookQuantity >3) {
            System.out.printf("- Lý do: Bạn đã mượn tối đa 3 cuốn");
        }
    }
}

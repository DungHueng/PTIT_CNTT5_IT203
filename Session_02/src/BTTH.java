import java.util.Scanner;
        /**
         * YÊU CẦU 1
         * •	Mục đích:
         * o             Tính tiền phạt khi trả muộn sách
         * •	Yêu cầu:
         * o	       Nhập số lượng sách phải trả:
         * o	       Nhập ngày quá hạn của từng sách
         * o	       Kiểm tra < 5 ngày -> 2000đ / ngày
         * o	       Kiểm tra >=6 ngày -> 5000đ / ngày
         * o	       Tính tổng tiền phạt
         * •	Giải pháp:
         * o	     For
         * o	     If else
         * •	Thực thi:
         * o	     Khởi tạo biến tích luỹ tiền phạt
         * o	     B1: Nhập số lượng sách
         * o	     B2: Dùng vòng for lặp quá các quyển sách
         * 	            B3: Nhập số lượng ngày trả muộn (ngày trả muộn)
         * 	            B4: Kiểm tra điều kiện:
         * 	            If < 5 -> 2000 * ngày trả muộn
         * 	            Else >= 6 -> 5 * 2000 + (ngày trả muộn - 5) * 5000
         * o	      B5: In ra kết quả
         */
public class BTTH {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int totalprice =0;
//        System.out.println("Nhập số lượng sách phải trả: ");
//        int quantity = sc.nextInt();
//        for (int i=0; i< quantity; i++){
//            System.out.println("Nhập vào số ngày trả: ");
//            int lateDay = sc.nextInt();
//            if (lateDay > 0 && lateDay <=5){
//                totalprice += lateDay * 2000;
//            } else if (lateDay >=6 ) {
//                totalprice += 5 * 2000 + (lateDay - 5) * 5000;
//            }
//        }

        /**
         * YÊU CẦU 2:
         * •	Mục đích:
         * o	    Kiểm tra có đủ điều kiện làm thẻ VIP
         * •	Yêu cầu:
         * o	     Nhập thông tin ( age, số lượng sách đã mượn, có thẻ ưu tiên hay không )
         * o	     Kiểm tra đủ điều kiện hay không
         * o	     In thông tin ra màn hình
         * •	Giải pháp:
         * o	    If else
         * •	Thực thi:
         * o	     B1: Nhập tuổi
         * o	     B2: Nhập số lượng sách
         * o	     B3: Nhập thẻ ưu tiên
         * o	     B4: Kiểm tra (age >= 18 && quantityBorrow >= 10) || (isPriority == true)  true | false
         * o	     B5: Kiểm tra kq trả về là true hay false  đăng ký được thẻ VIP | không đủ điều kiện
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tuổi");
//        int age = scanner.nextInt();
//        System.out.println("Nhập số lượng sách đã mượn:");
//        int quantityBorrow = scanner.nextInt();
//        System.out.println("Có thể ưu tiên hay ko? (0 và 1): ");
//        int isPriority = scanner.nextInt();
//
//        if ((age > 18 && quantityBorrow >= 10) || isPriority == 1){
//            System.out.println("Đã đủ đk nâng cấp VIP");
//        }else {
//            System.out.println("Chưa đủ đk");
//        }

        /**
         * YÊU CẦU 3:
         * •	Mục đích:
         * o	     Thống kê số sách nhập kho
         * •	Yêu cầu:
         * o	      Nhập mã hợp lệ (> 0)
         * o	      Đếm số mã hợp lệ
         * o	      In ra số lượng sách hợp lệ
         * •	Giải pháp:
         * o	      While hoặc do…while
         * o	      If else
         * o	      Break
         * •	Thực thi:
         * o	      Tạo biến đếm = 0
         * o	      B1: dùng vòng lặp do…while (luôn đúng)
         * 	            B2: Nhập mã số
         * 	           B3: Kiểm tra
         * •	                  B4: < 0 không tính bắt nhập lại
         * •	                  B5: == 0  break – thoát khỏi vòng lặp
         * •	                  B6: > 0 biến đếm tăng lên
         * o	       B7: In kết quả biến đếm ra màn hình
         */
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int maSach;

        do {
            System.out.print("Nhập mã sách (>0, nhập 0 để kết thúc): ");
            maSach = scanner.nextInt();

            if (maSach < 0) {
                System.out.println("Mã không hợp lệ, vui lòng nhập lại!");
            } else if (maSach > 0) {
                count++;
            } else {
                break;
            }
        } while (true);

        System.out.println("Số lượng sách hợp lệ: " + count);
    }
 }


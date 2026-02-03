package HN_KS24_CNTT5_HoangTrungDung;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Student[] students = new Student[100];
        int current = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    ===== QUẢN LÝ ĐIỂM SINH VIÊN =====
                    1. Nhập danh sách sinh viên\s
                    2. Hiển thị danh sách sinh viên\s
                    3. Tìm kiếm sinh viên theo Học lực\s
                    4. Sắp xếp theo học lực giảm dần
                    5. Thoát\s
                    ==================================
                    Chọn chức năng:\s
                    """);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Nhập số lượng muốn thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên " + (current + 1));
                        System.out.print("ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Họ tên sinh viên: ");
                        String name = scanner.nextLine();
                        System.out.print("Điểm: ");
                        double score = Double.parseDouble(scanner.nextLine());

                        students[current] = new Student(id, name, score);
                        current++;
                    }
                    break;
                case 2:
                    if (current == 0){
                        System.err.println("-- Danh sách trống --");
                    }else {
                        for (int i = 0; i < current; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3: break;
                case 4: break;
                case 5:
                    System.out.println("-- Thoát chương trình thành công --");
                    break;
            }
        }while(true);
    }
}
package Bai_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medicine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập mã thuốc: ");
    String name = sc.nextLine();

    Map<String, String> medicine = new HashMap<>();
    medicine.put("T01", "Paracetamol");
    medicine.put("T02", "Ibuprofen");
    medicine.put("T03", "Amoxicillin");
    medicine.put("T04", "Aspirin");
    medicine.put("T05", "Vitamin C");

    if (medicine.containsKey(name)) {
        System.out.println("Tên thuốc: " + medicine.get(name));
    } else {
        System.err.println("Thuốc không tồn tại");
    }
    }
}

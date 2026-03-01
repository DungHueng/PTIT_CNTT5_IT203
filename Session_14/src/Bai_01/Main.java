package Bai_01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Hospital> set = new LinkedHashSet<>();
        set.add(new Hospital("Nguyễn Văn A - Yên Bái"));
        set.add(new Hospital("Trần Thị B - Thái Bình"));
        set.add(new Hospital("Lê Văn C - Hưng Yên"));
        set.add(new Hospital("Lê Văn C - Hưng Yên"));
        System.out.println("Output: ");
        for (Hospital i : set) {
            System.out.println(i);
        }
    }
}

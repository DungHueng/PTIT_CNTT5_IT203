package Bai_02;

public class display {
    public static void main(String[] args) {

        int a = 5;
        int b = a;

        System.out.println("Trước khi thay đổi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 15;

        System.out.println("Sau khi thay đổi b:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        Bai_02 student1 = new Bai_02("Nguyen A");
        Bai_02 student2 = student1;

        System.out.println("Trước khi thay đổi:");
        System.out.println("student1.name = " + student1.name);
        System.out.println("student2.name = " + student2.name);

        student2.name = "Tran B";

        System.out.println("Sau khi thay đổi student2:");
        System.out.println("student1.name = " + student1.name);
        System.out.println("student2.name = " + student2.name);
    }
}

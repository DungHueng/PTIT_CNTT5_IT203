package Bai_01;

public class Student_Info {
    public static void main(String[] args){
        Bai_01 Student1 = new Bai_01("PTIT_1", "Nguyen Van A", "05/07/2001", "8.0");
        Bai_01 Student2 = new Bai_01("PTIT_2", "Tran Thi B", "07/02/2002", "5.0");

        System.out.println("Thông tin sinh viên A: ");
        Student1.display();
        System.out.println("Thông tin sinh viên B: ");
        Student2.display();
    }
}
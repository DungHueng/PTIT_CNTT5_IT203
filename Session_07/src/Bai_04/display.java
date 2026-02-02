package Bai_04;

public class display {
    static void main(String[] args) {
        ClassRoom student1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom student2 = new ClassRoom("Trần Thị B");
        ClassRoom student3 = new ClassRoom("Lò Văn C");

        student1.display();
        student1.payFund(1000);

        student2.display();
        student2.payFund(2000);

        student3.display();
        student3.payFund(50000);
    }
}

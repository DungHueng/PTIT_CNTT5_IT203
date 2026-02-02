package Bai_01;

public class display {
    static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A");
        Student student2 = new Student("SV002", "Trần Thị B");

        student1.display();
        student2.display();

        Student.displayTotalStudent();
    }
}

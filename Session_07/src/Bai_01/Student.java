package Bai_01;

public class Student {
    private String ID;
    private String name;

    public static int totalStudent = 0;

    public Student() {
    }

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
        totalStudent++;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("-----------------------------------");
        System.out.println("ID: " + ID);
        System.out.println("Họ tên sinh viên: " + name);
        System.out.println("-----------------------------------");
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
}

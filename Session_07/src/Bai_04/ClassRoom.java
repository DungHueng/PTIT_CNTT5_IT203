package Bai_04;

public class ClassRoom {
    public String name;

    public static double classFund;

    public ClassRoom() {
    }

    public ClassRoom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getClassFund() {
        return classFund;
    }

    public static void setClassFund(double classFund) {
        ClassRoom.classFund = classFund;
    }

    public void payFund(double amount) {
        classFund += amount;
        System.out.println(name + " đã đóng: " + amount);
    }

    public void display(){
        System.out.println("-----------------------------------");
        System.out.println("Họ tên sinh viên: " + name);
        System.out.println("Tổng quỹ của cả lớp: " + classFund);
        System.out.println("-----------------------------------");
    }
}

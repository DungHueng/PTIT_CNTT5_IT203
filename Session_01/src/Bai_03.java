public class Bai_03 {
    static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("--- Trước khi hoán đổi ---");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("==========================\n");

        // Tạo biến temp trên Stack để tham chiếu đối tượng đến book1
        String temp = book1;

        // Sau khi đã thay đổi tham chiếu đến book1 thì trỏ đến đối tượng mà book2 đang trỏ
        book1 = book2;

        // Sau khi thay đổi tham chiếu của book2 thì trỏ đến đối tượng mà temp đang trỏ
        book2 = temp;

        System.out.println("--- Sau khi hoán đổi ---");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("=========================");
    }
}

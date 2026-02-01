package Bai_02;

public class display {
    public void main(String[] args) {
        Account User1 = new Account("Nguyen Van A", "123456", "nguyenvana@gmail.com");
        Account User2 = new Account("Tran Thi B", "654321", "tranthib@gmail.com");

        System.out.println("Mật khẩu trước khi đổi");
        User1.display();
        User2.display();

        User1.changePassword("abcdef");
        User2.changePassword("xyz789");

        System.out.println("Mật khẩu sau khi đổi");
        User1.display();
        User2.display();

    }
}
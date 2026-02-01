package Bai_02;

public class Account {
    public String userName;
    private String password;
    public String email;

    public Account(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void display(){
        System.out.println("------------------------");
        System.out.println("Họ và tên: " + userName);
        System.out.println("Mật khẩu: ******");
        System.out.println("Email: " + email);
        System.out.println("------------------------");
    }
}

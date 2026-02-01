package Bai_01;

public class Bai_01 {
    private String ID;
    public String full_Name;
    public String birth_Date;
    private String score;

    public Bai_01(String ID, String full_Name, String birth_Date, String score){
        this.ID = ID;
        this.full_Name = full_Name;
        this.birth_Date = birth_Date;
        this.score = score;
    }
    public void display (){
        System.out.println("------------------------");
        System.out.println("MSSV: " + ID);
        System.out.println("Họ và tên: " + full_Name);
        System.out.println("Ngày sinh: " + birth_Date);
        System.out.println("Điểm: " + score);
        System.out.println("------------------------");
    }
}

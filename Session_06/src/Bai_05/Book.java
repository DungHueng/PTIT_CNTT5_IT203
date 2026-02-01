package Bai_05;

public class Book {
    private String ID;
    private String name;
    private int price;

    public Book(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("------------------------");
        System.out.println("Mã sách: " + ID);
        System.out.println("Tên sách: " + name);
        System.out.println("Giá sách: " + price);
        System.out.println("------------------------");
    }
}

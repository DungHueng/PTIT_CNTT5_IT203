package Bai_04;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof woof...");
    }

    public void action(){
        System.out.println("Đang chạy");
    }
}

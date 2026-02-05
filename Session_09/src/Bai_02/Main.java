package Bai_02;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog("Ana", 4);
        System.out.println(Dog);
        Dog.sound();
        Animal Cat = new Cat("Miu", 5);
        System.out.println(Cat);
        Cat.sound();
    }
}

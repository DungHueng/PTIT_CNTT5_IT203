package Bai_04;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Ana");

        dog.sound();

        if (dog instanceof Dog) {
            Dog realDog = (Dog) dog;
            realDog.action();
        }
    }
}
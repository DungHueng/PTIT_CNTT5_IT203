package Bai_04;

public interface RemoteControl {
    void PowerOn();
    default void checkBatery() {
        System.out.println("Pin ổn định");
    }
}

package Bai_04;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("01", "Nguyễn Văn A", 2, 0));
        queue.addPatient(new EmergencyPatient("02", "Trần Thị B", 1, 0));
        queue.addPatient(new EmergencyPatient("03", "Lê Văn C", 2, 0));
        queue.addPatient(new EmergencyPatient("04", "Lò Thị D", 1, 0));

        queue.displayQueue();

        System.out.println("Gọi khám:");
        System.out.println(queue.callNextPatient());
        System.out.println(queue.callNextPatient());
        System.out.println(queue.callNextPatient());
        System.out.println(queue.callNextPatient());
    }
}

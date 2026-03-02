package Bai_02;

public class Main {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("001", "Nguyễn Văn A", 19));
        patientQueue.addPatient(new Patient("002", "Trần Thị B", 20));
        patientQueue.addPatient(new Patient("003", "Lê Văn C", 24));
        patientQueue.displayQueue();

        System.out.println("Bệnh nhân tiếp theo: ");
        System.out.println(patientQueue.peekNextPatient());

        System.out.println("Gọi khám: ");
        System.out.println(patientQueue.callNextPatient());

        System.out.println("Sau khi gọi khám");
        patientQueue.displayQueue();
    }
}

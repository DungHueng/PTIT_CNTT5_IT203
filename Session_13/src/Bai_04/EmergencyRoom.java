package Bai_04;

import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue = new LinkedList<>();

    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }

    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }

        String name = queue.removeFirst();
        if (name.equals("C")) {
            System.out.println("Đang cấp cứu: " + name);
        } else {
            System.out.println("Đang khám: " + name);
        }
    }
}

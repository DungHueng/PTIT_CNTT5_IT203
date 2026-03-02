package Bai_04;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyQueue {
    public long counter = 0;

    public PriorityQueue<EmergencyPatient> queue = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
                @Override
                public int compare(EmergencyPatient p1, EmergencyPatient p2) {

                    if (p1.getPriority() != p2.getPriority()) {
                        return Integer.compare(p1.getPriority(), p2.getPriority());
                    }

                    return Long.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
                }
            });

    public void addPatient(EmergencyPatient p) {
        p.setArrivalOrder(counter++);
        queue.offer(p);
        System.out.println("Đã thêm bệnh nhân.");
    }

    public EmergencyPatient callNextPatient() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            System.out.println("Không có bệnh nhân.");
            return null;
        }
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        System.out.println("=== DANH SÁCH ĐANG CHỜ ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}

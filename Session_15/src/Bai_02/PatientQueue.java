package Bai_02;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    public Queue<Patient> queue = new LinkedList<Patient>();

    public void addPatient(Patient p){
        queue.offer(p);
        System.out.println("Đã thêm thành công!");
    }

    public Patient callNextPatient() {
        if(!queue.isEmpty()){
            return queue.peek();
        } else {
            System.out.println("Hàng đợi trống");
            return null;
        }
    }

    public Patient peekNextPatient() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Hàng đợi trống.");
            return null;
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayQueue(){
        if(!queue.isEmpty()){
            System.out.println("Hàng đợi trống!");
            return;
        }
        System.out.println("--- Danh sách ---");
        for(Patient p : queue){
            System.out.println(p);
        }
    }
}

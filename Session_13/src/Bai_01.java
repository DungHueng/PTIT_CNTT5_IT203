import java.util.ArrayList;
import java.util.Iterator;

public class Bai_01 {
    public static void main(String[] args) {
        ArrayList<Double> patient = new ArrayList<>();
        patient.add(36.5);
        patient.add(40.2);
        patient.add(37.0);
        patient.add(12.5);
        patient.add(39.8);
        patient.add(99.9);
        patient.add(36.8);

        System.out.println("Danh sách ban đầu:");
        System.out.println(patient);

        Iterator<Double> iterator = patient.iterator();

        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }
        System.out.println("Danh sách sau khi lọc:");
        System.out.println(patient);

        double sum = 0;
        for (Double temp : patient) {
            sum += temp;
        }
        double avg = sum / patient.size();
        System.out.printf("Nhiệt độ trung bình: %.2f\n", avg);
    }
}

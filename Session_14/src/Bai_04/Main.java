package Bai_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> diseases = new ArrayList<>();
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");
        diseases.add("Cúm A");
        diseases.add("Covid-19");
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");

        Patient service = new Patient();

        Map<String, Integer> report = service.countDiseases(diseases);

        System.out.println("BÁO CÁO SỞ Y TẾ:");
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}

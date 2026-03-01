package Bai_04;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Patient {
    public Map<String, Integer> countDiseases(List<String> diseases) {

        Map<String, Integer> report = new TreeMap<>();

        for (String disease : diseases) {
            report.put(disease, report.getOrDefault(disease, 0) + 1);
        }

        return report;
    }
}

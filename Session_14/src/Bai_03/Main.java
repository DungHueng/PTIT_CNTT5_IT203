package Bai_03;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> drug = new HashSet<>();
        drug.add("Aspirin");
        drug.add("Caffeine");
        drug.add("Paracetamol");

        Set<String> allergy = new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");

        Warning service = new Warning();

        Set<String> warning = service.AllergyWarning(drug, allergy);
        Set<String> safe = service.safeAllergy(drug, allergy);

        System.err.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safe);
    }
}

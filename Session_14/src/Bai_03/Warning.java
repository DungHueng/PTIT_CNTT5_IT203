package Bai_03;

import java.util.HashSet;
import java.util.Set;

public class Warning {
    public Set<String> AllergyWarning(Set<String> drug, Set<String> allergy) {
        Set<String> result = new HashSet<>(drug);
        result.retainAll(allergy);
        return result;
    }

    public Set<String> safeAllergy(Set<String> drug, Set<String> allergy) {
        Set<String> result = new HashSet<>(drug);
        result.removeAll(allergy);
        return result;
    }
}

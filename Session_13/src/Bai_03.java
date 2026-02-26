import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai_03 {
    private static Bai_03 PatientUtils;

    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            T item = listA.get(i);
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(101, 102, 105);
        List<Integer> list2 = Arrays.asList(102, 105, 108);
        List<Integer> commonInt = PatientUtils.findCommonPatients(list1, list2);
        System.out.println("Test Case 1 Output: " + commonInt);
        List<String> list3 = Arrays.asList("DN01", "DN02", "DN03");
        List<String> list4 = Arrays.asList("DN02", "DN04");
        List<String> commonString = PatientUtils.findCommonPatients(list3, list4);
        System.out.println("Test Case 2 Output: " + commonString);
    }
}

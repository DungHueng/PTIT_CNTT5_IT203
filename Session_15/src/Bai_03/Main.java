package Bai_03;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] case2 = {"PUSH", "POP", "POP"};
        String[] case3 = {"PUSH", "PUSH", "POP"};

        System.out.println("Case 1 hợp lệ?: " + checker.checkProgress(case1));
        checker.reset();

        System.out.println("Case 2 hợp lệ?: " + checker.checkProgress(case2));
        checker.reset();

        System.out.println("Case 3 hợp lệ?: " + checker.checkProgress(case3));
        checker.reset();
    }
}

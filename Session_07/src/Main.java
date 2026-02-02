//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person nguyenVanA = new Person("Nguyễn Văn A", 20, false, true, false, true, true);
        Person tranThiB = new Person("Trần Thị B", 19, true, false, true, false, false);
        Person loThiC = new Person("Lò Thị C", 22, true, false, false, false, false);

        Person[] cntt5 = {
                nguyenVanA, tranThiB, loThiC
        };
        for (int i = 0; i < cntt5.length; i++) {
            System.out.println(cntt5[i]);
        }

        Person.className = "HN-KS24-CNTT4";

        for (int i = 0; i < cntt5.length; i++) {
            System.out.println(cntt5[i]);
            cntt5[i].learning();
        }

//        Person.learning();
    }
}
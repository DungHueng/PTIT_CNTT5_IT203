public class Person {
    public static String className = "HN-KS24-CNTT5";
    public String full_Name;
    public int age;
    public boolean isSleep;
    public boolean isMakeup;
    public boolean isBeautiful;
    public boolean isHandsome;
    public boolean isProative;

    // Constructors

    public Person() {
    }

    public Person(String full_Name, int age, boolean isSleep, boolean isMakeup, boolean isBeautiful, boolean isHandsome, boolean isProative) {
        this.full_Name = full_Name;
        this.age = age;
        this.isSleep = isSleep;
        this.isMakeup = isMakeup;
        this.isBeautiful = isBeautiful;
        this.isHandsome = isHandsome;
        this.isProative = isProative;
    }

    // Getter-Setter

    public String getFull_Name() {
        return full_Name;
    }

    public void setFull_Name(String full_Name) {
        this.full_Name = full_Name;
    }

    public static void learning(){
        System.out.println("Các bạn chủ động học nhanh!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "full_Name='" + full_Name + '\'' +
                ", age=" + age +
                ", isSleep=" + isSleep +
                ", isMakeup=" + isMakeup +
                ", isBeautiful=" + isBeautiful +
                ", isHandsome=" + isHandsome +
                ", isProative=" + isProative +
                ", className = " + className +
                '}';
    }
}

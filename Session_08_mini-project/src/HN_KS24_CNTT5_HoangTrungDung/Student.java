package HN_KS24_CNTT5_HoangTrungDung;

public class Student {
    public String id;
    public String name;
    public double score;

    public String getRank() {
        if (score >= 8.0) return "Giỏi";
        if (score >= 6.5) return "Khá";
        return "Trung bình";
    }

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
        System.out.println("ID: " + id);
        System.out.println("Họ tên sinh viên: " + name);
        System.out.println("Điểm sinh viên: " + score);
        System.out.println("Học lực sinh viên: " + getRank());
        System.out.println("==================================");
        return "";
    }
}

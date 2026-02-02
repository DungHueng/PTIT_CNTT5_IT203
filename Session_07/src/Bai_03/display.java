package Bai_03;

public class display {
    static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println("Điểm trung bình cả lớp: " + avg);

        System.out.println("Điểm 6.5: " + (ScoreUtils.checkPass(6.5) ? "Đạt" : "Trượt"));
        System.out.println("Điểm 8.0: " + (ScoreUtils.checkPass(8.0) ? "Đạt" : "Trượt"));
        System.out.println("Điểm 4.5: " + (ScoreUtils.checkPass(4.5) ? "Đạt" : "Trượt"));
    }
}

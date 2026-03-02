package Bai_01;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditAction("Thêm chuẩn đoán", "01/03/2026 10:30"));
        history.addEdit(new EditAction("Cập nhật thuốc", "05/07/2026 13:20"));
        history.addEdit(new EditAction("Chỉnh sửa tiền sử bệnh", "02/02/2026 12:00"));

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo:");
        System.out.println(history.undoEdit());

        System.out.println("\nSau khi Undo:");
        history.displayHistory();
    }
}
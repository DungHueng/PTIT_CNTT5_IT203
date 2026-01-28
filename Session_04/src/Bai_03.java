public class Bai_03 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        String time = "24/01/2026";
        long startStringBuilder = System.currentTimeMillis();
        StringBuilder reportStringBuilder = new StringBuilder();
        reportStringBuilder.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportStringBuilder.append("Ngày tạo: ").append(time).append("\n");

        for (int i = 0; i < transactions.length; i++) {
            reportStringBuilder.append("Giao dịch: ").append(transactions[i]).append("\n");
        }

        long endStringBuilder = System.currentTimeMillis();
        long timeStringBuilder = endStringBuilder - startStringBuilder;
        long startString = System.currentTimeMillis();

        String reportString = "";
        reportString += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportString += "Ngày tạo: " + time + "\n";

        for (int i = 0; i < transactions.length; i++) {
            reportString += "Giao dịch: " + transactions[i] + "\n";
        }

        long endString = System.currentTimeMillis();
        long timeString = endString - startString;

        System.out.println(reportStringBuilder.toString());
        System.out.println("Thời gian với StringBuilder: " + timeStringBuilder + " ms");
        System.out.println("Thời gian với String: " + timeString + " ms");
    }
}

import java.util.Scanner;

public class Bai_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String title = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập thể loại: ");
        String category = scanner.nextLine();
        title = title.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");
        category = category.trim().replaceAll("\\s+", " ");
        title = title.toUpperCase();
        author = capitalizeWords(author);
        String result = "[" + title + "] - Tác giả: " + author;
        System.out.println(result);
    }
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            stringBuilder.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return stringBuilder.toString().trim();
    }
}

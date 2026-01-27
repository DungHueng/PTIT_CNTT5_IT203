import java.util.Scanner;

public class Bai_02 {
    public static int searchBooks(String[] arr, String search){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i].equals(search)){
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        String[] books = new String[] {"Doraemon" , "Conan" , "Dragon ball" , "No pain , No gain" , "lap trinh c"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap tu can tim :");
        String search = sc.nextLine();
        int res = searchBooks(books,search);
        if (res == 1) System.out.println("Tim thay ' " + search + " ' tai vi tri " + res);
        else System.out.println("Sach khong ton tai trong thu vien");
    }
}

public class Bai_03 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = 0;
        for (int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] > max) {
                max = quantities[i];
            }
        }
        for(int i = 0; i< quantities.length; i++){
            if(quantities[i] == max){
                System.out.printf("%s %d \n", names[i], quantities[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = 10000;
        for (int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] < min) {
                min = quantities[i];
            }
        }
        for(int i = 0; i < quantities.length; i++){
            if(quantities[i] == min){
                System.out.printf("%s %d \n", names[i], quantities[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] names = new String[] {"Doraemon" , "Conan" , "Dragon ball" , "No pain, No gain" , "lap trinh c"};
        int[] quantities = new int[] {12 , 24 , 55 , 55 , 1};
        System.out.println("Sach co so luong lon :");
        maxQuantityOfBooks(names , quantities);
        System.out.println("Sach co so luong it :");
        minQuantityOfBooks(names,quantities);
    }
}

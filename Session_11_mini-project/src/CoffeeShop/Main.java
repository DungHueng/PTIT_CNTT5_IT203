package CoffeeShop;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("01", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("02", "Nước cam", 40000, 10);
        drinks[2] = null;

        for (Drink drink : drinks) {
            if (drink != null) {
                System.out.println(drink.displayInfo());
                System.out.println(drink.calculatePrice());
            }

        }
    }

}

package CoffeeShop;

public class Coffee extends Drink {
    private boolean hasMilk;

    public Coffee() {
    }

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk == true) {
            price = price + 5000;
        } else  {
            price = price;
        }
        return price;
    }
}

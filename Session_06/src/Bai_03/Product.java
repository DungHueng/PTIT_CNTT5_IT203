package Bai_03;

public class Product {
    private String productID;
    private String productName;
    private int selling;

    public Product(String productID, int selling, String productName) {
        this.productID = productID;
        this.productName = productName;
        this.selling = selling;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getSelling() {
        return selling;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSelling(int selling) {
        if (selling > 0){
            this.selling = selling;
        }else {
            System.err.println("-- Giá không hợp lệ --");
        }
    }
    public void display() {
        System.out.println("------------------------");
        System.out.println("Mã sản phẩm: " + productID);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá bán: " + selling);
        System.out.println("------------------------");
    }
}

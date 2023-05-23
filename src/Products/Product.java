package Products;

public class Product {
    protected String productName;
    protected int price;

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public static void main(String[] args) {

    }
}

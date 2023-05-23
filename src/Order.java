public class Order {
    private String[] products;
    private int[] prices;
    private int totalPrice;
    private int customerId;

    public Order(String[] products, int[] prices, int customerId) {
        this.products = products;
        this.prices = prices;
        this.customerId = customerId;
        this.totalPrice = calculateTotalPrice();
    }

    public int calculateTotalPrice() {
        int total = 0;
        // TO DO: calculate total price of all products
        return total;
    }
}

package Products;

import java.time.LocalDate;

public class Car {
    // exercise 7
    private int price;
    private String brand;
    private LocalDate dateOfProduct;

    public Car(int price, String brand, LocalDate dateOfProduct) {
        this.price = price;
        this.brand = brand;
        this.dateOfProduct = dateOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfProduct() {
        return dateOfProduct;
    }

    public void setDateOfProduct(LocalDate dateOfProduct) {
        this.dateOfProduct = dateOfProduct;
    }

    @Override
    public String toString() {
        return ("Car Price: " + price + " brand: " + brand + " dateOfProduct: " + dateOfProduct );
    }

    public static void main(String[] args) {
        Car demoCar = new Car(10000, "BMW", LocalDate.of(2022, 12, 3) );
        System.out.println(demoCar);
    }
}

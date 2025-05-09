package test;

import model.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product(101, "Asus Laptop", "Gaming laptop", 25990000, 1, 2, 15);

        System.out.println(p.toString());

        // Test thay doi gia tri ton kho
        p.setPrice(24500000);
        p.setStockQuantity(10);

        System.out.println("Updated Price: " + p.getPrice());
        System.out.println("Updated Stock: " + p.getStockQuantity());
    }
}

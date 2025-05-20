package model;

public class CartItem {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public CartItem() {}

    public CartItem(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String toString() {
        return "CartItem{" + " productId: " + productId + ", name: " + name + ", price: " + price + ", quantity: " + quantity + '}';
    }
}


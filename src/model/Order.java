package model;

import java.time.LocalDate;

public class Order {
    private int id;
    private int userId;
    private LocalDate orderDate;
    private double totalAmount;
    private String status;

    public Order(int id, int userId, LocalDate orderDate, double totalAmount, String status) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public LocalDate getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order #" + id + " - $" + totalAmount;
    }
}

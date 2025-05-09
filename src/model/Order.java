package model;

import java.util.Date;

public class Order {
    private int id;                 // Mã đơn hàng
    private int userId;            // Mã người đặt hàng
    private Date createdAt;        // Ngày tạo đơn hàng
    private String status;         // Trạng thái: Processing, Shipped, Cancelled
    private double totalAmount;    // Tổng tiền

    public Order(int id, int userId, Date createdAt, String status, double totalAmount) {
        this.id = id;
        this.userId = userId;
        this.createdAt = createdAt;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    @Override
    public String toString() {
        return "Order [id=" + id + ", userId=" + userId + ", date=" + createdAt +
               ", status=" + status + ", total=" + totalAmount + "]";
    }
}

package model;

import java.util.Date;

public class Statistic {
    private int productId;
    private int soldQuantity;
    private double revenue;
    private Date date;

    public Statistic() {}

    public Statistic(int productId, int soldQuantity, double revenue, Date date) {
        this.productId = productId;
        this.soldQuantity = soldQuantity;
        this.revenue = revenue;
        this.date = date;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getSoldQuantity() { return soldQuantity; }
    public void setSoldQuantity(int soldQuantity) { this.soldQuantity = soldQuantity; }

    public double getRevenue() { return revenue; }
    public void setRevenue(double revenue) { this.revenue = revenue; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override
    public String toString() {
        return "Statistic{" + " productId:" + productId + ", soldQuantity:" + soldQuantity + ", revenue:" + revenue + ", date:" + date + '}';
    }
}

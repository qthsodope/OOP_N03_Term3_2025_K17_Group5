package model;

import java.util.Date;

public class Inventory {
    private int productId;
    private int quantityIn;
    private int quantityOut;
    private int currentStock;

    public Inventory() {}

    public Inventory(int productId, int quantityIn, int quantityOut, int currentStock, Date due_date) {
        this.productId = productId;
        this.quantityIn = quantityIn;
        this.quantityOut = quantityOut;
        this.currentStock = currentStock;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getQuantityIn() { return quantityIn; }
    public void setQuantityIn(int quantityIn) { this.quantityIn = quantityIn; }

    public int getQuantityOut() { return quantityOut; }
    public void setQuantityOut(int quantityOut) { this.quantityOut = quantityOut; }

    public int getCurrentStock() { return currentStock; }
    public void setCurrentStock(int currentStock) { this.currentStock = currentStock; }


    @Override
    public String toString() {
        return "Inventory{" + " productId:" + productId + ", quantityIn:" + quantityIn + ", quantityOut:" + quantityOut +
                ", currentStock:" + currentStock + ", due_date:"  + '}';
    }
}

package model;

public class Product {
    private int id;                  // Mã sản phẩm
    private String name;            // Tên sản phẩm
    private String description;     // Mô tả sản phẩm
    private double price;           // Giá tiền
    private int categoryId;         // Mã danh mục
    private int brandId;            // Mã thương hiệu
    private int stockQuantity;      // Số lượng tồn kho

    public Product(int id, String name, String description, double price,
                   int categoryId, int brandId, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.stockQuantity = stockQuantity;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public int getBrandId() { return brandId; }
    public void setBrandId(int brandId) { this.brandId = brandId; }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price +
               ", category=" + categoryId + ", brand=" + brandId + ", stock=" + stockQuantity + "]";
    }
}

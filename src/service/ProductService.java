package service;
import model.Product;
import java.util.ArrayList;
public class ProductService {
    private final ArrayList<Product> productList = new ArrayList<>();

    // cập nhật thông tin sản phẩm
    public void updatedProduct(int id, String name, double price) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                System.out.println("Product with ID " + id + " updated successfully.");
                break;
            }
        }
    }
}

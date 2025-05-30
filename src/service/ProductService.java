package service;
import model.Product;
import java.util.ArrayList;
public class ProductService {
    private final ArrayList<Product> productList = new ArrayList<>();

    // cập nhật thông tin sản phẩm
   public boolean updateProductById(int id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }
}

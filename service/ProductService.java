package service;
import model.Product;
import java.util.ArrayList;

public class ProductService {
    ArrayList<Product> products = new ArrayList<Product>();

    public boolean checkId(int id) {
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id) {
                return false;
            }
        }
        return true;
    }

    public boolean addProduct(Product product) {
        if(checkId(product.getId())) {
            products.add(product);
            return true;
        }
        return false;
    }

}

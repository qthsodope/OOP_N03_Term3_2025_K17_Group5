package service;

import model.Product;
import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();

    public boolean checkId(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public boolean addProduct(Product product) {
        if (checkId(product.getId())) {
            products.add(product);
            return true;
        }
        return false;
    }

    public ArrayList<Product> search(String keyword) {
        ArrayList<Product> result = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(lowerKeyword) ||
                    product.getDescription().toLowerCase().contains(lowerKeyword)) {
                result.add(product);
            }
        }
        return result;
    }

    public boolean updateProductById(int id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }
}

package service;
import model.Product;
import java.util.ArrayList;

public class ProductService {
    ArrayList<Product> products = new ArrayList<Product>();

    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }

    public ArrayList<Product> search(String keyword) {
        for (Product product : products) {
            if (product.getName().equals(keyword) || product.getDescription().equals(keyword)) {
                System.out.println(product);
            }
            else{
                System.out.println("Not found");
            }
        }
        return products;
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

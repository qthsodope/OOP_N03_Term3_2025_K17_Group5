package test;

import model.Product;
import service.productService;

import java.util.Scanner;

public class ProductServiceTest {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        productService productService = new productService();

        productService.addProduct(new Product(1, "MacBook Pro", "Laptop Apple", 3200, 1, 1, 5));
        productService.addProduct(new Product(2, "Asus ROG", "Gaming laptop", 2500, 1, 2, 3));

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Mô tả: ");
                    String desc = scanner.nextLine();
                    System.out.print("Giá: ");
                    double price = scanner.nextDouble();
                    System.out.print("Danh mục ID: ");
                    int categoryId = scanner.nextInt();
                    System.out.print("Thương hiệu ID: ");
                    int brandId = scanner.nextInt();
                    System.out.print("Số lượng tồn kho: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();

                    Product newProduct = new Product(id, name, desc, price, categoryId, brandId, stock);
                    boolean added = productService.addProduct(newProduct);

                    if (added) {
                        System.out.println("Thêm sản phẩm thành công.");
                    } else {
                        System.out.println("ID đã tồn tại. Không thể thêm.");
                    }

                    System.out.println("\nDanh sách sản phẩm hiện tại:");
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }
                }

                case 2 -> {
                    System.out.print("Nhập ID sản phẩm cần tìm: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    Product result = productService.getProductById(searchId);

                    if (result == null) {
                        System.out.println("Không tìm thấy sản phẩm.");
                    } else {
                        System.out.println("Kết quả tìm kiếm:");
                        System.out.println(result);
                    }

                    System.out.println("\nDanh sách sản phẩm hiện tại:");
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }
                }

                case 3 -> {
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Mô tả mới: ");
                    String newDesc = scanner.nextLine();
                    System.out.print("Giá mới: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Danh mục ID mới: ");
                    int newCategoryId = scanner.nextInt();
                    System.out.print("Thương hiệu ID mới: ");
                    int newBrandId = scanner.nextInt();
                    System.out.print("Số lượng tồn kho mới: ");
                    int newStock = scanner.nextInt();
                    scanner.nextLine();

                    Product updatedProduct = new Product(updateId, newName, newDesc, newPrice, newCategoryId, newBrandId, newStock);
                    boolean updated = productService.updateProductById(updateId, updatedProduct);

                    if (updated) {
                        System.out.println("Cập nhật sản phẩm thành công.");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với ID đã nhập.");
                    }

                    System.out.println("\nDanh sách sản phẩm hiện tại:");
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }
                }

                case 0 -> {
                    System.out.println("Đã thoát chương trình.");
                    return;
                }

                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}

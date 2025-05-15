package test;

import model.Order;
import java.util.Date;

public class OrderTest {
   public void test() {
        Date now = new Date();
        Order order = new Order(2001, 1, now, "Processing", 12000000);

        System.out.println(order.toString());

        // Test cap nhat trang thai don hang
        order.setStatus("Shipped");
        System.out.println("New status: " + order.getStatus());
    }
}

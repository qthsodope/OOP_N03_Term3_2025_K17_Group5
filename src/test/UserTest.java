package test;

import model.User;

public class UserTest {
    public static void main(String[] args) {
        User u = new User(1, "admin", "admin123", "admin@gmail.com", "ADMIN", true);

        System.out.println(u.toString());

        // Update trang thai
        u.setStatus(false);
        System.out.println("Is Active: " + u.isStatus());

        // Doi role
        u.setRole("STAFF");
        System.out.println("Updated Role: " + u.getRole());
    }
}

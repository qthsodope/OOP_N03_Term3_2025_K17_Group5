package test;

import model.User;
import service.UserService;

import java.util.Scanner;

public class UserServiceTest {
    public static void run(){
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("_____MENU_____\n");
            System.out.println("1. Add User");
            System.out.println("2. Delete User");
            System.out.println("3. Update User");
            System.out.println("4. Login User");
            System.out.println("5. Register new user");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1  -> {
                    System.out.print("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String pass = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter status: ");
                    Boolean status = scanner.nextBoolean();

                    User newUser = new User(id, name, pass, email, role, status);
                    userService.addUser(newUser);
                    boolean registered = userService.register(newUser);
                    if (registered) {
                        System.out.println("Dang nhap thanh cong");
                    } else {
                        System.out.println("tai khoan da ton tai hoac ten dang nhap da ton tai");
                    }
                }

                case 2 -> {
                    System.out.print("Chon UserId de xoa. Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    if (userService.deleteUser(id)) {
                        System.out.println("xoa thanh cong");
                    } else {
                        System.out.println("khong ton tai nguoi dung co id= %d" + id);
                    }
                }

                case 3 -> {
                    System.out.print("Chon UserId de sua. Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Chon ten moi:");
                    String nameUpdate = scanner.nextLine();
                    System.out.print("Chon email moi:");
                    String emailUpdate = scanner.nextLine();

                    if (userService.updateUser(id, nameUpdate, emailUpdate)) {
                        System.out.println("sua thanh cong");
                    } else {
                        System.out.println("khong ton tai nguoi dung co id= %d" + id);
                    }
                }


                case 4 -> {
                    System.out.println("--- DANG NHAP ---");
                    System.out.print("Username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Password: ");
                    String loginPassword = scanner.nextLine();

                    User currentUser = userService.login(loginUsername, loginPassword);
                    if (currentUser != null) {
                        System.out.println("Dang nhap thanh cong!, xin chao " + currentUser.getUsername());
                    } else {
                        System.out.println("Sai ten dang nhap hoac mat khau.");
                    }
                }


                case 5 -> {
                    System.out.println("___Dang ky___");
                    System.out.print("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String pass = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter status: ");
                    Boolean status = scanner.nextBoolean();

                    User newUser = new User(id, name, pass, email, role, status);
                    userService.addUser(newUser);
                    boolean registered = userService.register(newUser);
                    if (registered) {
                        System.out.println("Dang nhap thanh cong");
                    } else {
                        System.out.println("tai khoan da ton tai hoac ten dang nhap da ton tai");
                    }
                }
            }
        }
    }
}

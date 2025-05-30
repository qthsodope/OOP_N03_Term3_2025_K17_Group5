package utils;
import model.User;
import java.util.ArrayList;


public class Usermanager {
    ArrayList<User> ul = new ArrayList<User>();
    public ArrayList<User> addUser(User usl) {
        ul.add(usl);
        return ul;
    }

    public ArrayList<User> getEditUser(String username, int id) {
        for (int i = 0; i < ul.size();i++) {
            if (ul.get(i).getId() == id) {
                System.out.println("true");
                ul.get(i).setUsername(username);
                break;
            }
        }
        return ul;
    }
    public ArrayList<User> getDeleteUser(int id) {
        for (int i = 0; i < ul.size(); i++) {
            if (ul.get(i).getId() == id) {
                ul.remove(i);
                break;
            }
        }
        return ul;
    }
    public void printUserList() {
        int k = ul.size();
        for (int i = 0; i < k; i++) {
            System.out.println("ID: " + ul.get(i).getId() + " Username: " + ul.get(i).getUsername() +
                    " Password: " + ul.get(i).getPassword() + " Email: " + ul.get(i).getEmail());
        }
    }
}
package service;

import model.User;
import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();

    public boolean checkId(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public boolean addUser(User user) {
        if (checkId(user.getId())) {
            users.add(user);
            return true;
        }
        return false;
    }

    public boolean deleteUser(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                users.remove(u);
                return true;
            }
        }
        return false;
    }

    public boolean updateUser(int id, String username, String email) {
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                users.get(i).setUsername(username);
                users.get(i).setEmail(email);
                return true;
            }
        }
        return false;
    }


    public ArrayList<User> getAllUsers() {
        return users;
    }


    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }


    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)
                    && Boolean.TRUE.equals(u.getStatus())) {
                return u;
            }
        }
        return null;
    }


    public boolean register(User user) {
        if(getUserByUsername(user.getUsername()) != null) {
            return false;
        }

        if (checkId(user.getId())) {
            return false;
        }
        users.add(user);
        return true;
    }


}
package model;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String role;
    private Boolean status;


    public User() {}

    public User(int id, String username, String password, String email, String role, Boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public String toString() {
        return "user{" + "id: " + id + ", username: " + username + ", password: " + password + ", email: " + email + ", role: " + role + ", status: " + status + '}';
    }

}

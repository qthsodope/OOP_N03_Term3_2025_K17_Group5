package model;

public class User {
    private int id;                 // Mã định danh người dùng
    private String username;       // Tên đăng nhập
    private String password;       // Mật khẩu đã mã hoá
    private String email;          // Email liên hệ
    private String role;           // Vai trò: Admin, Staff, Client
    private boolean status;        // true: đang hoạt động, false: bị khoá

   public User(int id, String username, String password, String email, String role, boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email +
               ", role=" + role + ", status=" + status + "]";
    }
}

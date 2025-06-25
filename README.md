# 💻 Laptop Store – Spring Boot Project

Ứng dụng quản lý cửa hàng laptop với 2 vai trò:

- 👑 **Admin**: Quản lý sản phẩm, hãng, người dùng
- 🛒 **Client**: Xem sản phẩm, tìm kiếm, giỏ hàng cá nhân

---

## ✨ Tính năng

### Admin
- Đăng nhập, đăng xuất
- Thêm / sửa / xoá laptop
- Quản lý hãng sản xuất
- Xem danh sách người dùng

### Client
- Xem sản phẩm theo hãng
- Tìm kiếm theo tên, CPU, RAM
- Xem chi tiết, thêm vào giỏ hàng
- Chỉnh sửa hoặc xoá giỏ hàng

---

## 🛠️ Công nghệ sử dụng
- **Spring Boot** – Backend & cấu hình hệ thống  
- **Spring Security** – Xác thực & phân quyền  
- **JPA (Hibernate)** – ORM kết nối MySQL  
- **Thymeleaf** – View engine  
- **Bootstrap 5** – Giao diện người dùng  

---

## 👥 Thành viên nhóm

| Họ tên               | Vai trò                                     |
|----------------------|----------------------------------------------|
| **Nguyễn Quốc Thiên**   | Backend & phân quyền đăng nhập              |
| **Trần Đức Minh**       | CRUD sản phẩm & giao diện quản trị          |
| **Nghiêm Xuân Khánh**   | Giỏ hàng & giao diện người dùng             |

---

## ▶️ Hướng dẫn chạy nhanh

1. **Clone project**

```bash
git clone https://github.com/qthsodope/spring-boot-laptop-management.git
cd spring-boot-laptop-management
```

2. **Tạo database MySQL**

```sql
CREATE DATABASE laptopstore;
```

3. **Tạo file `application.properties` trong `src/main/resources`**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/laptopstore
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

4. **Chạy app trong IntelliJ**

Tìm file `LaptopstoreApplication.java` → bấm **Run**

---

📍 Mở trình duyệt: [http://localhost:8080](http://localhost:8080) để sử dụng ứng dụng.

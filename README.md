# Hệ Thống Quản Lý Cửa Hàng Laptop

Ứng dụng web chuyên nghiệp, phân quyền theo vai trò, được thiết kế để quản lý cửa hàng bán lẻ laptop. Hệ thống cung cấp các tính năng riêng biệt cho **Quản trị viên** và **Khách hàng**, đảm bảo tính bảo mật, khả năng mở rộng và trải nghiệm người dùng mượt mà.

---

## 🚀 Tính năng

### Vai trò Quản trị viên
- Đăng nhập và đăng xuất an toàn
- Thêm, sửa, xóa thông tin sản phẩm laptop
- Quản lý danh sách hãng sản xuất
- Xem và quản lý danh sách người dùng

### Vai trò Khách hàng
- Duyệt sản phẩm theo hãng sản xuất
- Tìm kiếm sản phẩm theo tên, CPU hoặc RAM
- Xem chi tiết thông số sản phẩm
- Thêm, chỉnh sửa hoặc xóa sản phẩm trong giỏ hàng cá nhân

---

## 🛠️ Công nghệ sử dụng
- **Spring Boot**: Xây dựng backend và cấu hình hệ thống
- **Spring Security**: Xác thực và phân quyền người dùng
- **JPA (Hibernate)**: ORM để kết nối cơ sở dữ liệu MySQL
- **Thymeleaf**: Công cụ tạo giao diện động
- **Bootstrap 5**: Thiết kế giao diện người dùng responsive và hiện đại

---

## 📋 Yêu cầu môi trường
- **Java**: 17 trở lên
- **Maven**: 3.8.x
- **MySQL**: 8.0 trở lên
- **IDE**: IntelliJ IDEA hoặc các IDE tương thích (Eclipse, VS Code)

---

## 👥 Thành viên nhóm

| Họ và tên             | Vai trò                                    |
|-----------------------|--------------------------------------------|
| **Nguyễn Quốc Thiên** | Backend & triển khai phân quyền đăng nhập  |
| **Trần Đức Minh**     | CRUD sản phẩm & phát triển giao diện quản trị |
| **Nghiêm Xuân Khánh** | Xây dựng giỏ hàng & giao diện khách hàng   |

---

## ▶️ Hướng dẫn triển khai

### 1. Tải mã nguồn
```bash
git clone https://github.com/qthsodope/spring-boot-laptop-management.git
cd spring-boot-laptop-management
```

### 2. Tạo cơ sở dữ liệu MySQL
```sql
CREATE DATABASE laptopstore;
```

### 3. Cấu hình file `application.properties`
Tạo file `application.properties` trong thư mục `src/main/resources` với nội dung:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/laptopstore
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Chạy ứng dụng
- Mở IntelliJ IDEA
- Tìm file `LaptopstoreApplication.java`
- Nhấn **Run** để khởi động ứng dụng

---

## 🌐 Truy cập ứng dụng
Mở trình duyệt và truy cập: [http://localhost:8080](http://localhost:8080)

---

## 📸 Giao diện ứng dụng
![Giao diện Quản trị viên](laptopstore/screenshots/admin.png)
![Giao diện Khách hàng](laptopstore/screenshots/client.png)

---

## 📝 Lưu ý
- Đảm bảo MySQL đã được cài đặt và chạy trên máy local.
- Thay `your_password` trong file `application.properties` bằng mật khẩu MySQL của bạn.
- Nếu gặp lỗi, kiểm tra các dependency trong file `pom.xml` hoặc liên hệ nhóm phát triển.

---

## 📧 Liên hệ
Nếu có thắc mắc hoặc cần hỗ trợ, vui lòng:

- Mở issue trên [GitHub](https://github.com/qthsodope/spring-boot-laptop-management/issues)
- Gửi email đến: [quocthien01082005@gmail.com](mailto:quocthien01082005@gmail.com)
- Kết nối qua LinkedIn: [Click here](https://www.linkedin.com/in/quoc-thien-nguyen/)
---

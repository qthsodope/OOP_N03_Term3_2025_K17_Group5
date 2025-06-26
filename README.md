# 💻 Hệ Thống Quản Lý Cửa Hàng Laptop

> Ứng dụng web chuyên nghiệp giúp quản lý cửa hàng bán lẻ laptop, hỗ trợ phân quyền rõ ràng giữa **Quản trị viên** và **Khách hàng**, đảm bảo bảo mật, dễ mở rộng và thân thiện với người dùng.

---

## 🔑 Chức Năng Chính

### 👨‍💼 Quản trị viên
- 🔐 Đăng nhập / Đăng xuất an toàn  
- 🧾 Thêm, sửa, xóa, tìm kiếm sản phẩm laptop  
- 🏷️ Quản lý hãng sản xuất

### 🛒 Khách hàng
- 🧭 Duyệt sản phẩm theo hãng  
- 🔍 Tìm kiếm theo tên, CPU hoặc RAM  
- 📄 Xem chi tiết sản phẩm  
- 🛍️ Thêm / sửa / xóa sản phẩm trong giỏ hàng cá nhân  

---

## ⚙️ Công Nghệ Sử Dụng

| Thành phần    | Công nghệ                                      |
|---------------|------------------------------------------------|
| Backend       | Spring Boot, Spring Security, JPA (Hibernate)  |
| Frontend      | Thymeleaf, Bootstrap 5                         |
| Cơ sở dữ liệu | MySQL 8.x                                      |
| Build Tool    | Maven 3.8+                                     |
| Java          | Java 17 trở lên                                |

---

## 📋 Môi Trường Cần Thiết

- Java 17 trở lên  
- Maven 3.8+  
- MySQL 8+  
- IDE khuyên dùng: IntelliJ IDEA / Eclipse / VS Code

---

## 🚀 Hướng Dẫn Cài Đặt

### 1️⃣ Tải mã nguồn

```bash
git clone https://github.com/qthsodope/spring-boot-laptop-management.git
cd spring-boot-laptop-management
```

### 2️⃣ Tạo cơ sở dữ liệu MySQL

```sql
CREATE DATABASE laptopstore;
```

### 3️⃣ Cấu hình kết nối cơ sở dữ liệu

Tạo file `application.properties` trong `src/main/resources`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/laptopstore
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

> 💡 Thay `your_password` bằng mật khẩu MySQL thực tế của bạn.

### 4️⃣ Chạy ứng dụng

- Mở bằng IntelliJ IDEA hoặc IDE tương thích  
- Chạy file `LaptopstoreApplication.java`  
- Truy cập: [http://localhost:8080](http://localhost:8080)

---

## 🖼️ Giao Diện Thực Tế

| Quản trị viên                             | Khách hàng                               |
|-------------------------------------------|-------------------------------------------|
| ![Admin UI](laptopstore/screenshots/admin.png) | ![Client UI](laptopstore/screenshots/client.png) |

---

## 👨‍💻 Thành Viên Nhóm

| Họ và tên             | Vai trò                                |
|------------------------|-----------------------------------------|
| **Nguyễn Quốc Thiên** | Backend & phân quyền đăng nhập          |
| **Trần Đức Minh**     | CRUD sản phẩm & giao diện quản trị      |
| **Nghiêm Xuân Khánh** | Giỏ hàng & giao diện người dùng         |

---

## 📌 Ghi Chú

- Đảm bảo MySQL đã được cài đặt và đang chạy trên máy bạn.  
- Nếu gặp lỗi, kiểm tra lại `application.properties` và các dependency trong `pom.xml`.

---

## 📬 Liên Hệ

- GitHub Issues: [Click here](https://github.com/qthsodope/spring-boot-laptop-management/issues)  
- Email: [quocthien01082005@gmail.com](mailto:quocthien01082005@gmail.com)  
- LinkedIn: [Click here](https://www.linkedin.com/in/quoc-thien-nguyen)

---

🎉 *Cảm ơn bạn đã sử dụng hệ thống! Nếu thấy hữu ích, hãy cho chúng tôi một ⭐ trên GitHub!*

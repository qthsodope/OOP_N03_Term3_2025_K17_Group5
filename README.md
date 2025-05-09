# 💻 Phần Mềm Quản Lý Máy Tính Bán Lẻ - Java OOP + MySQL + GUI

## 📌 Giới thiệu

Đây là một ứng dụng quản lý máy tính bán lẻ được xây dựng bằng ngôn ngữ **Java**, áp dụng mô hình **lập trình hướng đối tượng (OOP)**, kết nối với **cơ sở dữ liệu MySQL**, và có **giao diện đồ họa người dùng (GUI)** sử dụng thư viện **Swing**.

Ứng dụng cho phép người dùng quản lý thông tin sản phẩm như: thêm, sửa, xoá, tìm kiếm và sắp xếp sản phẩm. Tất cả thao tác đều thực hiện thông qua giao diện và được lưu trữ trong cơ sở dữ liệu MySQL.

## 📌 Thành viên

1. Nguyễn Quốc Thiên  
2. Trần Đức Minh  
3. Nghiêm Xuân Khánh

## 🧱 Công nghệ sử dụng

- ✅ Ngôn ngữ: **Java**
- 🛠 IDE: **IntelliJ IDEA**
- 💻 Giao diện: **Swing**
- 💾 Cơ sở dữ liệu: **MySQL**
- 🔌 Kết nối DB: **JDBC**

---

## ✅ Tổng hợp nội dung từ Câu 1 đến Câu 5

### 📌 Câu 1. Tiêu đề bài tập lớn

**Phần mềm quản lý máy tính bán lẻ**  
Ứng dụng hỗ trợ quản lý sản phẩm, người dùng và đơn hàng cho cửa hàng máy tính. Hệ thống có phân quyền theo 3 vai trò: Admin, Staff và Client.

---

### 📌 Câu 2. Phân tích 3 đối tượng chính

- **User**: chứa thông tin người dùng như `username`, `password`, `email`, `role` (vai trò), và `status`.
- **Product**: đại diện sản phẩm, có các thuộc tính như `name`, `description`, `price`, `categoryId`, `brandId`, `stockQuantity`.
- **Order**: đại diện đơn hàng, gồm `userId`, `createdAt`, `status`, và `totalAmount`.

---

### 📌 Câu 3. Cấu trúc thư mục
src/
- model/     (Chứa các class như Product, User, Order)
- dao/       (Làm việc với cơ sở dữ liệu)
- service/   (Xử lý logic nghiệp vụ)
- utils/     (Hàm tiện ích: DB, định dạng, kiểm tra...)
- view/      (Giao diện người dùng - Swing)
- test/      (Chứa các class kiểm thử)
- Main.java  (File chạy chính của chương trình)

---

### 📌 Câu 4. Các class đã viết

Đã tạo 3 class chính trong `src/model/`:

- `User.java`: quản lý thông tin người dùng  
- `Product.java`: quản lý thông tin sản phẩm  
- `Order.java`: quản lý đơn hàng  

Mỗi class đều có đầy đủ:
- Các thuộc tính theo yêu cầu
- Constructor khởi tạo dữ liệu
- Getter và Setter cho mỗi thuộc tính
- Phương thức `toString()` để in thông tin đối tượng

---

### 📌 Câu 5. Các class kiểm thử

Đã viết 3 class kiểm thử đơn giản trong thư mục `src/test/`:

- `ProductTest.java`: kiểm tra tạo sản phẩm, cập nhật giá và tồn kho  
- `UserTest.java`: kiểm tra trạng thái hoạt động và thay đổi role  
- `OrderTest.java`: kiểm tra cập nhật trạng thái và tổng tiền đơn hàng  

👉 Vì một số lý do, nên hiện tại các class kiểm thử sử dụng `main()` để chạy trực tiếp, **không sử dụng JUnit**.

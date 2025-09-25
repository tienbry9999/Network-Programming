<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>
<h2 align="center">
    HỆ THỐNG QUẢN LÝ NGÂN HÀNG MINI
</h2>
<div align="center">
    <p align="center">
        <img alt="AIoTLab Logo" width="170" src="https://github.com/user-attachments/assets/711a2cd8-7eb4-4dae-9d90-12c0a0a208a2" />
        <img alt="AIoTLab Logo" width="180" src="https://github.com/user-attachments/assets/dc2ef2b8-9a70-4cfa-9b4b-f6c2f25f1660" />
        <img alt="DaiNam University Logo" width="200" src="https://github.com/user-attachments/assets/77fe0fd1-2e55-4032-be3c-b1a705a1b574" />
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20Technology-blue?style=for-the-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

---

## 1. Giới thiệu hệ thống
Hệ thống **MiniBank** gồm 2 tiến trình:  
- **Server**: xử lý nghiệp vụ tài khoản, giao dịch và phản hồi yêu cầu.  
- **Client**: ứng dụng giao diện **Java Swing** cho người dùng.  

Các chức năng chính:  
- Đăng nhập / Đăng ký tài khoản  
- Nạp tiền, Rút tiền, Chuyển khoản  
- Xem số dư, Lịch sử giao dịch, Đổi mật khẩu  
- Đăng xuất, kết thúc phiên  

Kết nối **Client ↔ Server** qua **TCP Socket** với giao thức chuỗi lệnh (`LOGIN`, `SIGNUP`, `XEM`, `GUI`, `RUT`, `CHUYEN`, `HISTORY`, `LOGOUT`).  

---

## 2. Ngôn ngữ & Công nghệ sử dụng
<div align="center">

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Swing](https://img.shields.io/badge/Java%20Swing-5382a1?style=for-the-badge&logo=java&logoColor=white)]()
[![Socket](https://img.shields.io/badge/TCP%20Socket-black?style=for-the-badge)]()
[![JDK](https://img.shields.io/badge/JDK-8%2B-green?style=for-the-badge)]()

</div>

---

## 3. Hình ảnh các chức năng
![alt text](image-7.png)
<p align="center">
  <br/>
  <em>Hình 1. Giao diện đăng nhập</em><br/>
</p>

---
![alt text](image-8.png)
<p align="center">
  <br/>
  <em>Hình 2. Giao diện đăng ký</em><br/>
</p>

---
![alt text](image-9.png)
<p align="center">
  <br/>
  <em>Hình 3. Màn hình chính trang chủ</em><br/>
</p>

---
![alt text](image-10.png)
<p align="center">
  <br/>
  <em>Hình 4. Giao diện chuyển khoản</em><br/>
</p>

---
![alt text](image-11.png)
<p align="center">
  <br/>
  <em>Hình 5. Lịch sử giao dịch</em><br/>
</p>

---
![alt text](image-12.png)
<p align="center">
  <br/>
  <em>Hình 6. Quản lý khách hàng</em><br/>
</p>

## 4. Các bước cài đặt
1. **Cài đặt môi trường**  
   - JDK 8 trở lên  
   - IDE: IntelliJ IDEA / Eclipse / VS Code hoặc terminal  

2. **Biên dịch & chạy chương trình**  
   ```bash
   # Biên dịch
   javac MiniBank/*.java

   # Chạy server
   java MiniBank.ServerMain

   # Chạy client
   java MiniBank.ClientLogin
Sử dụng ứng dụng

Đăng ký hoặc đăng nhập tài khoản

Nạp tiền, Rút tiền, Chuyển khoản

Xem số dư, Lịch sử giao dịch, Đổi mật khẩu
## 5. Thông tin liên hệ 
Họ tên: Đỗ Trọng Minh Tiến

Lớp: CNTT 16-03

Email: dotrongminhtien.qc2004@gmail.com

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.




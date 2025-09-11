<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>
<h2 align="center">
   Hệ thống quản lý ngân hàng mini
</h2>
<div align="center">
    <p align="center">
        <img src="docs/aiotlab_logo.png" alt="AIoTLab Logo" width="170"/>
        <img src="docs/fitdnu_logo.png" alt="AIoTLab Logo" width="180"/>
        <img src="docs/dnu_logo.png" alt="DaiNam University Logo" width="200"/>
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20Technology-blue?style=for-the-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

# 🏦 Hệ thống quản lý ngân hàng mini

## 📖 1. Giới thiệu
Đề tài **“Hệ thống quản lý ngân hàng mini”** được xây dựng bằng **Java (Swing)** trên **Eclipse IDE**.  
Hệ thống mô phỏng các nghiệp vụ cơ bản trong ngân hàng như đăng nhập, quản lý tài khoản, nạp tiền, rút tiền, chuyển tiền và theo dõi lịch sử giao dịch.  

Mục tiêu:
- Giúp sinh viên rèn luyện kỹ năng lập trình hướng đối tượng với Java.  
- Thực hành xây dựng ứng dụng có giao diện đồ họa (GUI) với Swing.  
- Hiểu rõ quy trình quản lý tài khoản và xử lý giao dịch ngân hàng ở mức đơn giản.  

---

## 🔧 2. Công nghệ và ngôn ngữ sử dụng
- [![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)  
- IDE: **Eclipse IDE for Java Developers**  
- GUI: **Java Swing**  
- Lưu trữ dữ liệu: sử dụng **HashMap** (mô phỏng database trong bộ nhớ).  

---

## 🚀 3. Chức năng chính
- 👤 **Đăng nhập**: người dùng nhập username và password để vào hệ thống.  
- 💳 **Quản lý tài khoản**: hiển thị số dư, nạp tiền, rút tiền.  
- 💰 **Chuyển tiền**: chuyển khoản giữa các tài khoản trong hệ thống.  
- 📜 **Lịch sử giao dịch**: lưu lại và hiển thị các giao dịch đã thực hiện.  
- 🔒 **Xử lý dữ liệu tạm thời**: sử dụng HashMap để quản lý thông tin người dùng và giao dịch.  

---

## 🏗️ 4. Cấu trúc project

MiniBank/
└─ src/
   └─ MiniBank/
      ├─ MainApp.java       # 🚀 Điểm khởi động chương trình
      ├─ LoginScreen.java   # 🔑 Màn hình đăng nhập
      ├─ Dashboard.java     # 📊 Màn hình chính (quản lý tài khoản & giao dịch)
      ├─ Transaction.java   # 💰 Lớp mô tả giao dịch
      ├─ User.java          # 👤 Lớp mô tả người dùng (username, password, balance)
      └─ Utils.java         # 🛠️ Tiện ích (format tiền tệ, xử lý chung)


## ▶️ 5. Cách chạy project trên Eclipse
1. Clone hoặc tải project về máy.  
2. Mở **Eclipse IDE** → Import → Existing Project → trỏ đến thư mục `MiniBank`.  
3. Chạy file `MainApp.java`.  
4. Màn hình đăng nhập sẽ hiện ra → nhập username và password (mặc định cấu hình trong `MainApp.java` hoặc `User.java`).  

---

## 📚 6. Hướng phát triển
- Thay thế HashMap bằng **cơ sở dữ liệu SQLite/MySQL** để lưu dữ liệu thật.  
- Bổ sung chức năng quản lý nhiều người dùng, phân quyền (admin/user).  
- Nâng cấp giao diện thân thiện hơn với **JavaFX** hoặc chuyển sang ứng dụng web.  
- Tích hợp thêm chức năng tính lãi suất, quản lý khoản vay.  

---

## 📝 7. License
© 2025 [Tên nhóm hoặc khoa của bạn]. All rights reserved.
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
        <img src="docs/aiotlab_logo.png" alt="AIoTLab Logo" width="170"/>
        <img src="docs/fitdnu_logo.png" alt="AIoTLab Logo" width="180"/>
        <img src="docs/dnu_logo.png" alt="DaiNam University Logo" width="200"/>
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20Technology-blue?style=for-the-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

📖 **1. Giới thiệu hệ thống**  

Ứng dụng **MiniBank** được xây dựng bằng **Java Swing** cho phép người dùng quản lý tài khoản ngân hàng cá nhân với các chức năng **nạp tiền, rút tiền, chuyển khoản, xem thông tin và quản lý lịch sử giao dịch**.  

**Hệ thống bao gồm:**  
- **LoginScreen**: giao diện đăng nhập và đăng ký tài khoản mới.  
- **Dashboard**: giao diện chính sau khi đăng nhập, hiển thị số dư và lịch sử giao dịch.  
- **User & Transaction**: mô hình dữ liệu người dùng và giao dịch.  
- **Utils**: xử lý lưu trữ dữ liệu vào file nhị phân (`users.dat`).  

**Các chức năng chính:**  
- 🔑 **Đăng nhập & Đăng ký tài khoản**  
- 💵 **Nạp tiền vào tài khoản**  
- 🏧 **Rút tiền từ tài khoản**  
- 💳 **Chuyển khoản giữa các tài khoản**  
- ℹ️ **Xem thông tin tài khoản**  
- 🔑 **Đổi mật khẩu**  
- 📜 **Quản lý và hiển thị lịch sử giao dịch**  
- 🚪 **Đăng xuất/Thoát ứng dụng**  

---

🔧 **2. Công nghệ sử dụng**  

Ứng dụng **MiniBank** được xây dựng với các công nghệ sau:  

**Java Core**  
- **OOP** để xây dựng các lớp `User`, `Transaction`, `Utils`.  
- **Collections** (`HashMap`, `ArrayList`) để quản lý danh sách tài khoản và lịch sử giao dịch.  

**Java Swing**  
- `JFrame`: **cửa sổ chính** của ứng dụng.  
- `JLabel`, `JButton`, `JTextField`, `JPasswordField`: **các thành phần nhập/xuất dữ liệu**.  
- `JTable` + `DefaultTableModel`: **hiển thị lịch sử giao dịch**.  
- `JOptionPane`: **hiển thị thông báo và dialog nhập liệu**.  

**Lưu trữ dữ liệu**  
- **Serialization** (`ObjectOutputStream`, `ObjectInputStream`) để **lưu và đọc dữ liệu** từ file `users.dat`.  
- Dữ liệu bao gồm **thông tin người dùng, số dư, và lịch sử giao dịch**.  

**Hỗ trợ**  
- `java.time.LocalDateTime`: tạo **timestamp cho mỗi giao dịch**.  
- `java.text.DecimalFormat`: định dạng **tiền tệ (#,### VND)**.  
- `Random`: sinh **số tài khoản 8 chữ số ngẫu nhiên**.  

---

🚀 **3. Hình ảnh các chức năng**  

📌 (Thêm ảnh chụp màn hình **Login, Dashboard, lịch sử giao dịch, chuyển khoản...**)  

---

📝 **4. Hướng dẫn cài đặt và sử dụng**  

**🔧 Yêu cầu hệ thống**  
- **Java Development Kit (JDK)**: phiên bản 8 trở lên  
- **Hệ điều hành**: Windows, macOS, Linux  
- **IDE**: Eclipse, IntelliJ IDEA, VS Code hoặc terminal  
- **RAM**: tối thiểu 512MB  
- **Ổ đĩa**: khoảng 10MB  

**📦 Cài đặt và triển khai**  

- **Bước 1: Chuẩn bị môi trường**  
  Kiểm tra Java:  
  ```bash
  java -version
  javac -version
Đảm bảo kết quả hiển thị Java 8 trở lên.

Tải mã nguồn: thư mục MiniBank chứa các file:

MainApp.java

LoginScreen.java

Dashboard.java

User.java

Transaction.java

Utils.java

- **Bước 2: Biên dịch mã nguồn** 

bash
Copy code
javac MiniBank/*.java
Nếu thành công, sẽ tạo ra các file .class.

- **Bước 3: Chạy ứng dụng** 

bash
Copy code
java MiniBank.MainApp
Ứng dụng sẽ hiển thị màn hình đăng nhập.

🚀 Sử dụng ứng dụng

🔑 Đăng nhập: nhập tên tài khoản và mật khẩu đã đăng ký.

🆕 Đăng ký: tạo tài khoản mới, hệ thống sinh số tài khoản ngẫu nhiên.

💵 Nạp tiền: chọn "Nạp tiền", nhập số tiền.

🏧 Rút tiền: chọn "Rút tiền", nhập số tiền.

💳 Chuyển khoản: nhập số tài khoản người nhận và số tiền.

ℹ️ Xem thông tin: chọn "Thông tin TK".

🔑 Đổi mật khẩu: thay đổi mật khẩu hiện tại.

📜 Xem lịch sử giao dịch: bảng hiển thị chi tiết giao dịch ngay trên giao diện chính.

🚪 Thoát: chọn "Thoát".

👤 Thông tin cá nhân

Họ và tên: Đỗ Trọng Minh Tiến

Lớp: CNTT 16-03

Email: dotrongminhtien.qc2004@gmail.com

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.
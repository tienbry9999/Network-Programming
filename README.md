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

Ứng dụng **MiniBank** được xây dựng bằng **Java (Swing + Socket)** theo mô hình **Client–Server**, cho phép người dùng quản lý tài khoản ngân hàng cá nhân với các chức năng: **đăng nhập, đăng ký, nạp tiền, rút tiền, chuyển khoản, đổi mật khẩu, xem số dư và lịch sử giao dịch**.  

**Hệ thống bao gồm:**  
- **Server.java**: chạy dịch vụ ngân hàng, quản lý dữ liệu tài khoản & khách hàng, xử lý lệnh từ client.  
- **ClientLogin.java**: giao diện đăng nhập/đăng ký.  
- **ClientMain.java** (hoặc `ClientDashboard`): giao diện chính sau khi đăng nhập (nạp/rút/chuyển tiền, xem lịch sử).  
- **AccountInfo.java**: lớp quản lý tài khoản (số dư, mật khẩu, lịch sử giao dịch).  
- **Tệp dữ liệu**:  
  - `accounts.txt`: lưu thông tin tài khoản.  
  - `customers.txt`: lưu thông tin khách hàng.  
  - `server_port.txt`: cổng server đang chạy.  

**Các chức năng chính:**  
- 🔑 **Đăng nhập & Đăng ký tài khoản**  
- 💵 **Nạp tiền vào tài khoản**  
- 🏧 **Rút tiền từ tài khoản**  
- 💳 **Chuyển khoản giữa các tài khoản**  
- ℹ️ **Xem số dư và thông tin tài khoản**  
- 🔑 **Đổi mật khẩu**  
- 📜 **Quản lý và hiển thị lịch sử giao dịch**  
- 👥 **Quản lý khách hàng (thêm, sửa, xóa, lấy danh sách)**  
- 🚪 **Đăng xuất/Thoát ứng dụng**  

---

🔧 **2. Công nghệ sử dụng**  

- **Java Core**  
  - **OOP** để xây dựng các lớp `AccountInfo`, `Customer`.  
  - **Collections** (`HashMap`, `ArrayList`, `Collections.synchronizedMap`) để quản lý dữ liệu.  
  - **I/O** (`BufferedReader`, `PrintWriter`, `FileReader`, `FileWriter`) để lưu/đọc dữ liệu từ file.  

- **Java Networking**  
  - **ServerSocket / Socket** để giao tiếp **client–server**.  
  - Giao thức tùy chỉnh với các lệnh (`LOGIN`, `SIGNUP`, `DEPOSIT`, `WITHDRAW`, `TRANSFER`, `BALANCE`, `HISTORY`, …).  

- **Java Swing**  
  - `JFrame`, `JTabbedPane`, `JButton`, `JTextArea`, `JTextField`, `JPasswordField`.  
  - `JOptionPane` để hiển thị thông báo.  
  - `CardLayout` để chuyển đổi giữa login/signup.  

- **Thư viện hỗ trợ**  
  - `java.time.LocalDateTime` để tạo timestamp cho lịch sử giao dịch.  
  - `Collections.synchronizedMap` & `synchronized` methods để đảm bảo **thread-safe**.  

---

🚀 **3. Hình ảnh giao diện**  

<p align="center">
  <img src="images/login.png" alt="Giao diện đăng nhập" width="500"/>
  <br>
  <em>Hình 1. Giao diện đăng nhập</em>
</p>

<p align="center">
  <img src="images/signup.png" alt="Giao diện đăng ký" width="500"/>
  <br>
  <em>Hình 2. Giao diện đăng ký</em>
</p>

<p align="center">
  <img src="images/dashboard.png" alt="Giao diện chính" width="500"/>
  <br>
  <em>Hình 3. Giao diện chính (Dashboard)</em>
</p>

<p align="center">
  <img src="images/transfer.png" alt="Giao diện chuyển khoản" width="500"/>
  <br>
  <em>Hình 4. Giao diện chuyển khoản</em>
</p>

<p align="center">
  <img src="images/history.png" alt="Xem lịch sử giao dịch" width="500"/>
  <br>
  <em>Hình 5. Lịch sử giao dịch</em>
</p>

---

📝 **4. Hướng dẫn cài đặt và sử dụng**  

**🔧 Yêu cầu hệ thống**  
- **JDK**: 8 trở lên  
- **OS**: Windows / macOS / Linux  
- **IDE**: IntelliJ IDEA, Eclipse, VS Code, hoặc chạy bằng terminal  

**📦 Triển khai**  

- **Bước 1: Biên dịch toàn bộ source**  
  ```bash
  javac MiniBank/*.java
Bước 2: Khởi động server

bash
Copy code
java MiniBank.Server
Server sẽ chọn một cổng trống và ghi vào file server_port.txt.

Bước 3: Khởi động client

bash
Copy code
java MiniBank.ClientLogin
Client sẽ đọc cổng từ server_port.txt và kết nối tới server.

🚀 Sử dụng ứng dụng

Đăng nhập bằng tài khoản đã đăng ký hoặc tạo tài khoản mới.

Thực hiện các thao tác nạp tiền, rút tiền, chuyển khoản, đổi mật khẩu.

Xem số dư hiện tại và lịch sử giao dịch ngay trên giao diện.

Quản lý thông tin khách hàng (dành cho admin).

👤 Thông tin tác giả

Họ và tên: Đỗ Trọng Minh Tiến

Lớp: CNTT 16-03

Email: dotrongminhtien.qc2004@gmail.com

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.
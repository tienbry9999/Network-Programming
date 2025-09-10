package MiniBank;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private HashMap<String, User> users;

    public LoginScreen(HashMap<String, User> users) {
        this.users = users;
        setTitle("MiniBank - Đăng Nhập");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("Tên đăng nhập:");
        gbc.gridx = 0; gbc.gridy = 0;
        add(userLabel, gbc);

        usernameField = new JTextField(20);
        gbc.gridx = 1;
        add(usernameField, gbc);

        JLabel passLabel = new JLabel("Mật khẩu:");
        gbc.gridx = 0; gbc.gridy = 1;
        add(passLabel, gbc);

        passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        add(passwordField, gbc);

        JButton eyeBtn = new JButton("👁");
        gbc.gridx = 2;
        add(eyeBtn, gbc);
        eyeBtn.addActionListener(e -> {
            if(passwordField.getEchoChar() != '\u0000'){
                passwordField.setEchoChar('\u0000');
            } else {
                passwordField.setEchoChar('*');
            }
        });

        JButton loginBtn = new JButton("Đăng nhập");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 3;
        add(loginBtn, gbc);

        JButton registerBtn = new JButton("Đăng ký");
        gbc.gridy = 3;
        add(registerBtn, gbc);

        JButton exitBtn = new JButton("Thoát");
        gbc.gridy = 4;
        add(exitBtn, gbc);

        loginBtn.addActionListener(e -> login());
        registerBtn.addActionListener(e -> register());
        exitBtn.addActionListener(e -> System.exit(0));
    }

    private void login() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        if(users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            new Dashboard(users.get(username), users);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void register() {
        JTextField newUser = new JTextField();
        JPasswordField newPass = new JPasswordField();
        JTextField balanceField = new JTextField();

        JButton eyeBtn = new JButton("👁");
        eyeBtn.addActionListener(e -> {
            if(newPass.getEchoChar() != '\u0000'){
                newPass.setEchoChar('\u0000');
            } else {
                newPass.setEchoChar('*');
            }
        });

        JPanel passPanel = new JPanel(new BorderLayout());
        passPanel.add(newPass, BorderLayout.CENTER);
        passPanel.add(eyeBtn, BorderLayout.EAST);

        Object[] message = {
                "Tên đăng nhập:", newUser,
                "Mật khẩu:", passPanel,
                "Số dư ban đầu:", balanceField
        };

        int option = JOptionPane.showConfirmDialog(this, message, "Đăng ký tài khoản mới", JOptionPane.OK_CANCEL_OPTION);
        if(option == JOptionPane.OK_OPTION) {
            String username = newUser.getText().trim();
            String password = new String(newPass.getPassword()).trim();
            double balance;
            try {
                balance = Double.parseDouble(balanceField.getText().trim());
                if(balance < 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Số dư không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập và mật khẩu không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(users.containsKey(username)) {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                User newUserObj = new User(username, password, balance);
                users.put(username, newUserObj);
                Utils.saveUsers(users); // lưu ra file
                JOptionPane.showMessageDialog(this, "Tạo tài khoản thành công!");
            }
        }
    }
}

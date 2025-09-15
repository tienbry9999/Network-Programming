package MiniBank;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;

public class Dashboard extends JFrame {
    private User user;
    private HashMap<String, User> users;
    private JLabel balanceLabel;
    private DefaultTableModel tableModel;

    public Dashboard(User user, HashMap<String, User> users) {
        this.user = user;
        this.users = users;

        setTitle("MiniBank - Trang chính");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel welcome = new JLabel("Xin chào, " + user.getUsername());
        welcome.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(welcome, gbc);

        balanceLabel = new JLabel("Số dư: " + Utils.formatCurrency(user.getBalance()));
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 1;
        add(balanceLabel, gbc);

        JButton napTienBtn = new JButton("Nạp tiền");
        gbc.gridy = 2; gbc.gridwidth = 1; gbc.gridx = 0;
        add(napTienBtn, gbc);

        JButton rutTienBtn = new JButton("Rút tiền");
        gbc.gridx = 1;
        add(rutTienBtn, gbc);

        JButton chuyenTienBtn = new JButton("Chuyển khoản");
        gbc.gridx = 0; gbc.gridy = 3;
        add(chuyenTienBtn, gbc);

        JButton exitBtn = new JButton("Thoát");
        gbc.gridx = 1;
        add(exitBtn, gbc);

        String[] columns = {"Thời gian", "Loại giao dịch", "Số tiền"};
        tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(700,200));
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        add(scrollPane, gbc);

        napTienBtn.addActionListener(e -> napTien());
        rutTienBtn.addActionListener(e -> rutTien());
        chuyenTienBtn.addActionListener(e -> chuyenTien());
        exitBtn.addActionListener(e -> System.exit(0));

        updateHistory();
        setVisible(true);
    }

    private void napTien() {
        String input = JOptionPane.showInputDialog(this, "Nhập số tiền nạp (VND):");
        if(input == null) return;
        double amount;
        try {
            amount = Double.parseDouble(input.trim());
            if(amount <= 0) throw new NumberFormatException();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Số tiền không hợp lệ! Chỉ nhập số lớn hơn 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        user.napTien(amount);
        Utils.saveUsers(users);
        capNhatSoDu();
        updateHistory();
        JOptionPane.showMessageDialog(this, "Nạp tiền thành công!");
    }

    private void rutTien() {
        String input = JOptionPane.showInputDialog(this, "Nhập số tiền rút (VND):");
        if(input == null) return;
        double amount;
        try {
            amount = Double.parseDouble(input.trim());
            if(amount <= 0) throw new NumberFormatException();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Số tiền không hợp lệ! Chỉ nhập số lớn hơn 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(user.rutTien(amount)) {
            Utils.saveUsers(users);
            capNhatSoDu();
            updateHistory();
            JOptionPane.showMessageDialog(this, "Rút tiền thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Số dư không đủ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void chuyenTien() {
        JTextField nguoiNhanField = new JTextField();
        JTextField soTienField = new JTextField();
        Object[] message = {
                "Tên người nhận:", nguoiNhanField,
                "Số tiền (VND):", soTienField
        };
        int option = JOptionPane.showConfirmDialog(this, message, "Chuyển khoản", JOptionPane.OK_CANCEL_OPTION);
        if(option == JOptionPane.OK_OPTION) {
            String nguoiNhan = nguoiNhanField.getText().trim();
            String soTienText = soTienField.getText().trim();

            if(nguoiNhan.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên người nhận không được để trống!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double amount;
            try {
                amount = Double.parseDouble(soTienText);
                if(amount <= 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Số tiền không hợp lệ! Chỉ nhập số lớn hơn 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(!users.containsKey(nguoiNhan)) {
                JOptionPane.showMessageDialog(this, "Người nhận không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            User receiver = users.get(nguoiNhan);
            if(user.chuyenTien(receiver, amount)) {
                Utils.saveUsers(users);
                capNhatSoDu();
                updateHistory();
                JOptionPane.showMessageDialog(this, "Chuyển khoản thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Số dư không đủ để chuyển!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void capNhatSoDu() {
        balanceLabel.setText("Số dư: " + Utils.formatCurrency(user.getBalance()));
    }

    private void updateHistory() {
        tableModel.setRowCount(0);
        for(Transaction t : user.getHistory()) {
            tableModel.addRow(new Object[]{t.getTime(), t.getType(), Utils.formatCurrency(t.getAmount())});
        }
    }
}

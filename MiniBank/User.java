package MiniBank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String username;
    private String password;
    private double balance;
    private List<Transaction> history;

    public User(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public double getBalance() { return balance; }
    public List<Transaction> getHistory() { return history; }

    public void napTien(double amount) {
        balance += amount;
        history.add(new Transaction("Nạp tiền", amount));
    }

    public boolean rutTien(double amount) {
        if(amount > balance) return false;
        balance -= amount;
        history.add(new Transaction("Rút tiền", amount));
        return true;
    }

    public boolean chuyenTien(User nguoiNhan, double amount) {
        if(amount > balance) return false;
        balance -= amount;
        nguoiNhan.napTien(amount);
        history.add(new Transaction("Chuyển tiền tới " + nguoiNhan.getUsername(), amount));
        return true;
    }
}

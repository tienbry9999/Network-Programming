package MiniBank;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        HashMap<String, User> users = Utils.loadUsers(); // đọc dữ liệu từ file
        new LoginScreen(users).setVisible(true);
    }
}

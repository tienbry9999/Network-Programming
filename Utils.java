package MiniBank;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Utils {
    private static final String FILE_NAME = "users.dat";

    public static void saveUsers(HashMap<String, User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static HashMap<String, User> loadUsers() {
        File file = new File(FILE_NAME);
        if(!file.exists()) return new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (HashMap<String, User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    // Format số tiền kiểu ngân hàng (ví dụ: 1.234.567 VND)
    public static String formatCurrency(double amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(amount) + " VND";
    }
}

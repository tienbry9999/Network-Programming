package MiniBank;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction implements Serializable {
    private String type;
    private double amount;
    private String time;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getTime() { return time; }
}

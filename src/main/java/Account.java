import java.util.ArrayList;
import java.util.List;

// Abstract parent class
abstract class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        if (holder == null || holder.isBlank()) {
            throw new IllegalArgumentException("Holder name cannot be blank");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit cannot be negative");
        }

        balance += amount;
    }

    // Allows subclasses to modify the balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void processMonth();

    public void printSummary() {
        IO.println(holder + " | Balance: " + balance + " kr");
    }
}

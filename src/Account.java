import java.util.Scanner;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + " manat hesabınıza əlavə olundu.");
        } else {
            System.out.println("Məbləğ müsbət olmalıdır!");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println(amount + " manat hesabınızdan çəkildi.");
            } else {
                System.out.println("Hesabınızda kifayət qədər vəsait yoxdur!");
            }
        } else {
            System.out.println("Məbləğ müsbət olmalıdır!");
        }
    }
}







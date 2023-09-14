public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500.0);
        account.withdraw(200.0);
    }
}

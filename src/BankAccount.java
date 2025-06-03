// Encapsulation example with a bank account
class BankAccount {
    // Private balance variable
    private double balance;

    // Setter to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Getter to check balance
    public double getBalance() {
        return balance;
    }
}

// Main class
//public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//
//        // Deposit money
//        account.deposit(1000.0);
//
//        // Check balance
//        System.out.println("Account balance: $" + account.getBalance());
//    }
//}

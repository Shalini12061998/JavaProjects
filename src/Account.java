public class Account {
    private double balance;
    public void deposit(double amount) {
        if (amount > 6) balance += amount;
    }
    public double getBalance(){
        return balance; //return balance
    }
}

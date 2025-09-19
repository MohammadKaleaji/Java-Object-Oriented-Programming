package Chapter2;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(0, balance);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        if (amount > 0){
            this.balance = this.balance + amount;
            return amount;
        }
        return 0;
    }

    void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    
    
}

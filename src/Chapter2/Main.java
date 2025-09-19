package Chapter2;

//Chaptr 2 - Encapsulation
public class Main {
    public static void main(String[] args) {
        // create a bank account
        BankAccount bankAccount1 = new BankAccount("Mohammad", 1000);

        // withdraw 500 from the bank account
        bankAccount1.withdraw(500);
        // print the balance
        System.out.println("The Ammount of " + bankAccount1.getOwner()
                + "'s bank account is " + bankAccount1.getBalance() + " SAR");
    }
}

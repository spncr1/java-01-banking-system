// Class for bank operations (balance, deposit, withdraw etc.)
import java.util.*;

public class BankAccount {
    
    private double balance;
    private Scanner scanner;

    public BankAccount (Scanner scanner) {
        this.balance = 0.0; //initialise WITH VALUE (i.e., 0.0 in this cae)
        this.scanner = scanner;
    }
    
    public double checkBalance () {
        return balance;
    }

    void deposit () {
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("You cannot deposit that amount");
        }

        System.out.println("You deposited $" + amount); // confirmation of deposit
    }

    void withdraw () {
        double amount = scanner.nextDouble();
        
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("You withdrew $" + amount); // confirmation of withdrawal
        } else {
            System.out.print("Your withdrawal declined due to insufficient funds");
        }
    }   

    void logout () {
        System.out.println("Logging out...");
        System.out.println("Have a nice day "); //+ (user that was logged in) - need a variable for this, or a method I can call that retrieves this value
    }

}
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

    //for all account actions, I need to handle non-numeric data inputs too, so that instead of a mismatchexception, a message is just printed to the screen, and the user is redirected to try again

    void deposit () {

        //within this, a try-catch exception would be better suited to handle this, but i don't know how to use one YET, so i won't include it in this program until a later stage to improve it's overall functionality
        while (true) {
            System.out.println("How much would you like to deposit? ");
            double amount = scanner.nextDouble();

            boolean lowerThanZero = false;

            if (amount <= 0) {
                System.out.println("Amount must be greater than zero. Please try again.");
                lowerThanZero = true;
            } 

            if (!lowerThanZero) {
                balance = balance + amount;
                System.out.println("You deposited $" + amount + ". Your new balance is: $" + balance); // confirmation of deposit
                break;
            }
            
        }
        
    }

    void withdraw () {
        while(true) {
            System.out.println("How much would you like to withdraw? ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Amount must be greater than zero. Please try again.");
            } else if (amount > balance) {
                System.out.println("Your withdrawal declined due to insufficient funds. Please try again.");
            } else {
                balance -= amount;
                System.out.println("You withdrew $" + amount + ". Your new balance is: $" + balance); // confirmation of withdrawal
                break;
        }
      }
    }
}
// Manages all users, login/authentication, data persistence etc.
import java.util.*;

public class BankSystem {

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    BankAccount account = new BankAccount();

        /*switch (choice) { // placeholder for the switch case needed to implemnent printMenu() functionality - currently calling an error, so see how I can fix this later
            case 1: 
                account.checkBalance();
                break;
            case 2: 
                account.deposit();
                break;
            case 3:
                account.withdraw();
                break;
            case 4:
                System.out.print("Logging out...");
                break;
            default:
                System.out.print("Invalid choice");
        }*/

    void createAccount() {
        String username;
        String password;

        System.out.println("--- Create New Account ---");
        
        System.out.print("Please create a username: ");
        username = scanner.nextLine();
        
        System.out.print("Please create a password: ");
        password = scanner.nextLine();
    }

    void userLogin() {
        String username;
        String password;
        
        System.out.println("--- User Login ---");
        
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
        
    }

    void printMenu() {
        System.out.println();
        System.out.println("--- Welcome (user)! ---");//(user) is a placeholder for 
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Logout");
    }
}
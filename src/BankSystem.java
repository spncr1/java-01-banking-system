// Manages all users, login/authentication, data persistence etc.
import java.util.*;

public class BankSystem {

    Scanner scanner = new Scanner(System.in);

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
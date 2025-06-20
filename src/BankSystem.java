// Manages all users, login/authentication, data persistence etc.
import java.util.*;
import java.util.List;

public class BankSystem {
    private List<User> users; //using this to keep track of and store all the users created in the system (will come back and check if this is handling duplicate accounts correctly later)
    private User currentUser;
    private Scanner scanner;

    public BankSystem (Scanner scanner) {
        this.users = new ArrayList<>();
        this.currentUser = null;
        this.scanner = scanner;
    }

    //method for handling user input for their choice (once logged in)
    public void userSelection () {

        while (true) {
            printMenu();

        System.out.println("");
        System.out.print("Enter a choice (1-4): ");
        int choice = scanner.nextInt();
        
        BankAccount account = currentUser.getAccount();

            switch (choice) {
                case 1: 
                    System.out.println("Your current balance is $" + account.checkBalance());
                    break;
                case 2: 
                    System.out.println("How much would you like to deposit? ");
                    account.deposit();
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw? ");
                    account.withdraw();
                    break;
                case 4:
                    System.out.print("Logging out...");
                    currentUser = null; // why is this null?
                    break;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
    
    // Account Creation
    public void createAccount() {
        scanner.nextLine();
        System.out.println("--- Create New Account ---");
        
        System.out.print("Please create a username: ");
        String username = scanner.nextLine();
        
        System.out.print("Please create a password: ");
        String password = scanner.nextLine();

        User newUser = new User(username, password, new BankAccount(scanner));

        //confirmation message for new account creation
        System.out.println("New Account Created Successfully!");
    }

    // 
    void userLogin() {
        scanner.nextLine();
        System.out.println("--- User Login ---");
        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        //iterating through list of users to identify if an account has already been created with the username entered by the user as input
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successful! Welcome" + currentUser.getUsername());
            } else {
                System.out.println("Login failed. Please check your credentials");
            }
        }
    }

    void printMenu() {
        System.out.println();
        System.out.println("--- Welcome " + currentUser.getUsername() + "! What would you like to do? ---");//(user) is a placeholder for user's name
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Logout");
    }
}
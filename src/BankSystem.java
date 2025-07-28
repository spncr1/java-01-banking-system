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
        if (currentUser == null) {
            System.out.println("No user has been created yet.");
            return;
        }

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
                    account.deposit();
                    break;
                case 3:
                    account.withdraw();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    System.out.println("Have a nice day " + currentUser.getUsername() + " :)"); // could be a placeholder for an emoji or something later
                    currentUser = null;
                    return; //returns user to main menu (entry point in Main class)
                default:
                    System.out.print("Your choice is invalid. Please try again.");
            }
        }
    }
    
    // Account Creation
    public void createAccount() {
        System.out.println("--- Create New Account ---");

        String username;
        
        //this is basic functionality, potential to redirect to the userLogin() method instead, so user can sign in instead of create a new account with a username that already exists
        while (true) {
            int letterCount = 0;
            
            System.out.print("Please create a username: ");
            username = scanner.nextLine();

            for (char c : username.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCount++;
                }
            }

            if (letterCount < 3) {
                System.out.println("Username must contain at least 3 letters (a-z or A-Z)");
                continue;
            }

            if (username.isEmpty()) {
                System.out.println("Username cannot be blank. Please try again.");
                continue;
            } else if (username.length() < 3) {
                System.out.println("Username must be at least 3 characters long.");
                continue;
            } else if (!username.matches("[a-zA-Z0-9_]+")) {
                System.out.println("Username can only contain letters, numbers, and underscores.");
                continue;
            }

            boolean usernameExists = false;
            //check if a username already exists in the DB system
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("A user already exists with username: " + user.getUsername() + "! Please enter a different username.");
                    usernameExists = true;
                    break;
                }
            }

            if (!usernameExists) {
                break;
            }
        }
        
        System.out.print("Please create a password: ");
        String password = scanner.nextLine();

        User newUser = new User(username, password, new BankAccount(scanner));
        users.add(newUser);
        this.currentUser = newUser; //sets the user that is currently logged in to current user (in this case a new user to the banking system, they create an account)

        //confirmation message for new account creation
        System.out.println("New Account Created Successfully!");
    }

    //User Login (pre-existing user)
    public boolean userLogin() {
        //we use isEmpty() to check if the array storing user account information is empty first, and if it is, we yell at the user and tell them to create an account before trying to use login function
        if (users.isEmpty()) {
            System.out.println("No users exist in the system yet! You can't log in to any accounts! Please create an account first.");
            return false;
        }

        while (true) {
            System.out.println("--- User Login ---");
            
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            //iterating through list of users to identify if an account has already been created with the username entered by the user as input
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    this.currentUser = user;
                    System.out.println("Login successful! Welcome " + currentUser.getUsername());
                    return true;
                }
            }

            System.out.println("Username or password is incorrect. Please try again.");
            continue;
        }
    }

    void printMenu() {
        System.out.println();
        System.out.println("--- Welcome " + currentUser.getUsername() + "! What would you like to do? ---");//(user) is a placeholder for user's name
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Logout & Return to Main Menu");
    }
}
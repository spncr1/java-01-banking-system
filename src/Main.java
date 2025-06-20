// Entry point (menu, CLI loop etc.)
import java.util.*;

public class Main {

    //variable declaration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("*** Welcome to SimpleBank! ***");
        System.out.println("How may we help you?");
        printMenu();
        
        System.out.println("");
        System.out.print("Enter a choice (1-3): ");
        int choice = scanner.nextInt();//trailing newline here somewhere (fix later)

        //objects declaration
        BankSystem bankSystem = new BankSystem(scanner);

        switch (choice) {
            case 1: 
                bankSystem.createAccount();
                //bankSystem.printMenu();
                break;
            case 2: 
                bankSystem.userLogin();
                //bankSystem.printMenu();
                break;
            case 3:
            System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
        scanner.close();
    }

    static void printMenu() {
        System.out.println("");
        System.out.println("*** Main Menu ***");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

}
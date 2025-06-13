// Entry point (menu, CLI loop etc.)
import java.util.*;

public class Main {

    //variable declaration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Welcome to SimpleBank! ---");
        System.out.println("How may we help you?");
        printMenu();

        //objects declaration
        BankSystem bankSystem = new BankSystem();

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                System.out.println();
                bankSystem.createAccount();
                bankSystem.printMenu();
                break;
            case 2: 
            System.out.println();
                bankSystem.userLogin();
                bankSystem.printMenu();
                break;
            case 3:
            System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    static void printMenu() {
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

}
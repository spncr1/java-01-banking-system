// Entry point (menu, CLI loop etc.)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //objects declaration
        Scanner scanner = new Scanner(System.in);
        BankSystem bankSystem = new BankSystem(scanner);

        while (true) {
        System.out.println("");
        System.out.println("*** Welcome to SimpleBank! ***");
        System.out.println("How may we help you?");
        printMenu();
        
        System.out.println("");
        System.out.print("Enter a choice (1-3): ");
        int choice = scanner.nextInt();//trailing newline here somewhere (fix later)
        scanner.nextLine();

        switch (choice) {
            case 1: 
                bankSystem.createAccount();
                bankSystem.userSelection();
                break;
            case 2: 
                if (bankSystem.userLogin()) {
                    bankSystem.userSelection();
                }
                break;
            case 3:
                System.out.println("Exiting...");
                System.out.println("Thank you for choosing SimpleBank!");
                return;//this doesn't exit now for some reason...?
            default:
                System.out.println("Your choice is invalid. Please try again.");
        }
    }
}

    static void printMenu() {
        System.out.println("");
        System.out.println("*** Main Menu ***");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

}
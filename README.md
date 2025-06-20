-- Overview --
This is a console-based banking system built using Java. The purpose of this project is to simulate basic banking operations in a secure and user-friendly manner. It provides core functionalities such as account creation, login, viewing account balance, depositing and withdrawing money, and exiting the application. The system also applies object-oriented programming principles and prepares for future enhancements such as data persistence, authentication, and GUI support.
This project is designed to help reinforce concepts such as class design, inheritance, encapsulation, exception handling, and clean code structure using separation of concerns.

-- Features to Implement (Initial Phase) --
Core Functionalities:

#Create Account
- Users can create a new account with a unique username and password.
- The system checks for duplicate usernames and provides an error message if a username is already taken.

#Login System
- Users can log in using previously created credentials.
- The system verifies usernames and passwords against stored account data.

#Exit Program
- Users can exit the application gracefully, with an exit message triggered by conditional logic.

#Account Operations (Post-Login)
- Check Balance: Displays the current account balance.
- Deposit: Allows the user to add money to their account.
- Withdraw: Allows the user to withdraw money, with logic to prevent overdrawing.
- Logout: Ends the session and returns the user to the main menu or exits the program.

-- Planned Implementation Steps --
1. Declare variables required to manage user input, account data, and menu selections.

2. Display a menu using a reusable method that shows the available options to the user.

3. Capture user input to determine which operation they wish to perform.

4. Implement main operations using the following methods:
- checkBalance()
- deposit()
- withdraw()
- logout() (ends session or returns to main menu)

5. Create an exit message that appears when the user chooses to exit the application.

-- User Account Requirements --
- Both must meet specified conditions (e.g., minimum length, no special characters, etc.).
- This validation logic will be added in a later step of the development process.
- In early versions, account data may be stored in memory.
- Future versions will implement file-based or database persistence for storing user data.

-- Future Enhancements (add later) --
- 
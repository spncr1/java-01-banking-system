# SimpleBank Java CLI

A simple command-line Java banking application for creating accounts, logging in, and managing balances.

## Table of Contents
- [Description](#description)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Folder Structure](#folder-structure)
- [License](#license)
- [Author](#author)

## Description

**SimpleBank Java CLI** is a terminal-based banking system built in Java. It allows users to create accounts, log in securely, and perform basic banking operations like checking balances, depositing, and withdrawing money.  
The project was designed to practice Object-Oriented Programming (OOP) fundamentals and clean code structure, which is why logic is separated into multiple classes: `User`, `BankAccount`, `BankSystem`, and the `Main` entry point.  
This modular approach makes the code more readable, maintainable, and scalable, and demonstrates good software engineering practices for real-world Java applications.

## Features

- 🔹 Create new user accounts with unique usernames and passwords
- 🔹 Secure login and logout functionality
- 🔹 Deposit and withdraw money with input validation
- 🔹 Check account balance
- 🔹 Clean, menu-driven CLI with clear user feedback

## Getting Started

### Prerequisites
- Java 17 or later
- No external dependencies required

### Installation

```bash
git clone https://github.com/yourusername/simplebank-java-cli.git
cd simplebank-java-cli
```

### Running the App

Compile and run from the command line:

```bash
javac Main.java BankSystem.java User.java BankAccount.java
java Main
```

## Usage

1. Start the application.
2. Choose to create an account or log in.
3. Once logged in, use the menu to check your balance, deposit, or withdraw funds.
4. You can log out and return to the main menu at any time.

**Sample terminal session:**

```text
*** Welcome to SimpleBank! ***
How may we help you?

*** Main Menu ***
1. Create Account
2. Login
3. Exit

Enter a choice (1-3): 1
Please create a username: alice
Please create a password: *****
New Account Created Successfully!

--- Welcome alice! What would you like to do? ---
1. Check Balance
2. Deposit
3. Withdraw
4. Logout & Return to Main Menu

Enter a choice (1-4): 2
How much would you like to deposit? 
100
You deposited $100.0. Your new balance is: $100.0
```

## Folder Structure

```bash
java-banking-system-cli/
├── Main.java
├── BankSystem.java
├── User.java
├── BankAccount.java
└── README.md
```

## License

Licensed under the MIT License. See `LICENSE` for more info.

## Author

Spencer Fisher

[https://github.com/spncr1](https://github.com/spncr1) | Portfolio
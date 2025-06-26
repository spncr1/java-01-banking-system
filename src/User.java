// Class representing each user cretaed, handling personal details such as usernames, and passwords
/* --- TEST USERS ---
User1: spncr1
Password: Summer88

User2: spncr2
Password: Summer66
 */

public class User {
    private String username;
    private String password; //I definitely need a way of covering the user's passoword with "*" once they enter it, so that when it appears on screen it's just "*" instead
    private BankAccount account;

    public User (String username, String password, BankAccount account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }   

    public String getUsername () {
        return username;
    }

    public String getPassword () {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }
     
}
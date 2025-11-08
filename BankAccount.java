public class BankAccount {
// Instance variables
private String accountNumber;
private String accountHolderName;
private double balance;

// Constructor to initialize the values
public BankAccount(String accountNumber, String accountHolderName, double balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}

// Method to deposit money
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposit of " + amount + " successful.");
} else {

System.out.println("Invalid deposit amount.");
}
displayBalance();
}

// Method to withdraw money if balance is sufficient
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Withdrawal of " + amount + " successful.");
} else {
System.out.println("Insufficient balance or invalid amount.");
}
displayBalance();
}

// Method to display current balance
public void displayBalance() {
System.out.println("Current Balance: " + balance);
}

// Main method to test the class
public static void main(String[] args) {
// Creating an object of BankAccount
BankAccount myAccount = new BankAccount("1234567890", "John Doe", 5000.0);

// Performing transactions

myAccount.deposit(1500.0); // Deposit operation
myAccount.withdraw(2000.0); // Withdraw operation
myAccount.withdraw(6000.0); // Attempt to overdraw
myAccount.deposit(-500); // Invalid deposit
}
}
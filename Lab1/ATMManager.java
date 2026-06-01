/**
 * Lab Day 1: Bank Account and ATM Management
 * Purpose: Simulate ATM operations (balance check, deposit, withdrawal) using class separation.
 * Author: Ahmad Ali
 */
import java.util.Scanner;

class AccountManager {
    private double balance = 5000.0; // Initial balance

    // Function to check balance
    public double getBalance() {
        return balance;
    }

    // Function to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Function to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: Rs. " + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class ATMManager {
    public static void main(String[] args) {
        AccountManager account = new AccountManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextDouble();
                    account.deposit(depAmt);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmt = sc.nextDouble();
                    account.withdraw(withAmt);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
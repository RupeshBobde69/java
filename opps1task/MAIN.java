package opps1task;

import java.util.*;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("enter the account holder name:");
        String accountHolder = scanner.nextLine();
        System.out.println("enter the initial balance:");   
        double initialBalance = scanner.nextDouble();
        // Create a new bank account
        scanner.close();
        BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
        System.out.println("Bank account created successfully for " + accountHolder + " with account number " + accountNumber);
        
        // Display initial balance
        System.out.println("Initial Balance: ₹" + account.checkBalance());
        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: ₹" + account.checkBalance());
        
        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: ₹" + account.checkBalance());
        
        // Attempt to withdraw more than the balance
        account.withdraw(200000.0);

    }
}

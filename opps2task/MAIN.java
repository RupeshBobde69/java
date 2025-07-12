package opps2task;

import java.util.Scanner;

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
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, initialBalance, 4.0);
        savingsAccount.addInterest(); // Adding interest to the savings account
        System.out.println("Bank account created successfully for " + accountHolder + " with account number " + accountNumber);
        
        // Display initial balance
        System.out.println("Initial Balance: ₹" + savingsAccount.getBalance());
        // Deposit money
        savingsAccount.deposit(500.0);
        System.out.println("Balance after deposit: ₹" + savingsAccount.getBalance());
        
        // Withdraw money
        savingsAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: ₹" + savingsAccount.getBalance());
        
        // Attempt to withdraw more than the balance
        savingsAccount.withdraw(200.0);

    }
}

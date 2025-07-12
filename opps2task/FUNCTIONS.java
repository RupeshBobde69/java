package opps2task;

class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
}

// Child class (Subclass)
class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    
    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: ₹" + interest);
    }
    
    @Override
    public void withdraw(double amount) {
        // Minimum balance requirement for savings account
        if (balance - amount >= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of ₹1000 required.");
        }
    }
}

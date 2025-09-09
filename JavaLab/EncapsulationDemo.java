class BankAccount {
    private String accountNumber;
    private double balance;

    // Getter & Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("123456789");
        myAccount.deposit(5000.00);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: $" + myAccount.getBalance());
    }
}

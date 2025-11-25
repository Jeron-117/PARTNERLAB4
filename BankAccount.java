public class BankAccount {
    private static int accountNumberSeed =0;
    private int accountNumber;
    private double balance;
    private StringBuilder getStatement;
    
    BankAccount() {
        balance = 0.0;
        accountNumber = accountNumberSeed++;
        transactions = new StringBuilder;
        transactions.append(" " + accountNumber);
        transactions.append(/n);
        transactions.append(" " + balance);
        transactions.append(/n);
    }

    public BankAccount(double amount) {
        balance = amount;
    }

    void setBalance(double amount) {
        balance = amount;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("amt cant be neg");
        }
        else if (amount > balance) {
            throw new Exception("not enuf funds");
        }
        else {
            balance -= amount;
            transactions.append("Date: ");
            transactions.append("Deposited " + amount);
        }
    }

    void printStatement() {
        
    }

    

}



public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientFundsException, NumberFormatException {
        if (amount > balance) {
            throw new InsufficientFundsException("You don't have enough funds to withdraw this amount! Try again.");
        }
        balance-=amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}

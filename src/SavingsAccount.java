public class SavingsAccount extends BankAccount {

    private double interestRate;
    private double minBalance;

    public SavingsAccount() {
        interestRate = 0;
        minBalance = 0;
    }

    /**
     * Sets the interest rate for this account.
     * @param rate the monthly interest rate in percent
     * */
    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    // These methods override superclass methods
    public void withdraw(double amount) {
        super.withdraw(amount);
        double balance = getBalence();
        if (balance < minBalance) {
            minBalance = balance;
        }
    }
    public void monthEnd() {
        double interest = minBalance * interestRate / 100;
        deposit(interest);
        minBalance = getBalence();
    }

}

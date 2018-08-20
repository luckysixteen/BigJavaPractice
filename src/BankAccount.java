public class BankAccount {
    private double balence;

    public BankAccount () {
        balence = 0;
    }

//    public BankAccount (double initialBalence) {
//        balence = initialBalence;
//    }

    public void deposit(double amount) {
        balence = balence + amount;
    }

    public void withdraw(double amount) {
        balence = balence - amount;
    }

    public void monthEnd() {
        /**
         * Gets the current balance of this bank account.
         * @return the current balance
         * */
    }

    public double getBalence() {
        return balence;
    }
}

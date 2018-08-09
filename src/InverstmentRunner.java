import java.time.Year;
import java.util.Random;

/**
 * This program computes ho long it takes for an investment to double.
 * */
public class InverstmentRunner {
    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        final int YEARS = 20;

        Inverstment invest = new Inverstment(INITIAL_BALANCE, RATE);

//        invest.waitForBalance(2* INITIAL_BALANCE);
//        int years = invest.getYear();
//        System.out.println("The investment doubled after " + years + " years.");

        invest.waitYears(YEARS);
        double balance = invest.getBalance();
        System.out.printf("The balance after %d years is $%.2f\n", YEARS, balance);
    }
}

import javax.swing.*;
import java.util.Scanner;

/**
 * [How to 4.1] Carrying out Computations
 * */
public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        // Use input dialog box
        String input1 = JOptionPane.showInputDialog("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
        int billValue = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Enter item price in pennies: ");
        int itemPrice = Integer.parseInt(input2);

        // Basic input
        /*System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
        int billValue = in.nextInt();
        System.out.print("Enter item price in pennies: ");
        int itemPrice = in.nextInt();*/

        // Compute change due

        int changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quarterCoins = changeDue / PENNIES_PER_QUARTER;

        // Print change due

        System.out.printf("Dollar coins: %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quarter coins:%6d", quarterCoins);
    }
}
/**
 * This class tests the CashRegister class.
 */
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        register.recordePurchase(0.75);
        register.recordePurchase(1.50);
        register.receivePayment(2,0,5,0,0);

        System.out.print("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 0.25");

        register.recordePurchase(2.25);
        register.recordePurchase(19.25);
        register.receivePayment(23,2,0,0,0);

        System.out.print("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 2.0");
    }
}

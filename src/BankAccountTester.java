public class BankAccountTester {
    /**
     * Tests the methods of the BankAccount class.
    */
    public static void main(String[] args) {
        BankAccount harrysChechking = new BankAccount();
        harrysChechking.deposit(2000);
        harrysChechking.withdraw(500);
        System.out.println(harrysChechking.getBalence());
        System.out.println("Expected: 1500");
    }
}

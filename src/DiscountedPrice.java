import java.util.Scanner;

public class DiscountedPrice {

    public static void main(String[] args) {
        final double LOWDISCOUNT = 0.08;
        final double HIGHDISCOUNT = 0.16;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the original price: $");
        double originalPrice = in.nextDouble();
        double discountedPrice;

        if (originalPrice < 128) {
            discountedPrice = originalPrice * (1 - LOWDISCOUNT);
        }
        else {
            discountedPrice = originalPrice * (1 - HIGHDISCOUNT);
        }

        System.out.printf("The discounted price is $%.2f", discountedPrice);
    }
}

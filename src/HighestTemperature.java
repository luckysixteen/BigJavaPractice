import java.util.Scanner;

public class HighestTemperature {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperatures of January: ");
        double highestValue = in.nextDouble();
        int highestMonth = 1;

        for (int currentMonth = 2; currentMonth <= 12; currentMonth++) {
            System.out.print("Enter the next month's temperature: ");
            double nextValue = in.nextDouble();
            if (nextValue > highestValue) {
                highestValue = nextValue;
                highestMonth = currentMonth;
            }
        }

        System.out.println("The highest temperature is %" + highestValue);
        System.out.println("The highest Month is " + highestMonth);
    }
}

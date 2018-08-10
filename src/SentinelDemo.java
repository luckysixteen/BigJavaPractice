import java.util.Scanner;

public class SentinelDemo {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double salary = 0;
        System.out.print("Enter salaries, -1 to finish: ");
        Scanner in = new Scanner(System.in);

        // Process data until the sentinel is entered

        while (salary != -1) {
            salary = in.nextDouble();
            System.out.print("Enter salaries, -1 to finish: ");
            if (salary != -1) {
                sum += salary;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Average salary: %.2f", average);
        }
        else {
            System.out.println("No data");
        }
    }
}

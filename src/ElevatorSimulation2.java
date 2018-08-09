import java.util.Scanner;

public class ElevatorSimulation2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Floor: ");
        if (in.hasNextInt()) {
            int floor = in.nextInt();

            if (floor == 13) {
                System.out.println("Error: There is no thirteenth floor.");
            }
            else if (floor <= 0 || floor >20) {
                System.out.println("Error: The floor must be between 1 and 20.");
            }
            else {
                int actualFloor = floor;
                if (floor > 13) {
                    actualFloor--;
                }

                System.out.println("The elevator will travel to the actual floor " + actualFloor);
            }
        }
        else {
            System.out.println("Error: Not an integer.");
        }
    }
}

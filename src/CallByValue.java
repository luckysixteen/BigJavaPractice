import java.awt.Point;

public class CallByValue {

    public static void tricky(Point arg1, Point arg2) {
        arg1.x = 100;
        arg1.y = 100;
        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;

        System.out.println("Inside func arg1 x: " + arg1.x + ", y: " + arg1.y);
        System.out.println("Inside func arg2 x: " + arg2.x + ", y: " + arg2.y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        System.out.println("p1 x: " + p1.x + ", y: " + p1.y);
        System.out.println("p2 x: " + p2.x + ", y: " + p2.y);

        tricky(p1, p2);

        System.out.println("p1 x: " + p1.x + ", y: " + p1.y);
        System.out.println("p2 x: " + p2.x + ", y: " + p2.y);
    }
}

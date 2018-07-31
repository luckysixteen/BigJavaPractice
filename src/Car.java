import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {

    private int xLeft;
    private int yTop;

    /**
     * Construct a car with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     **/
    public Car(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draw the car.
     * @param g2 the graphics context
     **/
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft+10, yTop+20, 10,10);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft+40, yTop+20, 10,10);

        Point2D.Double p1 = new Point2D.Double(xLeft+10, yTop+10);
        Point2D.Double p2 = new Point2D.Double(xLeft+20, yTop);
        Point2D.Double p3 = new Point2D.Double(xLeft+40, yTop);
        Point2D.Double p4 = new Point2D.Double(xLeft+50, yTop+10);

        Line2D.Double frontWindow = new Line2D.Double(p1, p2);
        Line2D.Double roofTop = new Line2D.Double(p2, p3);
        Line2D.Double rearWindow = new Line2D.Double(p3, p4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);

        g2.draw(frontWindow);
        g2.draw(roofTop);
        g2.draw(rearWindow);
    }
}

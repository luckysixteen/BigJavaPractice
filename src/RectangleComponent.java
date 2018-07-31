import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        /*Rectangle box = new Rectangle(5, 10, 20, 30);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(5, 10, 20, 30);

        Point2D.Double from = new Point2D.Double(5, 50);
        Point2D.Double to = new Point2D.Double(50, 50);
        Line2D.Double segment = new Line2D.Double(from, to);


        g2.draw(box);
        g2.draw(ellipse);
        g2.draw(segment);
        g2.drawString("Message", 5, 50);*/

        Rectangle rect = new Rectangle(5,5,10,10);
        Rectangle rect2 = rect;
        Rectangle rect3 = new Rectangle(rect);
        rect.translate(10,10);

        g2.draw(rect);
        g2.draw(rect2);
        g2.draw(rect3);

    }
}

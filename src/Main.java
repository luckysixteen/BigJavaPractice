import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.awt.*;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test port:");

        /**
         * Test big number types.
         */
        BigInteger n = new BigInteger("10000000");
        BigInteger r = n.multiply(n);
        System.out.println(r);

        BigDecimal d = new BigDecimal("4.35");
        BigDecimal e = new BigDecimal("100");
        BigDecimal f = d.multiply(e);
        System.out.println(f);

        /**
         * A simple drawing board.
         */
        /*JFrame frame = new JFrame();

        frame.setSize(300,400);
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        frame.setVisible(true);*/

        /**
         * Test the reference property of String type in Java.
         */
        /*String str = "Morning";
        String str2 = "Morning";
        String str3 = new String("Adress");
        System.out.println(Integer.toHexString(str.hashCode()));
        System.out.println(Integer.toHexString(str2.hashCode()));*/

        /**
         * Date interval between the date of birth and the present time.
         */
        /*int birthYr = 95;
        int birthMth = 1;
        int birthDy = 17;
        Date birth = new Date(birthYr, birthMth, birthDy);
        Date present = new Date();

        long betweenDay = ((present.getTime() - birth.getTime())/(1000*60*60*24));

        System.out.println("Begin: " + birth);
        System.out.println("End: " + present);
        System.out.println("Interval days: " + betweenDay);*/
    }
}

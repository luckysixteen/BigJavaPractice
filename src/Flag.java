import java.awt.*;

public class Flag {

    private int xLeft;
    private int yTop;
    private int width;

    /**
     * Construct a flag with given left top corner and width.
     * @param x the x-coordinate of the left top corner
     * @param y the y-coordinate of the left top corner
     * @param w the width of the flag
     */
    public Flag(int x, int y, int w) {
        xLeft = x;
        yTop = y;
        width = w;
    }

    /**
     * Draw the flag.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Rectangle leftColor = new Rectangle(xLeft, yTop, width/3, width*2/3);
        Rectangle rightColor = new Rectangle(xLeft + 2*width/3, yTop, width/3, width*2/3);
        Rectangle wholeFlag = new Rectangle(xLeft, yTop, width, width*2/3);

        g2.setColor(Color.GREEN);
        g2.fill(leftColor);
        g2.setColor(Color.RED);
        g2.fill(rightColor);
        g2.setColor(Color.BLACK);
        g2.draw(wholeFlag);
    }
}

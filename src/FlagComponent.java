import javax.swing.*;
import java.awt.*;

public class FlagComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Flag italianFlag = new Flag(100,100,90);
        italianFlag.draw(g2);
    }
}

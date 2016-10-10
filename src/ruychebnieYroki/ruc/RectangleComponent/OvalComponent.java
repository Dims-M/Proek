package ruychebnieYroki.ruc.RectangleComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 19.09.2016.
 */
public class OvalComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);


    }
}
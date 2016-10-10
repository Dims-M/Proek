package ruychebnieYroki.ruc.RectangleComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 19.09.2016.
 */
public class RectangleComponent extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }


}

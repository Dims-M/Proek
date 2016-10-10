package ruychebnieYroki.rus.OvalComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 19.09.2016.
 */
public class OvalComponent extends JComponent {

    // Переопределяем метод рисованиая, в который передается
    // объект класса Graphics
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Используем Graphics для рисования овала
        // с отступами
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);

    }

}

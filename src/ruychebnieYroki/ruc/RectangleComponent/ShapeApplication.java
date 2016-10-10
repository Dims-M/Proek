package ruychebnieYroki.ruc.RectangleComponent;

import javax.swing.*;

/**
 * Created by Администратор on 19.09.2016.
 */
public class ShapeApplication {

    public static void main(String[] args) {
        // Создаем графическое окно
        ShapeFrame of = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }


}

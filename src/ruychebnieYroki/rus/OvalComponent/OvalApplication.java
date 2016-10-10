package ruychebnieYroki.rus.OvalComponent;

import javax.swing.*;

/**
 * Created by Администратор on 19.09.2016.
 */
public class OvalApplication {

    public static void main(String[] args) {
        // Создаем графическое окно
        OvalFrame of = new OvalFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }

}

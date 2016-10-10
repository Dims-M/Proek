package ruychebnieYroki.rus.OvalComponent;
import javax.swing.JFrame;
/**
 * Created by Администратор on 19.09.2016.
 */
public class OvalFrame extends JFrame {

    public OvalFrame() {
        // Создаем объект типа OvalComponent
        OvalComponent oc = new OvalComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);

        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }

}

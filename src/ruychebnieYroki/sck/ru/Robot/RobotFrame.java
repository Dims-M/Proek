package ruychebnieYroki.sck.ru.Robot;

import javax.swing.*;

/**
 * Created by Администратор on 20.09.2016.
 */
public class RobotFrame  extends JFrame{

public RobotFrame(Robot robot){

    setTitle("Окно Робота");
    // добавляем компонент для рисования пути робота
    add( new RobotPathComponent(robot));
    // указываем размер окна
    setBounds(100,100,500,500);
}

}

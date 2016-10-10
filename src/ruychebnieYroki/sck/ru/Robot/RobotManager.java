package ruychebnieYroki.sck.ru.Robot;

import javax.swing.*;

/**
 * Created by Администратор on 20.09.2016.
 */
public class RobotManager {

    public static void main(String[] args) {
        //количество сторон многоугольника
        final int COUNT = 5;
        //стороны/ длина стороны
        final int SIDE =100;

        Robot robot = new Robot(200,50);

        //
        for (int i = 0; i < COUNT; i++){
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse()+450/COUNT);
        }

        //рисуем форму для отрисовки пути
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);


    }

}

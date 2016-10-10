package ruychebnieYroki.ru.MoiRobotu;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ruychebnieYroki.ru.UrokiPoknigi.RaznieMetodi.rabota123;
import static ruychebnieYroki.ru.UrokiPoknigi.RaznieMetodi.rabotaSDatoi;

/**
 * Created by Администратор on 09.08.2016.
 */
public class Mail {

    public static void main(String[] args) {

        RobotTotal robotTotal = new RobotTotal(10, 50);

        robotTotal.getTotalDistance();
        robotTotal.printCoordinates();

        robotTotal.forward(54);
        robotTotal.getTotalDistance();


        //rabotaSDatoi(); // Рабочие методы
       // rabota123 ();


    } // конец метода майл


} ///// конец класса
package ruychebnieYroki.ru.UrokiPoknigi.ru.PotopiSait;

import ruychebnieYroki.ru.UrokiPoknigi.ru.VsakieClassi.Clock;

import java.util.ArrayList;

/**
 * Created by Администратор on 22.07.2016.
 */
public class MyArreyList {  // Работа с аррей листами


    public static void MoyArreyList () {
        System.out.println("Работаем с ArreyList ми")
        ;
        ArrayList<Clock> myList1 = new ArrayList<Clock>();

        Clock clock = new Clock();
        Clock clock1 = new Clock();

        myList1.add(clock);
        myList1.add(clock1);

        int MoaSize = myList1.size(); // переменной присваеваем числовое значение размера аррей листа
        System.out.println("Количество объектов в ArreyList = " + MoaSize);

        boolean Moaboolean = myList1.contains(clock); // Выесняем содержится что ли бо в этом объекте
        System.out.println("Узнаем содержится ли что то в объекте = " + Moaboolean);

        int MoaIndex = myList1.indexOf(clock); // узнаем в каком индексе находится объект слок
       // int MoaIndex = myList1.indexOf(clock1); // узнаем в каком индексе находится объект слок
        System.out.println("Обьект clock находится под индексом " +MoaIndex );


    }

} // конец класса

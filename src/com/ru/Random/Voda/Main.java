package com.ru.Random.Voda;

import javafx.scene.chart.PieChart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Администратор on 12.01.2017.
 */
public class Main  {

    public static void main(String[] args) throws ParseException {

        // Вывод даты
       // vivodDati();

        strokaDate ();

    }// Конец


    public static void vivodDati() {
        System.out.println("Вывод времени.");
        // С помощью форматирования

        Date nasha = new Date();
        // Обьект для работы с датей.

        // C помощью этого типа работаем с форматирование даты
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("'Date: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");
        // указываем какие параметры форматирования использовать.

        // Вывод даты

        System.out.println("Текущая дата " + nasha.toString());
        // Вывод времени. В качестве параметра передается обьект для работы с датой
        System.out.println("Дата" + dateFormat.format(nasha));
    }

    public static void strokaDate () throws ParseException {

        Date nashaDate = new Date();
        // Создали обьект для работ с датой

        String string = "24.01.2016";

        SimpleDateFormat formatNashaDate = new SimpleDateFormat();
        // Объект для предварительного форматирования и вывода Даты

        formatNashaDate.applyPattern("dd.MM.yyyy");
        // Паттерн или шаблон как нужно выводить(отображать) дату

        //Создали обьект для сохранения даты в переменную типа Дата
        Date tempDate ;

        tempDate = formatNashaDate.parse(string);

        //Вывод даты

        System.out.println(tempDate);


    }


} // Конец метода майн
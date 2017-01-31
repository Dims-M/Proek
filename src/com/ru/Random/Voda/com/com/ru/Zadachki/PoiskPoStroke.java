package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Администратор on 31.01.2017.
 */
public class PoiskPoStroke {


    public static void main(String[] args) {

        String tect = "Поиск также можно произвести с указанием позиции для в строке от которой нужно начинать искать. Для поиска нужно указать соответствующие параметры.";
        String poiskPoSlovu = "для";
        poiskPoStrkokam(tect,poiskPoSlovu);
    }

    public static void poiskPoStrkokam (String poisk, String str){
        String tempPoiskaStroci = " ";

      if (poisk.contains(str) ){
          System.out.println("Нужное слово найдено!");
          tempPoiskaStroci = "Вы искали "+"'" +str+"'";
          System.out.println(tempPoiskaStroci);
      }
        else {
          System.out.println("Поиск не увенчался успехом.");
      }

        // Работа с датой.
        Date myDate = new Date();
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat("'Текущая Дата: 'E dd.MM.yyyy'\nВремя поиска: ' hh:mm:ss");

        // Работа с сохранением данных в файл
        // укаываем в строк место и имя файла в котором будем сохранять историю и дату изменений
        String mestoSohranenia = "C:\\zadachki\\PoiskPoStroke.txt";

        // создадим метод для отлова исключительных ситуаций.
        try (FileWriter writer = new FileWriter(mestoSohranenia, true)) {
                // Создали обьект типа  mestoSohranenia для работы с записи текстовых файлов
                //Класс FileWriter является производным от класса Writer.

            writer.append("Запись поисковых данных в файловых текстовой файл....");
            writer.append("\n");
            writer.append(mySimpleDateFormat.format(myDate));
            writer.append("\n");
            writer.append(" ");
            writer.append("Результаты поиска = ");
            writer.append(tempPoiskaStroci);
            writer.append("\n");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}// конец класса

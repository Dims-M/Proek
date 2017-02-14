package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Администратор on 01.02.2017.
 */
public class ChenieIz_Faila2 {

    public static void main(String[] args) {

        chenieIzFaila ();

    }


    public static String chenieIzFaila (){

        System.out.println("Чтение из текстого файла");

        // место хранение файла
        String mestoHranenieFaila = "C:\\zadachki\\testNaChenie.txt";

        // Строка для хранения и вывода строк из хайла
        String strokaTemp = " ";

        try {

        // обьект для работы с файлами.
        FileInputStream fileInputStream = new FileInputStream(mestoHranenieFaila);

            //Cпециальный метод для чтения из файла
            BufferedReader chenie = new BufferedReader(new InputStreamReader( fileInputStream));

            // Детализация цикла
            // Цикл проходит по текстовому файлу который передан через параметры chenie.readLine()
            // Записывает в строковую переменную strokaTemp поотсторочно все строки которые есть в файле.
            // Как только достигнет пустого или незаполненного места. То цикл прекратится.
            while ((strokaTemp = chenie.readLine()) != null){
                System.out.println(strokaTemp);
            }

        }
        // Выводы при ошибке
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Однако Ошибка.....");
        } catch (IOException e) {
           // e.printStackTrace();
        }

        zapicTextovogoFaila(Date_zapisatV_Fail (),mestoHranenieFaila);
        return strokaTemp;
    }


    public static void zapicTextovogoFaila (String stroka, String istocnik ){
        // Параметры: 1 что записывать, 2 куда записывать

        // Детализация инструкций метода try
        // создаем обьект для работы и записи данных в файл
        try (FileWriter writer = new FileWriter(istocnik, true)) {

            // запись всей строки
            String text = stroka;
            writer.append('\n');
            writer.write(text);
            // запись по символам
            writer.append('\n');

           // writer.append(Date_zapisatV_Fail ());
            writer.append('\n');
            writer.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            System.out.println("Произошла ошибка при записи...");
        }

    }

    public static void zapicDannihIzMassiva(String stroka, String istocnik ){
        // Параметры: 1 что записывать, 2 куда записывать

        // Детализация инструкций метода try
        // создаем обьект для работы и записи данных в файл
        try (FileWriter writer = new FileWriter(istocnik, true)) {

            // запись всей строки
            String text = stroka;
           // writer.append('\n');
            writer.write(text);
            // запись по символам
         //   writer.append('\n');

            // writer.append(Date_zapisatV_Fail ());
            writer.append('\n');
            writer.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            System.out.println("Произошла ошибка при записи...");
        }

    }

    public static String Date_zapisatV_Fail (){
       System.out.println("Запись даты в файл");


        // Работа с датой
        Date myDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'Дата записи: 'E dd.MM.yyyy' Время: ' hh:mm:ss");
        String vozvrat = simpleDateFormat.format(myDate);
        return vozvrat;


    }



}// конец класса майн

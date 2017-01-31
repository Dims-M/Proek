package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Администратор on 30.01.2017.
 */
public class SchetSimvolov {

    public static void main(String[] args) {

        rascetSimvolov("123 1 25 2");

    }

    public static void rascetSimvolov (String string){
        System.out.println("Подсчет символов в строке");
        int countStase = 0;
        for (int i = 0; i<string.length(); i++){

            if (string.charAt(i) == ' '){
                countStase++;
            }

        }
        String vivid = "Длина строки = "+string.length()+ " Количество пробелов = "+countStase;
        System.out.println(vivid);

        // Обьект для работы с датой.
        Date moiaData = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("'Текущая Дата: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");
        // Обьект для вывода форматированой даты

        // указываем место хранение текстового файла Обращений
        String istocnik = "C:\\zadachki\\SchetSimvolov.txt";

        try (FileWriter writer = new FileWriter(istocnik, true)) {
            // запись всей строки
            String text = vivid;
            writer.append('\n');
            writer.write(text);
            // запись по символам
            writer.append('\n');
            // writer.append(currentDate.toString());
            //writer.append('\n');
            // ввод даты
            writer.append(dateFormat.format(moiaData));
            System.out.println("Данные записаны...");
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

       // System.out.println(vivid);

    }

}

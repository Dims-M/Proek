package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.*;

/**
 * Created by Администратор on 17.02.2017.
 */
public class MyCollection {

    static String istochnik = "C:/zadachki/moscow-buildings.csv";

    public static void main(String[] args) {

        chenieFailof(istochnik);

    }


    public static void chenieFailof (String istochnik){
        // чтение из файлов

        try {
            // создаем объект для чтения файла

            //использовать для записи байтов в файл
            FileInputStream stream = new FileInputStream(istochnik);

            // для считывания байтов из обьекта stream указываем размер для массива байтов
            int length = stream.available();

            // для считывания байтов из обьекта stream
            // Создавем масив для записи покока байтов
            byte[] data = new byte[length];

            // Чтение из массива
            stream.read(data);

            //для вывода в консоль присваиваим в стринг
            //Создаем обьект типа стринг и в качестве параметров указываем массив data
            String text = new String(data);

            System.out.println(text);

            String info1 = "Содержимое файла "+istochnik;
            String info2 = "Длина битового массива "+ data.length;
            String info3 = "********************";

            System.out.println(info1);
            System.out.println(info2);
            System.out.println("info3");
            //FileReader reader = new FileReader(String.valueOf(stream));

            //*/*********************************************************************
            // Запись данных в файл
            // Создаем объект для записи данных в текстовой файл
            FileWriter writer = new FileWriter("C://zadachki//LogZapisi.txt");

            // запись всей строки
            writer.write(info1);
            writer.write(info2);
            writer.write(info3);
            writer.write(text);


            // **********************************

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения при открытии файла   ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка определения длины потока ");
            e.printStackTrace();
        }

    }

}

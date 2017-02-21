package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Администратор on 17.02.2017.
 */
public class MyCollection {

    static String istochnik = "C:/zadachki/moscow-buildings.csv";

    public static void main(String[] args) {

       // chenieFailof(istochnik);
        zapis_I_Sozdanie_Faila ();

    }


    public static void chenieFailof (String istochnik){
        // чтение из файлов

        try {

            // создаем обьект для Работы с датой.
            // Для Вставки даты в лог

            // 1) создали обьекта для работы с датой
            Date myDate = new Date();

            //2) Создаем обьет для форматирования и вывода даты. В параметра задаем  формат нужного вывода.
            SimpleDateFormat myFormatDaty = new SimpleDateFormat("'ДАТА: 'E dd.MM.yyyy' Time: ' hh:mm:ss \n");

            //3) Выводим просто дату
            String tekushaiaData = myDate.toString();
            //4) Вывод отформатированую дату
            String tekushaiaFOrmatData = myFormatDaty.format(myDate);
            // System.out.println("Formatted current date:\n" + dateFormat.format(currentDate));

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
            String Formattext = new String(data);

            System.out.println(text);

            String info1 = "Содержимое файла "+istochnik+"\n";
            String info2 = "Длина битового массива "+ data.length +"\n";
            String info3 = "******************** \n";

            System.out.println(info1);
            System.out.println(info2);
            System.out.println(myDate);
            System.out.println(info3);
            //FileReader reader = new FileReader(String.valueOf(stream));

            //*/*********************************************************************
            // Запись данных в файл
            // Создаем объект для записи данных в текстовой файл
            FileWriter writer = new FileWriter("C://zadachki//LogZapisi.txt");

            // запись всей строки
            writer.write(info1);
            writer.write(info2);
            writer.write(info3);
          //  writer.write(tekushaiaData);
            writer.write(tekushaiaFOrmatData);
            writer.write(text);
           // writer.write(tekushaiaData);
           // writer.write(tekushaiaFOrmatData);
            //writer.write(text);
           // writer.write(tekushaiaData);
           // writer.write(tekushaiaFOrmatData);
            // **********************************



        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения при открытии файла   ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка определения длины потока ");
            e.printStackTrace();
        }

    }


    public static void zapis_I_Sozdanie_Faila()  {

        try {

        System.out.println("Введите имя сохранения");
        Scanner scanner1 = new Scanner(System.in);
        String nameFile1 = scanner1.nextLine();

        System.out.println("Введите нужный текст и нажмите ЕНТР");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();


         String failIstochnik = "C:\\zadachki\\"+nameFile1+".txt";

            // Создали обьект для записи файла
            File myFale = new File(nameFile1);

            // проверяем. Если файл с таким именем не существует то создаем новый файл
            if (!myFale.exists()) {
                myFale.createNewFile();
            }

            // Работа с датой
            Date myData = new Date();
            // создаем обьект для форматирования даны(с помощью патерна(шаблона))
            SimpleDateFormat simpleFormatData = new SimpleDateFormat("'ДАТА Cоздания: 'E dd.MM.yyyy' Time: ' hh:mm:ss \n");
            String vivodDate = simpleFormatData.format(myData);

            // Создаем обьект для записи файла в текс. Указываем путь записи
            FileWriter myWriter = new FileWriter(failIstochnik,false);

            // Запись текста в файл
            myWriter.write(tekst);
            myWriter.write(vivodDate);


        } // конец экшепшена

    catch (FileNotFoundException e) {
        System.out.println("Ошибка чтения при открытии файла   ");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Ошибка определения длины потока ");
        e.printStackTrace();
    }

        finally {
           System.out.println("Закрытия программы....");
        }

    } // конец метода

}

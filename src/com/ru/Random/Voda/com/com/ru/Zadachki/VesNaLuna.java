package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Администратор on 30.01.2017.
 */
public class VesNaLuna {

    public static void main(String[] args) {

        // raschetDoLuni();
        prosmotrIstoriiLuna();

    }

    public static void raschetDoLuni() {
        System.out.println("Расчет вашего веса на луне!");

        Scanner name = new Scanner(System.in);
        Scanner ves = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String names = name.nextLine();
        System.out.println("Введите ваш вес и нажмите ЕНТР");
        int zemnoiVes = ves.nextInt();

        // Обьект для работы с датой.
        Date moiaData = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("'Текущая Дата: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");
        // Обьект для вывода форматированой даты

        double temInt = zemnoiVes * 0.17;
        String tempHistiri = "";
        String vivid = "Дорогой " + names + "На земле ваш вес = "+zemnoiVes + "А луне был бы равен = " + temInt + " килограммов";

        // указываем место хранение текстового файла
        String istocnik = "C:\\zadachki\\vesNaLune.txt";
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

        System.out.println(vivid);

    } //  Конец метода расчет.


    public static void prosmotrIstoriiLuna() {

        System.out.println("Просмотр истории расчетов");
        String istocnik = "C:\\zadachki\\vesNaLune.txt";

        try (FileReader reader = new FileReader(istocnik)) {

            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);

            }
            // Вывод в случае ошибки.
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка");
        }


    }
}
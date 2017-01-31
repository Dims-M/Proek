package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by Администратор on 31.01.2017.
 */
public class UvelichenieMassivaNaX {

    public static void main(String[] args) {

        int [] massivi  = new int[10];
        randomMassivInt(massivi);
        uvelichenieMassiva (10,massivi);


    }

    public static void uvelichenieMassiva (int znach, int massiv []){

        String fileName = "C:\\zadachki\\UvelichenieMassivaNaX.txt";
        String text;
        String NachalniyMassivText;

        System.out.println("Метод увеличивающий массив на заданное количесвто %");

        System.out.println("Содержимое переданного массива = ");
        for (int temp: massiv){
            System.out.print(" " +temp);
        }

        System.out.println("\n Увеличиваем значение массива на "+znach +"% \n");

        for (int i = 0; i < massiv.length;i++){
            int tempMass =  massiv[i];
            // привидение типов.
           massiv[i] = (int) ( tempMass + (tempMass * 0.10));
        }

        System.out.println("Содержимое переделанного массива = ");
        for (int temp: massiv){
            System.out.print(" " +temp);
        }

        System.out.println(" \n Конвертировали массив в тим Double");

        double [] massivDoble = new double[znach];

        for (int i = 0; i < massiv.length ; i++){
            double tempMass = massiv[i];
            massivDoble[i]  = (tempMass + (tempMass * 0.10));
        }
        System.out.println("\n Содержимое конвертированного массива = ");
        for (double tempDoble: massivDoble){
            System.out.print(" " +tempDoble);
        }

        System.out.println(" \n Сохранение данных в файл.");

        // Работа с датой!!!!!
        Date myData = new Date();
        SimpleDateFormat myFormatDati = new SimpleDateFormat("'Текущая Дата: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");

        // Создание файла и сохраннения данных в файл

        //Определяем файл
        File file = new File(fileName);
        text = Arrays.toString(massivDoble);
        NachalniyMassivText = Arrays.toString(massiv);

        try { FileWriter writer = new FileWriter(fileName, true);
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

            // запись всей строки
            writer.append(" \n Содержимое массива:");
            writer.append(" \n Содержимое первоночального массива:");
            writer.append(NachalniyMassivText);
            writer.append('\n');
            writer.append(" \n Содержимое увеличенного массива на " + znach+ ":");

            writer.append(" \n Содержимое массива:");
           // writer.append('\n');
            writer.write(text);
            // запись по символам
            writer.append('\n');
            // writer.append(currentDate.toString());
            //writer.append('\n');
            // ввод даты
            writer.append(myFormatDati.format(myData));
            System.out.println(" Данные записаны...");
            writer.append('\n');
            writer.flush();


        }

        catch (IOException ex){

            System.out.println("Ошибка");
        }
    }// конец массива


    public static void randomMassivInt (int massiv []){

        Random random = new Random();

        for (int i = 0; i < massiv.length; i++  ){
            massiv[i]= random.nextInt(100);
        }

    }



}

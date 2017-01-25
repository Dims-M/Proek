package com.ru.Random.Voda;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Администратор on 25.01.2017.
 */
public class ChenieIsFaila {

    public static void main(String[] args) {

        System.out.println("Запись данных из файла");

        Scanner scannerVvod = new Scanner(System.in);

        System.out.println("Напишите что вам нужно.");

        String vvodTexta =  scannerVvod.nextLine();

      //  Так, в конструктор редается либо путь к файлу в виде строки, либо объект File, который ссылается на конкретный текстовый файл.
       // Параметр append указывает, должны ли данные дозаписываться в конец файла (если параметр равен true),
        //либо файл должен перезаписываться.

        try(FileWriter writer = new FileWriter("C:\\tempLog.txt", true))
        {
            // запись всей строки
            String text = vvodTexta;
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('*');
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }




    }  // конец майла


    public static void zapisFaila (){

        System.out.println("Запись данных из файла");

        Scanner scannerVvod = new Scanner(System.in);

        System.out.println("Напишите что вам нужно.");

        String vvodTexta =  scannerVvod.nextLine();

        //  Так, в конструктор редается либо путь к файлу в виде строки, либо объект File, который ссылается на конкретный текстовый файл.
        // Параметр append указывает, должны ли данные дозаписываться в конец файла (если параметр равен true),
        //либо файл должен перезаписываться.

        try(FileWriter writer = new FileWriter("C:\\tempLog.txt", true))
        {
            // запись всей строки
            String text = vvodTexta;
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('*');
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


}// конец класса

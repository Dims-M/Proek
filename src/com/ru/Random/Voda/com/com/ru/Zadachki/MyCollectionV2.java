package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Администратор on 06.03.2017.
 */
public class MyCollectionV2 {


    public static void main(String[] args) {

        infaO_Collection ();

    } // конец майла





    public static void infaO_Collection () {
        System.out.println("Справка о Колеккиия в JAVE");

        Scanner scanner1 = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        boolean proverka = true;

        try {
            while (proverka) {
                //Exception in thread "main" java.util.InputMismatchException
                System.out.println("Выберите из списка что вам нужно. И нажмите ENTER");
                System.out.println("" +
                        "1) -Определение Mассива \n" +
                        "2)- Определение Коллекции \n" +
                        "" +
                        "0) Выход \n");

                int viborV_menu = scanner1.nextByte();


                String opredelenie_XXX = " ";
                String opredelenie_Massiva = "Массив это обьект(хранилище) для хранения однотипных наборов обьектов. Основной минус массивов это ограниченная длина. Указанная при создании массива \n ";
                String opredelenie_Collection = "Колеккция - это структуированое хранилище(или обьект) для хранения наборов однотипных обьектов." +
                        "Структура колекции зависит от её типа." +
                        "Коллекции не могут хранить примитивные обьекты  \n";


                switch (viborV_menu) {

                    case 1: {
                        System.out.println(opredelenie_Massiva);
                        break;
                    }

                    case 2: {
                        System.out.println(opredelenie_Collection);
                        break;
                    }


                    case 0: {
                        System.out.println("Выход...");
                        proverka = false;
                        break;
                    }
                    default:
                        System.out.println("Вы нажали неизвестную букву");


                } // конец свича инт

            } // конец цикла вайла
        }
        catch ( InputMismatchException ex){
            System.out.println("Вы ввели буквенные значения. Необходимо ввести числовые значения \n");
            System.out.println("Программа  будет закрыта.....");
        }
    }   // конец метода infaO_Collection}


} // конец класса

package hz.poKnigeShilda;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 06.12.2016.
 */
public class RabotaS_Massivami {

   public static String infaOKlasse =" Класс для работы с массивами и содержит различные методы для работы с массивами!" ;

    public static void vivod_Dannih_Massiva(int [] mass) {
        for (int temp : mass) {
            System.out.println("Вывод содержимого массива : " + temp);
        }
    }

    public static int[] randomIntMassiva (int mass []){

        for (int i =0; i<mass.length; i++ ){
            Random random = new Random();

            int tempInt = random.nextInt(1000);

            mass[i] = tempInt;

        }
        System.out.println("Заполнение массива случайными числами завершено");
        return mass;
    }
    public static int schetIntovihMassivof (int[] mass){
        int temp = 0;

        for ( int poschitat: mass){

            temp  += poschitat;
        }
        System.out.println("Подсчет окончен");
        return temp;
    }

    public static void vivodMnogomernogoMassiv (int [] massib1 []){

        for (int tempMassiv [] : massib1){
            for (int asd: tempMassiv){
                System.out.println("Содержимое многомерного массива = " + asd);

            }
        }
    }

    public static void poiskPoZnacheniy (int mass[] ,int znach ){
        System.out.println("Выполняется поиск.....Ищется значение "+ znach);
        int index1 = 0;
        for (int temp: mass){
            index1 += index1;
            if (temp == znach){
                System.out.println("Найдено "+temp);
                break;
            }
        }
        System.out.println("Поиск завершен найдено "+znach+"на позиции"+ index1);

    }


    public static void poiskPoZnacheniyString (String mass[] ,String znach ){
        System.out.println("Выполняется поиск.....Ищется значение "+ znach);
        int index1 = 0;
        boolean proverka = false;

        for (String temp: mass){
            index1 += 1;
            if (temp == znach){
                System.out.println("Найдено "+temp);
                proverka = true;
                break;
            }
        }
        if (proverka)
        System.out.println("Поиск завершен найдено "+znach+" на позиции "+ index1);
    }

    public static void poiskPoZnacheniyStringSkaner (String [] mass){
        System.out.println("введите слово для поиска и нажмите ЕNTER");
        Scanner scanner = new Scanner(System.in);
        String scanerTemp = scanner.nextLine();
        int count =0 ;
        boolean proverka = false;


        System.out.println("Происходит поиск...Значения "+scanerTemp);

        for (String str: mass ){
            count = count+1;

            if (str == scanerTemp){

                System.out.println("Нужное значение найдено: " + "Нужное вам значение находится в индексе = "+ count);
                proverka = true;
                break;
            }



        }

        if (proverka){
            System.out.println("Поиск завершен");
        }


    }


    public static int[][] randomIntMassivaDvuhmernoho (int mass [][]) {
        int tempInt =0;

        Random random = new Random();
        tempInt = random.nextInt(2);

        for (int i = 0; i< 5 ;i++) {
            for (int j = 0; j <2; i++ ) {


                mass[i][j] = tempInt;
            }
        }
        System.out.println("Заполнение массива случайными числами завершено");
        return mass;

    }
} //конец класса

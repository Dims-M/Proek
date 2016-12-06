package hz.poKnigeShilda;

import java.util.Random;

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

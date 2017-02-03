package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.util.Random;


public class vsakoRaznoeMetodi {


    public static void main(String[] args) {

        //System.out.println(SlozenieChisel(100,500));
       // System.out.println( MaxIMinimumChislo(SlozenieChisel(100,500), 500));

        //System.out.println( vivodMassivovInt(random_Massiva(sosdanieMassiva(10))));

        System.out.println( slozenieMassivah(vivodMassivovInt(random_Massiva(sosdanieMassiva(100))))) ;

    }

    public static int SlozenieChisel(int pervoeChislo, int vtoroeChislo ){
        System.out.println("Сложение двух чисел "+ pervoeChislo+ " и "+ vtoroeChislo);

        int sum = pervoeChislo + vtoroeChislo;
        return sum;
    }

    public static int SlozenieChisel(int pervoeChislo, int vtoroeChislo, int tretieChislo ){
        System.out.println("Сложение двух чисел "+ pervoeChislo+ " и "+ vtoroeChislo );

        int sum = pervoeChislo + vtoroeChislo + tretieChislo;
        return sum;
    }

    public static int MaxIMinimumChislo (int pervoeChislo, int vtoroeChislo ){
        System.out.println("Определение Максимального и Минимального значения");

        int min, max = 0;

        if (pervoeChislo > vtoroeChislo){
            max = pervoeChislo;
        }
        else {
            min = vtoroeChislo;
        }
     return max;

    }


    public static int [] random_Massiva ( int massiv []) {
        System.out.println("Рандомное заполнение массива");



        for (int i = 0; i < massiv.length; i++) {
            Random myRandoMassiva = new Random();

            int tempMassiv = myRandoMassiva.nextInt(100);

            // Random myRandoMassiva = new Random();

            //int tempMassiv = myRandoMassiva.nextInt(1000);
            massiv[i] = tempMassiv;
           // System.out.println(massiv[i]);

        }
        return massiv;
    }

    public static void vivodMassivovInt (int massiv []){

        System.out.println("Вывод содержимого массива");

        for (int tempMassiva : massiv){
            System.out.println(tempMassiva);
        }
       // return "Выполнено";
    }


    public static int[] sosdanieMassiva (int dlina){

        int [] massim = new int[dlina];

        return massim;
    }

    public static int slozenieMassivah (int mas[]) {

        int rezultat = 0;

        for (int temp : mas) {

            rezultat += temp;
        }
        return rezultat;
    }


} // конец класса

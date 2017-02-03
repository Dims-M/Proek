package com.ru.Random.Voda.com.com.ru.Zadachki;

/**
 * Created by Администратор on 03.02.2017.
 */
public class vsakoRaznoeMetodi {


    public static void main(String[] args) {



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

}

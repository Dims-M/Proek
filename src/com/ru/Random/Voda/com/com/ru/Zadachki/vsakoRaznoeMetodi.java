package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.util.Random;
import java.util.Scanner;

import static com.ru.Random.Voda.com.com.ru.Zadachki.ChenieIz_Faila2.zapicTextovogoFaila;


public class vsakoRaznoeMetodi {


    public static void main(String[] args) {

        //System.out.println(SlozenieChisel(100,500));
       // System.out.println( MaxIMinimumChislo(SlozenieChisel(100,500), 500));

        //System.out.println( vivodMassivovInt(random_Massiva(sosdanieMassiva(10))));

        int[] temp = random_Massiva(sosdanieMassiva(10)) ;
        vivodMassivovInt(temp);
        SlojeieMassivaS_ParametromPeremennoiDlini (temp);
        vivodMassivovInt(temp);
        //*****
      //  System.out.println(vizovI_RaschetFactoriala ( temp.length));
     //   System.out.println(vizovI_RaschetFactoriala ( 5));
      //  rabotaSoStrokamiFormatirovanie();
        /////************************
       // rabotaSoSkanerom ();

        /// создание и вывод в консоль обьекта
        sozdanieObekta ("Руслан", "Большой", 27);



    }

    public static void sozdanieObekta (String name, String opit, int vozrast){
        System.out.println("Происходит создание обьекта");
        Human human1 = new Human(name, opit,vozrast);

        System.out.println(human1.toString());

    }



    public static void vivodObekta (Object object){
        Object myobject = new Object();
        myobject = object;


    }

    public static void rabotaSoSkanerom (){
        System.out.println("Работаем с вводом данных с консоли.");

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Введите что хотите и нажмите Ентр");

        String muStroca = myscanner.nextLine();

        System.out.println("Вы ввели "+muStroca);
        //*******
        System.out.println("Что вы хотите сделать с это строчкой?" +
                "Введите:" +
                "1 Для подсчета количества символа встроке" +
                "2 Для сохранения введенной строки в файл" +
                "3 Для Вывода на консоль" +
                "4 Для выхода из программы");

        Scanner intScaner = new Scanner(System.in);
        int tempVibor = intScaner.nextInt();
        String tempChislo = intScaner.nextLine();

        switch (tempVibor){
            case 1:{
                System.out.println("Количество символов в строке " + muStroca +" Равно = "+muStroca.length());
                break;
            }

            case 2: {
                String mestoZapisi = "C:/zadachki/zapisScanera.txt";
                System.out.println("Происходит запись введеного в файл");
                zapicTextovogoFaila(muStroca,mestoZapisi);
                break;
            }

            case 3: {
                System.out.println("Вы написали "+ muStroca);
                break;
            }

            case 4: {
                System.out.println("Выход из программы...");
                break;
            }

        }

        System.out.println("Программа завершила свою работу...");

    }

    public static void rabotaSoStrokamiFormatirovanie(){
        System.out.println("Работа с форматирование строк.");

        int a=100;
        String string = "строка";
        double double1 = 10.5;
        char simvol = 'S';

        System.out.println();
        System.out.printf("Выводим интовое значение переменной а: "+"%d",a );
        System.out.println();
        System.out.printf("Выводим Строковое значение переменной string: "+"%s ",string);
        System.out.println();
        System.out.printf("Выводим Символьное значение переменной simvol: "+"%c ",simvol);
        System.out.println();
        System.out.printf("Выводим Числовое значение с плащающей точкой  переменной double1:"+"%f ",double1);


    }

    public static int vizovI_RaschetFactoriala ( int znach){
        System.out.println("Расчет факториала");
        System.out.println("Вы ввели значение "+znach);
        System.out.println("Происходит расчет и вывод факториала");

        int rezultat = 1;

        for (int i = 1; i <znach; i++){
            rezultat *= i;
            // высчитываем результат
        }
        return rezultat;
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

    public static int vivodMassivovInt (int massiv []){

        System.out.println("Вывод содержимого массива");

        for (int tempMassiva : massiv){
            System.out.println(tempMassiva);
        }
        return 1;
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

    public static void SlojeieMassivaS_ParametromPeremennoiDlini (int...mass){

        System.out.println("Сложение инотовго массива");
        int tempInt = 0;
        for (int i = 0; i < mass.length; i++){
         tempInt += mass[i];
            mass[i]=tempInt;

        }
        System.out.println("Завершено");
    }



} // конец класса

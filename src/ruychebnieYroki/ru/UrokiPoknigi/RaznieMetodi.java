package ruychebnieYroki.ru.UrokiPoknigi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on xx.07.2016.
 */
public class RaznieMetodi {

static public int summaChisla (int a, int b){

    System.out.println("Cложене двух чисел.");

    int rezultat = a+b;

    return rezultat ;
}

    public static void razdelitel (){
        System.out.println("*//*/*/*/*/*/*/*/*//*/*");
    }

    static public void histori (int a ) {

        int histori[] = new int[10];

        if (a > 0) {
            histori[0] = a;

            System.out.println("Сохраненое значение в памяти = " + histori[0]);
        }

        if (a<=0){
            System.out.println("Значение не коректно!!!! Число меньше или равно 0");
            histori[9] = a;
            System.out.println("Сохраненое значение в памяти = " + histori[0]);
        }
            else {
            System.out.println("НЕ предвиденая ошибка.......");
            System.out.println("Данные будт записанны в лог");
        }
    }

    static public void prochitatHistoria (){
      // ****************************************************************
    }

    static public void  summaChisla1 (){

        System.out.println("Cложене двух чисел.");
        System.out.println("Введите Два числа которые нужно сложить");

        System.out.println("Теперь введите первое числое ");

        Scanner scanner = new Scanner(System.in);
        int chislo = scanner.nextInt();

        System.out.println("Теперь введите второ числое ");
        Scanner scanner1 = new Scanner(System.in);
        int chislo1 = scanner.nextInt();

        int rezultat = chislo+chislo1;


        int temp = rezultat;

        histori (temp);

        System.out.println("Результат = " + rezultat);

        System.out.println("Результат был сохранен!!! Хотите посмотреть? Если да нажмитите 1 если нет то 2");

        Scanner scanner2 = new Scanner(System.in);
        int chislo2 = scanner.nextInt();

        switch (chislo2){

            case 1:{
                System.out.println("Результат ранних вычислений равен " + temp);
                break;
            }
            case 2: {
                System.out.println("Программа закончила свою работу.");
            }
        }

    }


    public static void rabotaSDatoi() {

        Date data = new Date();
        System.out.println("Текущая дата " + data + "\n");

        Date data1 = new Date(15082016);

        System.out.println(data1.before(data));
        System.out.println(data1.getTime());

        Date data2 = new Date();
        System.out.println(data2.toString());

        System.out.println("Сравним 2 даты");

        if (data.equals(data)) {
            System.out.println("Две даты равны");
        } else System.out.println("Даты не равны!!!");
        //System.out.println(data.equals(data));

        System.out.println("Используем для вывода класс SimpleDateFormat");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'Date: 'E dd.MM.yyyy'\nTime: ' hh:mm:ss a zzz");

        System.out.println(simpleDateFormat.toString());

        //  System.out.println(DateFormat.format(simpleDateFormat));

    }


    public static void rabota123() {

        String inputString = "This is simple that contains phone number 2684815 That's great.";
        String pattern = "(\\d+)";

        try { // для ловли ошибок и исключений

            Pattern ptrn = Pattern.compile(pattern);
            Matcher matcher = ptrn.matcher(inputString);

            if (matcher.find()) {
                System.out.println("Номер телефона: " + matcher.group(0));
            } else {
                System.out.println("Телефон не указан");
            }
        } catch (IllegalArgumentException e){ // Какую и менно ошибку мы  перехватываем
            System.out.println("Ошибка не правильно введены данные"+ e);
        }


    }



}

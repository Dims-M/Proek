package ruychebnieYroki.ru.UrokiPoknigi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Администратор on 12.01.2017.
 */
public class vsakoRaznoe {

    public static void main(String[] args) {

        rabotaS_Date ();


    } // конец метода майн



    public static void rabotaS_Date (){
        System.out.println("Работа с датой и временем");

        Date date = new Date ();
        Date date2 = new Date ();
        Date date3 = new Date ();
        date2 = date;


        System.out.println("Текущие время:"+date.toString());

        if (date.equals(date3)){
            System.out.println("Даты равны");
        }
        else {
             System.out.println("Даты не равны");
        }

        System.out.println("Прошло время с 1970 года в милесекундах " + date.getTime());
        // метод date.getTime() получает время в милесекундах сколько прошло времени с 1970 года

        System.out.println("********");
        sravnenie_I_vivid_Date(date,date3);


        // Также работать с датой можно с помощью метода SimpleDateFormat

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println("Сравниваем даты  "+  simpleDateFormat.equals(date));

        // Вывод содержимого обьекта с помощью метода ТУстринг
        System.out.println(simpleDateFormat.toString());
        date.toString();
        // Нужно переопределять метод Тустринг!!

        // Вывод с помощью форматирования
        System.out.println("Текущая дата = "+ simpleDateFormat.format(date));





    } // конец метода


    public static void sravnenie_I_vivid_Date (Date object1, Date object2){

        System.out.println("Сравнение двух Дат ");

        if (object1.equals(object2)){

            System.out.println("Даты равны");

        }
        else {
            System.out.println("Даты не равны");
        }
    }



}

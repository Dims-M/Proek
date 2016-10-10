package ruychebnieYroki;

import java.io.IOException;

import static ruychebnieYroki.MoiMetodi.*;
import static ruychebnieYroki.ru.UrokiPoknigi.ru.VsakieClassi.Tempp.go;

/**
 * Created by Администратор on 22.05.2016.
 */
public class Main {

    static String gloalString ="Глобальная строкковая переменная. Почти константа" ;

    public static void main(String[] args) throws IOException { // Точка входа

        // Переменные
        int x = 10;
        int y = 100;
        int z = 200;

        String str1 = "Моя строка";

        // Методы из класса public class MoiMetodi

        MoiMetodi.myMetodi(); // войд метод. Не передае ни каких знаений
        MoiMetodi.myStroka();
        MoiMetodi.myStrokaSparametrami(gloalString); // Передаем  строковый парметр


        // Создаем Объекты

        PodClassMetodov testClas = new PodClassMetodov(); // Создали экземпляр Объекта PodClassMetodov. И указали ссылку в куче.
        testClas.myRadelitel();   // Запускаем методы из Родительского класса!!!! public class MoiMetodi
        testClas.myStrokaSparametrami("запуск строки из дочернего метода PodClassMetodov !!!!");

        // Метод перегрузка
        testClas.myPERegruzka("123");
        testClas.myRadelitel();

        // Cоздание объектов через методы
        mySozdanieCara();

        // Cоздаем файлы через методы
        mysozdanieFile ();

        myfailDIR ();

        // Чтение через консоль
       // MyReadString ();

        //Чтение файлов
        //myReadFile();

        // Работа с Arrey Listom
        myArrayList ();

        // Работа с Временем Time
        myRabotaSTime ();

        //Работа с форматом даты и чисел
        myRabotaSTimeFormatirovaanie ();

        myRabotaSTimeFormatirovaanieTime ();


        go();
    }





}

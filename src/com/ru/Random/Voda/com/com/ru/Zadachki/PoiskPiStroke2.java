package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Администратор on 01.02.2017.
 */
public class PoiskPiStroke2 {

    public static String tekst = "Класс File Reader наследуется от 123456 абстрактного класса Reader и предоставляет функциональность для чтения текстовых файлов.";

    public static void main(String[] args) {

        ChenieIz_Faila2 chenieIz_faila2 = new ChenieIz_Faila2();
        poiskPoStrke("Reader", tekst);

    }

    public static void poiskPoStrke(String ichem, String istochik) {

        String temIstochnik = istochik;
        System.out.println(istochik);

        System.out.print("Ищем по строке заданый параметр " + "'" + ichem + "'");

        try {


            for (int i = 0; i < 10; i++) {
                System.out.print(".");
            }
            // Строка с патерном(шаблоном)
            String pattern1 = "(\\d+)"; // Шаблон для чилового поиска
            String pattern2 = ichem;

            // классы
            // Pattern - Класс Pattern предоставляет нам скомпилированный вариант регулярного выражения
            // Matcher - Этот клсс интерпретирует шаблон и предоставляет определяет совпадения в водимой строке.
            // PatternSyntaxException - Этот класс предоставляет нам непроверяемые исключения, которые указывают нам на синтаксическую ошибку в нашем регулярном выражении

            // Создаем обьект класса паттерн для созлания и работы шаблона
            // И казываем в качестве параметра строковую переменную с шаблоном.
            Pattern myPatern = Pattern.compile(pattern2);

            // обьект для работы с переменном(файлом). Там где нудно искать.
            Matcher myMatcher = myPatern.matcher(temIstochnik);

            if (myMatcher.find()) {
                System.out.println("Найдено " + myMatcher.group());
            }
            //System.out.println("Найдено " + myMatcher.group());
            else {
                System.out.println("По заданным параметрам ничего не найдено!");
                // System.out.println("Найдено " + myMatcher.group());
            }

        }
        catch (PatternSyntaxException ex){
            System.out.println("Какая Ошибка однако...");
        }


    }
}
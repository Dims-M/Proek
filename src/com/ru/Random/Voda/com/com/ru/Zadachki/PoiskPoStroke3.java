package com.ru.Random.Voda.com.com.ru.Zadachki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 02.02.2017.
 */
public class PoiskPoStroke3 {

    static String istochnuk = "" +
            "Регулярные выражения представляют мощный инструмент для обработки строк, который может использоваться в дополнение к методам класса String. " +
            "В java функциональность регулярных выражений сосредоточена в пакете java.util.regex.";

    static String choIchem = "java";

    public static void main(String[] args) {

        poiskPoStroke (choIchem, istochnuk);

    }

    public static void poiskPoStroke (String poisk, String istochnukPoiska){

        String adresssSohranenieIstorii = "C:\\zadachki\\rezultatiPoiskaPoStroke";
        System.out.println("Производим поиск по тексту...");

        // создаем обьект pattern класа Pattern для работы с шаблоном поиска.
        // метод Pattern.compile("Что ищем"); Статического метода compile(), который позволяет установить нужный нам шаблон.
        // compile("Что ищем") В параметрах указываем что мы ищем.
        Pattern pattern = Pattern.compile(poisk);

        // Создаем обьектную переменную matcher класса Matcher для работы с источником поиска.
        Matcher matcher =  pattern.matcher(istochnukPoiska);
        // В качестве параметра  pattern.matcher(istochnukPoiska) указываем где нам производить поиск

        // В булевскую переменную указываем истина если поиск завершился успешно.
        boolean proverka = matcher.matches();

        if (proverka){
            System.out.println("Поиск завершен");
            String tempStroka = "Вы искали "+ poisk;
            System.out.println(tempStroka);

            ChenieIz_Faila2 chenieIz_faila2 = new ChenieIz_Faila2();
            chenieIz_faila2.zapicTextovogoFaila(tempStroka,adresssSohranenieIstorii);
        }
        else {
            System.out.println("Поиск не удачный...Попробуйте изменить запрос");
        }

    } // конец метода поиск


}

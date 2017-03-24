package hz.poKnigeShilda;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by Администратор on 24.03.2017.
 */
public class temp {

  static   int [] proverochiMass = new int[10];

    public static void main(String[] args) {

        infaOClasse();

        //Рандомное заполнение массива
        RandomIntMassiva(proverochiMass);

        // сортировка массива
        sortirovkaMassiva(RandomIntMassiva(proverochiMass));

    }

    public static void infaOClasse (){
        String infaOclasee = "Класс для отработки всякого разного....\n";
        System.out.println(infaOclasee);
    }


    public static int [] RandomIntMassiva ( int Massiv []){

        int [] massivTemp  = new int[Massiv.length];

        for (int i= 0; i < massivTemp.length;i++ ){
        Random randomInt = new Random();
        massivTemp[i] = randomInt.nextInt(10);
    }

        // Вывод проверочного заполнения массива
//        for (int vivodTemp:massivTemp){
//            System.out.print(vivodTemp);
//        }
        return massivTemp;
    }


    public static void vivodIntMassiva (int corseMassiv []) {
        //Вывод интового массива
        // интовый массив
        for (int vivodTemp : corseMassiv) {
            System.out.print(vivodTemp);
        }
    }

    public static  int[] sortirovkaMassiva (int corseMassiv []){
        // сортировка массива
        vivodIntMassiva(corseMassiv);
        System.out.println("\n");
        Arrays.sort(corseMassiv);

        vivodIntMassiva((corseMassiv));
        return corseMassiv;
    }


    public static String myDate (){
        // Работа с датой
        Date myData = new Date();
        // создаем обьект для форматирования даны(с помощью патерна(шаблона))
        SimpleDateFormat simpleFormatData = new SimpleDateFormat("'ДАТА Игры: 'E dd.MM.yyyy' Time: ' hh:mm:ss \n");
        String vivodDate = simpleFormatData.format(myData);

        return vivodDate;
    }

    public static void zapisV_Log () {
        // запись файла
        String mestoHranenie = "C:\\zadachki";

        try {

            File myFile = new File(mestoHranenie);
            FileWriter writerZapis = new FileWriter(myFile, true);

            //// если файл не существует то созадем его
            if (!myFile.exists()) {
                myFile.createNewFile();
            }

            writerZapis.append("Запись в Лог........\n");
            writerZapis.append(myDate ());

            writerZapis.flush();
            writerZapis.close();


        } catch (Exception ex){
            System.out.println("Ошибка при создании(или записи) файла");
        }

    }

} // конец метода темп

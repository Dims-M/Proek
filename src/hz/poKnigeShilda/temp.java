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

    public static String infaOClasse (){
        String infaOclasee = "Класс для отработки всякого разного....\n";
        System.out.println(infaOclasee);
        return infaOclasee;
    }


    public static int [] RandomIntMassiva ( int Massiv []){

        int [] massivTemp  = new int[Massiv.length];

        for (int i= 0; i < massivTemp.length;i++ ){
        Random randomInt = new Random();
        massivTemp[i] = randomInt.nextInt(10);
    }
        return massivTemp;
    }


    public static void vivodIntMassiva (int corseMassiv []) {
        String tempStr = "";
        //Вывод интового массива
        // интовый массив
        for (int vivodTemp : corseMassiv) {
            System.out.print(vivodTemp);
            tempStr += String.valueOf(vivodTemp);
        }
         zapisV_Log (tempStr);
    }


    public static  int[] sortirovkaMassiva (int corseMassiv []){
        // сортировка массива
        vivodIntMassiva(corseMassiv);
       // zapisV_Log (infaOClasse());

        System.out.println("\n");
        Arrays.sort(corseMassiv);

       // zapisV_Log ("Тестовая запись");
        vivodIntMassiva((corseMassiv));

        return corseMassiv;
    }


    public static String myDate (){
        // Работа с датой
        Date myData = new Date();
        // создаем обьект для форматирования даны(с помощью патерна(шаблона))
        SimpleDateFormat simpleFormatData = new SimpleDateFormat("'ДАТА записи: 'E dd.MM.yyyy' Time: ' hh:mm:ss \n");
        String vivodDate = simpleFormatData.format(myData);

        return vivodDate;
    }

    public static void zapisV_Log (String strig) {

            // запись файла
            String mestoHranenie = "C:\\zadachki\\LogMassiva.txt";
            String slovo = "Запись в Лог";

            try {
                File myFile = new File(mestoHranenie);
                FileWriter writerZapis = new FileWriter(myFile, true);

                //// если файл не существует то созадем его
                if (!myFile.exists()) {
                    myFile.createNewFile();
                }

                writerZapis.append(slovo+"........\n");
                writerZapis.append(myDate());
                writerZapis.append("\n");
                writerZapis.append(strig);
                writerZapis.append("\n");

                writerZapis.flush();


            } catch (Exception ex) {
                System.out.println("Ошибка при создании(или записи) файла");
            }
        }




} // конец метода темп
